package xyz.acrylicstyle.mcutil;

import org.junit.Test;
import xyz.acrylicstyle.mcutil.lang.MCVersion;

import java.util.List;

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
}
