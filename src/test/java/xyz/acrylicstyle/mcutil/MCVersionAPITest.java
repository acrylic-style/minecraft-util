package xyz.acrylicstyle.mcutil;

import org.junit.Test;
import xyz.acrylicstyle.mcutil.lang.CavesAndCliffsDataPack;
import xyz.acrylicstyle.mcutil.lang.MCVersion;

import java.util.List;
import java.util.Objects;

public class MCVersionAPITest {
    @Test
    public void getByPV() {
        List<MCVersion> versions = MCVersion.getByProtocolVersion(80);
        assert versions.size() == 3 : "size is " + versions.size() + " (expected: 3)";
        assert versions.get(0) == MCVersion.SNAPSHOT_15W43A : "index 0 is " + versions.get(0) + " (expected: 15w43a)";
        assert versions.get(1) == MCVersion.SNAPSHOT_13W39B : "index 1 is " + versions.get(1) + " (expected: 13w39b)";
        assert versions.get(2) == MCVersion.SNAPSHOT_13W39A : "index 2 is " + versions.get(1) + " (expected: 13w39a)";
    }

    @Test
    public void getLatestReleaseByPV() {
        MCVersion version = MCVersion.getLatestReleaseVersionByProtocolVersion(5);
        assert version == MCVersion.v1_7_10 : version;
    }

    @Test
    public void getLatestOrReleaseByPV() {
        MCVersion version = MCVersion.getLatestOrReleaseByProtocolVersion(5);
        assert version == MCVersion.v1_7_10 : version;
    }

    @Test
    public void getLatestByPV() {
        MCVersion version = MCVersion.getLatestVersionByProtocolVersion(80);
        assert version == MCVersion.SNAPSHOT_15W43A : version;
    }

    @Test
    public void testDownloads() {
        assert MCVersion.v1_17.getClientJson() != null;
        assert MCVersion.v1_17.getClientJar() != null;
        assert MCVersion.v1_17.getServerJar() != null;
        assert MCVersion.v1_17.getClientMapping() != null;
        assert MCVersion.v1_17.getServerMapping() != null;
        assert MCVersion.v1_17.getValueOf(CavesAndCliffsDataPack.class) != null;
        assert Objects.equals(MCVersion.SNAPSHOT_16W50A.getServerJar(), "https://launcher.mojang.com/v1/objects/d4d30a5433846d205974ace4cf34c9b294e0833f/server.jar");
    }

    @Test
    public void testAnnotations() {
        assert MCVersion.v1_17_1.isRelease();
        assert MCVersion.v1_17_1_RC1.isReleaseCandidate();
        assert MCVersion.v1_17_1_PRE1.isPrerelease();
        assert MCVersion.SNAPSHOT_20W07A.isSnapshot();
    }

    @Test
    public void testAprilFools() {
        assert MCVersion.SNAPSHOT_20W14.isAprilFools();
        assert MCVersion.MC_3D_SHAREWARE_v1_34.isAprilFools();
        assert MCVersion.v1_RV_PRE1.isAprilFools();
        assert MCVersion.SNAPSHOT_15W14A.isAprilFools();
        assert MCVersion.v2_0_BLUE.isAprilFools();
        assert MCVersion.v2_0_RED.isAprilFools();
        assert MCVersion.v2_0_PURPLE.isAprilFools();
    }
}
