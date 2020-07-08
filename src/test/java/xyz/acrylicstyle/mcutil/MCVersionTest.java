package xyz.acrylicstyle.mcutil;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import xyz.acrylicstyle.mcutil.lang.MCVersion;
import xyz.acrylicstyle.mcutil.lang.test.IgnoreTest;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(Parameterized.class)
public class MCVersionTest {
    public static int tests = 0;
    public static final List<MCVersion> data = Arrays.asList(MCVersion.values());
    public static final List<MCVersion> sortedData = data.stream()
            .sorted((o1, o2) -> o2.getProtocolVersion() - o1.getProtocolVersion())
            .collect(Collectors.toList());

    @Parameters
    public static List<MCVersion> data() {
        return data;
    }

    @Parameter public MCVersion version;

    public static int skippedCount = 0;

    @Test
    public void ensureCorrectOrder() {
        try {
            Field f = MCVersion.class.getField(version.name());
            if (f.isAnnotationPresent(IgnoreTest.class)) {
                String reason = f.getAnnotation(IgnoreTest.class).value();
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
        return "MCVersion{" + "protocolVersion=" + version.getProtocolVersion()
                + ", name='" + version.getName() + '\''
                + ", indexOf=" + (sortedData.indexOf(version) + skippedCount)
                + ", ordinal=" + version.ordinal()
                + '}';
    }
}
