package xyz.acrylicstyle.mcutil;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import util.ICollectionList;
import xyz.acrylicstyle.mcutil.lang.MCVersion;
import xyz.acrylicstyle.mcutil.lang.test.IgnoreTest;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

// Tests version order by protocol version
@RunWith(Parameterized.class)
public class MCVersionTest {
    public static int tests = 0;
    public static final List<MCVersion> data = ICollectionList.asList(MCVersion.values())
            .filter(v -> v.ordinal() <= MCVersion.SNAPSHOT_13W41A.ordinal()); // no checks are performed on very old versions
    public static final List<MCVersion> sortedData = data.stream()
            .filter(v -> v.getProtocolVersion() < 0x40000000)
            .sorted((o1, o2) -> o2.getProtocolVersion() - o1.getProtocolVersion())
            .collect(Collectors.toList());

    @Parameters
    public static List<MCVersion> data() {
        return data;
    }

    @Parameter public MCVersion version;

    public static int skippedCount = 0;

    @Test
    public void ensureClientJsonClientJarServerJarArePresent() {
        if (version.getProtocolVersion() != -1) {
            assert version.getClientJson() != null : "client.json does not exist: " + version.name();
            assert version.getClientJar() != null : "client.jar does not exist: " + version.name();
            assert version.getServerJar() != null : "server.jar does not exist: " + version.name();
        }
    }

    @Test
    public void ensureCorrectOrder() {
        if (version.getProtocolVersion() > 0x40000000) {
            sortedData.remove(version);
            skippedCount++;
            tests++;
            return;
        }
        try {
            Field f = MCVersion.class.getField(version.name());
            IgnoreTest annotation = f.getAnnotation(IgnoreTest.class);
            if (annotation != null) {
                String reason = annotation.value();
                System.out.println("Skipping test for " + version.name() + ": " + reason);
                sortedData.remove(version);
                skippedCount++;
                tests++;
                return;
            }
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
        if (sortedData.indexOf(version) + skippedCount == version.ordinal()) {
            tests++;
            return;
        }
        printError();
    }

    public void printError() {
        printError("Failed at: " + summarize(version));
    }

    public void printError(@NotNull String message) {
        new AssertionError(message).printStackTrace();
        System.err.println();
        if (tests > 2) System.err.println("Test #" + (tests-2) + ": " + summarize(MCVersion.values()[tests-2]));
        if (tests > 1) System.err.println("Test #" + (tests-1) + ": " + summarize(MCVersion.values()[tests-1]));
        System.err.println("Test #" + tests + " (failed): " + summarize(MCVersion.values()[tests]));
        if (tests < MCVersion.values().length-1) System.err.println("Test #" + (tests+1) + ": " + summarize(MCVersion.values()[tests+1]));
        if (tests < MCVersion.values().length-2) System.err.println("Test #" + (tests+2) + ": " + summarize(MCVersion.values()[tests+2]));
        if (tests == 0) {
            System.err.println();
            System.err.println("Might be related: " + summarize(sortedData.get(0)));
        }
        System.err.println();
        System.err.println("Test failed at " + "#" + tests);
        System.exit(1);
    }

    public static String summarize(MCVersion version) {
        return "MCVersion{"
                + "protocolVersion=" + version.getProtocolVersion()
                + ", name='" + version.getName() + '\''
                + ", indexOfWithoutSkippedCount=" + sortedData.indexOf(version)
                + ", indexOf=" + (sortedData.indexOf(version) + skippedCount)
                + ", ordinal=" + version.ordinal()
                + '}';
    }
}
