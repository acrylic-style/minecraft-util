package xyz.acrylicstyle.mcutil;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import util.ICollectionList;
import xyz.acrylicstyle.mcutil.lang.MCVersion;
import xyz.acrylicstyle.mcutil.lang.ServerExe;
import xyz.acrylicstyle.mcutil.lang.Type;
import xyz.acrylicstyle.mcutil.lang.ValueTypes;

import java.util.List;
import java.util.Objects;

// contains many tests that doesn't check for order
@RunWith(Parameterized.class)
public class AllMCVersionTest {
    public static final ICollectionList<MCVersion> data = ICollectionList.asList(MCVersion.values());

    @Parameters
    public static List<MCVersion> data() {
        return data;
    }

    @Parameter public MCVersion version;

    @Test
    public void ensureNoDupe() {
        if (!version.name().startsWith("v2_0") && !version.isAprilFools()) {
            if (data.filter(v -> v.getName().equals(version.getName())).size() > 1) {
                throw new AssertionError("There are 2 or more duplicates of names: " + summarize(version));
            }
        }
        if (data.filter(v -> v.getId().equals(version.getId())).size() > 1) {
            throw new AssertionError("There are 2 or more duplicates of IDs: " + summarize(version));
        }
        data.filter(v -> v != version).forEach(v -> {
            if (version.getClientJars() != null) {
                for (String s : version.getClientJars()) {
                    if (contains(v.getClientJars(), Objects.requireNonNull(s))) throw new AssertionError("Duplicate client jar: " + s + " @ " + version.name());
                }
            }
            if (version.getServerJars() != null) {
                for (String s : version.getServerJars()) {
                    if (contains(v.getServerJars(), Objects.requireNonNull(s))) throw new AssertionError("Duplicate server jar: " + s + " @ " + version.name());
                }
            }
            if (version.getValueOf(ValueTypes.SERVER_EXE) != null) {
                for (String s : Objects.requireNonNull(version.<String[]>getValueOf(ServerExe.class))) {
                    if (contains(v.getValueOf(ValueTypes.SERVER_EXE), Objects.requireNonNull(s))) throw new AssertionError("Duplicate server exe: " + s + " @ " + version.name());
                }
            }
            // duplicate client/server mappings is completely fine
        });
    }

    @Test
    public void testVersionType() {
        assert version == MCVersion.v1_18_EXPERIMENTAL_SNAPSHOT_1 ||
                !version.isSnapshot() ||
                version.isCombatTest() ||
                version.getVersionType() == Type.Types.SNAPSHOT
                : summarize(version) + " is snapshot but incorrect or missing @Type annotation";

        assert !version.isPrerelease() ||
                version.getVersionType() == Type.Types.SNAPSHOT
                : summarize(version) + " is prerelease but incorrect or missing @Type annotation";

        assert !version.isReleaseCandidate() ||
                version.getVersionType() == Type.Types.SNAPSHOT
                : summarize(version) + " is release candidate but incorrect or missing @Type annotation";

        assert !version.isRelease() ||
                version.getVersionType() == Type.Types.RELEASE
                : summarize(version) + " is release but incorrect @Type annotation";

        assert !version.isCombatTest() ||
                version.getVersionType() == Type.Types.PENDING
                : summarize(version) + " is combat test version but incorrect @Type annotation";
    }

    @Test
    public void ensureAlVersionsDoesNotThrowException() {
        version.getAlVersions();
    }

    @Test
    public void ensureCorrespondingVersionExists() {
        version.getCorrespondingVersion();
    }

    @Test
    public void ensureDownloadsAreInProperFormat() {
        if (version != MCVersion.v1_18_EXPERIMENTAL_SNAPSHOT_1) {
            endsWith("client json", version.getClientJsons(), version.isCombatTest() ? ".zip" : ".json");
        }
        if (version != MCVersion.SNAPSHOT_12W19A && version != MCVersion.SNAPSHOT_12W18A) {
            endsWith("client jar", version.getClientJars(), ".jar");
        }
        endsWith("server jar", version.getServerJars(), ".jar");
        endsWith("server exe", version.getValueOf(ValueTypes.SERVER_EXE), ".exe");
        endsWith("client mapping", version.getClientMappings(), ".txt");
        endsWith("server mapping", version.getServerMappings(), ".txt");
        endsWith("caves and cliffs data pack", version.getValueOf(ValueTypes.CAVES_AND_CLIFFS_DATA_PACK), ".zip");
        endsWith("server zip", version.getValueOf(ValueTypes.SERVER_ZIP), ".zip");
    }

    @Test
    public void ensureSnapshotsAreAnnotated() {
        assert !version.name().contains("SNAPSHOT_") || version.isSnapshot() : version.name() + " is not annotated with @SnapshotFor";
    }

    private void endsWith(@NotNull String what, @Nullable String[] array, @NotNull String suffix) {
        if (array != null) {
            for (String s : array) {
                if (s == null) continue;
                assert version.ordinal() <= MCVersion.SNAPSHOT_13W41A.ordinal() ? s.endsWith(suffix) : s.contains(suffix) : "incorrect " + what + " @ " + version.name();
            }
        }
    }

    private boolean contains(@Nullable String[] array, @NotNull String s) {
        if (array == null) return false;
        for (String s1 : array) {
            if (Objects.equals(s1, s)) return true;
        }
        return false;
    }

    private void endsWith(@NotNull String what, @Nullable String s, @NotNull String suffix) {
        assert s == null || s.endsWith(suffix) : "incorrect " + what + " @ " + version.name();
    }

    public static String summarize(MCVersion version) {
        return "MCVersion{"
                + "protocolVersion=" + version.getProtocolVersion()
                + ", name='" + version.getName() + '\''
                + ", ordinal=" + version.ordinal()
                + ", name()='" + version.name() + '\''
                + '}';
    }
}
