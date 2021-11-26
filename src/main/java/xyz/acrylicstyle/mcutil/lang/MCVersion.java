package xyz.acrylicstyle.mcutil.lang;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import util.ICollectionList;
import xyz.acrylicstyle.mcutil.lang.Type.Types;
import xyz.acrylicstyle.mcutil.lang.test.IgnoreTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings({ "unused", "RedundantSuppression" })
public enum MCVersion {
    @IgnoreTest("not a version")
    UNKNOWN("unknown"),

    // combat test versions
    @SuppressWarnings("DeprecatedIsStillUsed")
    @IgnoreTest("not a version")
    @Deprecated
    @Type(Types.PENDING)
    _COMBAT_TEST("combat_test"),
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/ea08f7eb1f96cdc82464e27c0f95d23965083cfb/1_16_combat-6.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/177472ace3ff5d98fbd63b4bcd5bbef5b035a018/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b707c44ac1503ad179fde86c78d41aa4d0cc78a5/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/5ea38a7b8d58837c97214f2a46e5e12151d51f83/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/d89f9e0eb8fbe6f2c91e749e8b59391cd0dd96d4/server.txt")
    @Name("Combat Test 8c")
    @Type(Types.PENDING)
    COMBAT_TEST_8C(803, 2707, "1.16_combat-6"), // Fork of 1.16.2
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/9b2b984d635d373564b50803807225c75d7fd447/1_16_combat-5.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/123cf1bd6736a3c1a47e8c1727a3db18e3c9cace/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/635866257b4fc1ade528db8bd53ebbebb4816e5e/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/8d09f244923d77e27493038e02d926d401122f03/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/57882209cb9b4e10303e7a7a2b3b3f93ae32bb8f/server.txt")
    @Name("Combat Test 8b")
    @Type(Types.PENDING)
    COMBAT_TEST_8B(803, 2706, "1.16_combat-5"), // Fork of 1.16.2
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/2557b99d95588505e988886220779087d7d6b1e9/1_16_combat-3.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/14991d31f1002e5cbd97e62310cba614666f876b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/53c43fdae7d2ed01bbb31a82d99e31b9348e2a4b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/907af4fb6a7d676921f9bcb7aa80f8749bf03592/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/7f1369734e3e5585d44b211812274f2ad7ac160d/server.txt")
    @Name("Combat Test 7c")
    @Type(Types.PENDING)
    COMBAT_TEST_7C(802, 2704, "1.16_combat-3"), // Fork of 1.16.2
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://archive.org/download/Combat_Test_7ab/1_16_combat-2.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/0fbf7624030e67904cc0fbe3df2dbf34369a690d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/464d3e619f3e8464e3974b4a6ea388911e31b2fc/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/29501c54a8ccd3ba4a0341a83d93a259e9a2cdde/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/1d70f0a8a544c524ea79e4a7c79f65f7a9dffc63/server.txt")
    @Name("Combat Test 7b")
    @Type(Types.PENDING)
    COMBAT_TEST_7B(802, 2703, "1.16_combat-2"), // Fork of 1.16.2
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://archive.org/download/Combat_Test_7ab/1_16_combat-1.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/3ad450f458149702ec3dd7655af44ab422a83e72/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ee1c898661f5342d52c6e0cdee0bec99f3f60910/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/050cccf384543060a95fe9c773b4db4922a7b16d/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/28aa23fa4ed247f59ad9317cff635432473ab4cb/server.txt")
    @Name("Combat Test 7")
    @Type(Types.PENDING)
    COMBAT_TEST_7(802, 2702, "1.16_combat-1"), // Fork of 1.16.2
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/5a8ceec8681ed96ab6ecb9607fb5d19c8a755559/1_16_combat-0.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/4f08b4667575cbfc35e44c9556a0667bd3d0f5cc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1c35c493ade7a39e2d02bcc326498aaab96f1a09/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/185a362b6b301bfb71e12f788ce8fb998b806217/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/6ddb98ca992d93fd654bf89f801223b1c4d98695/server.txt")
    @Name("Combat Test 6")
    @Type(Types.PENDING)
    COMBAT_TEST_6(801, 2701, "1.16_combat-0"), // Fork of 1.16.2-pre3

    // full release versions
    @IgnoreTest("not released yet")
    v1_18(-1, -1, "1.18"), // not released; set to release in November 31. Caves & Cliffs: Part II
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2010f28a4d0431e6c82d5a27f06b2214e78fe8fc/1.18-rc1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6232765f8b87066e271ab984eccd8a8f3af03630/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/81a2baf05f8f5bda41fac1542e7cc9d937bff41b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/44441ef893cb6531e8322d257e8d03d5463fb810/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/97dd4d70ba711b6dbd6f61b9c7dde9e02e4d00fd/server.txt")
    @Name("1.18 Release Candidate 1")
    @Type(Types.SNAPSHOT)
    v1_18_RC1(0x40000039, 2756, "1.18-rc1"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/22997b1f48ef7cd8c71aac3e4d4391e8bab74c47/1.18-pre8.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ffb896e756a4edc4a538e9a0ac408f9f45ea5076/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/051efe8853d00db6bef7f19324da25a465782376/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/2164aa2dedc931aa5dad6170abcb056649bfb84e/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/1a8d87a8bc254721e75e27cf567ed11dba5cb91f/server.txt")
    @Name("1.18 Pre-release 8")
    @Type(Types.SNAPSHOT)
    v1_18_PRE8(0x40000038, 2755, "1.18-pre8"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c0a6873f1cf4bdcc81ccd57f4fc5852ef7d12387/1.18-pre7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/04f78760e28f823365430bf1126a49ac30d7db6c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/fe08544bb92ebe53070ec4a5f161ac19d8e9e4bb/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/06d045d733b33a5de8952c8328dd82e61f938638/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/174842d495ca5ae1eb68037012820052744b76ac/server.txt")
    @Name("1.18 Pre-release 7")
    @Type(Types.SNAPSHOT)
    v1_18_PRE7(0x40000037, 2754, "1.18-pre7"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/551e71e43747f0be0ec4b84fb2e14dc436fafab4/1.18-pre6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/86dc60a6e7e9f1bbb877ce2c950de3d1c3cafb89/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/97b1c53df11cb8b973f4b522c8f4963b7e31495e/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/f50ffba6205ca0cff1fbfeb3709b4aae1b66d409/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/664893998f7e6d307c7e3f307e59d7f1220c6c87/server.txt")
    @Name("1.18 Pre-release 6")
    @Type(Types.SNAPSHOT)
    v1_18_PRE6(0x40000036, 2753, "1.18-pre6"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2ca2eedfcb4df34a6a35db0c67916cba2a4d7fbf/1.18-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/561446f5e8345f0d77b56f7874ce8aa71cdb1c62/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c29d03e9c6a21a3234a947e1025793c3cc40c13b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/77225d67ef98f5af3990facda860d1e4fd7118b9/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/438bd2a54c066d09195c85c20cfd76818d725dde/server.txt")
    @Name("1.18 Pre-release 5")
    @Type(Types.SNAPSHOT)
    v1_18_PRE5(0x40000035, 2751, "1.18-pre5"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/18a89b7495232a7f974107471000eafac95c6221/1.18-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9690cfe8e0d491173c17018f57671bb40745c33b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d17d3501f7f9d68793d5a505978ea5b87a208b43/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/0a9d83ad6cef0ce073a85dfa6c4edb79d0512586/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/88b6756f389fc2378938b9b10001397d669e7ad7/server.txt")
    @Name("1.18 Pre-release 4")
    @Type(Types.SNAPSHOT)
    v1_18_PRE4(0x40000034, 2750, "1.18-pre4"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cf15721ba36c32ec3e8fb56da3a71b1da90ffeb8/1.18-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fe58c0cffa004dbb78c9a1cf30cc935d280a45b3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/146d1809368fef552274122d9c380423c38068ab/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/8fa21e752f7cf46beed5c5989793cb6c25bc5349/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/1c0712039f4637cc5febea736d5bd33a3767a271/server.txt")
    @Name("1.18 Pre-release 3")
    @Type(Types.SNAPSHOT)
    v1_18_PRE3(0x40000033, 2749, "1.18-pre3"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4b41cd8c3f89ad1a212e24e31a498c205ed7fdb1/1.18-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6b88f1734c80775f59416db3599c2a4333558ca4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c203586f5d2c02b417f0e104b65a8e5e7625b2f8/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/05dd4363ea8e18e8f6eb57a43e1a6e01b3a651da/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e1599803356325af029e806eb7db716c5047fc52/server.txt")
    @Name("1.18 Pre-release 2")
    @Type(Types.SNAPSHOT)
    v1_18_PRE2(0x40000032, 2748, "1.18-pre2"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/397ed5f41973d24093005dfeb8f1681b83337c8f/1.18-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/020aa79e63a7aab5d6f30e5ec7a6c08baee6b64c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1c01e11c62ef7ce9b91324b570a1252d07544f18/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/8761adc5fc85673c238fd1b5a278cb143a47c678/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/fef172812fc00b4e2238df3f15501d19cac225fc/server.txt")
    @Name("1.18 Pre-release 1")
    @Type(Types.SNAPSHOT)
    v1_18_PRE1(0x40000031, 2747, "1.18-pre1"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fd990561a3502903a819815ca63b7ac13110a84c/21w44a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6bf2feca56785edfddf308cbeef0fc3331155685/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ae583fd57a8c07f2d6fbadce1ce1e1379bf4b32d/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/7e7ead13deb9d525c9764f933fb11cd76b7b79ae/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/122dd671c989bd1f0247c0d2924f45ea41595c71/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W44A(0x40000030, 2745, "21w44a"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d70716c04bc31b12276583475629e351f969cbc6/21w43a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ad67ea7db46f4ebbb1d8d5f9286401660a26ebbf/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5c774a8b4e4407133eec7c4e1449c5f35974c589/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/4e269077dc7847d754cd0a827347f5423798dafe/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/c8ad3102e97c03cfa15bd7bb3e7c8bff6797e922/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W43A(0x4000002F, 2741, "21w43a"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f2affa3247f2471d3334b199d1915ce582914464/21w42a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/05781f1ce3749ee0958be1de939d15b8aff1910b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cf518e2c80fdaef443d68d50d1ac23a72a0a7d85/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/3941c7f2f5cb768dd16610ec9f834cc01dc1d32b/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/873b38fc13155fa3d2eb7b7f167fdbab5651ad0d/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W42A(0x4000002E, 2740, "21w42a"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2d307f25bd2f07e9e66bc12a7cb43946b1c5063b/21w41a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/dd353c98457702583b610552da47ff8eb57c602d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8eab49e576b21d6babfc60dcd14c68fac4926ab3/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/980cc030f1bab70ba64778da9842245bcdc1604c/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/7490ec65eb30a8d31bd0a290886fc9b0c64091f9/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W41A(0x4000002D, 2739, "21w41a"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bcc36c0cf4cb0c8e9d6b34a62376ad7485556fe1/21w40a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b88eecb40a4b522aaebe5b10dc44d235f2aef944/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/84496ec4beeeae34a448b99f3e3d890066f6807f/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/3d8e14cfa4589def945e615dfc3f8f4ede71d31c/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/6b5b0e3ab19b97cfd0df9743e3b0205dbd8ebe20/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W40A(0x4000002C, 2738, "21w40a"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8f3f2f74782ba9c7e2143267fedad61d093be3b9/21w39a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2b2b97d9ca6d50669096016f0da959879afe3203/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2b40ef4bf57b2040f7d9affb48c0131b228f954f/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/bae4d018259bbfc2d74153c1347da160adb95daf/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/5f6f035a96f6d68bb79adbc0c001e0e332383181/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W39A(0x4000002B, 2736, "21w39a"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/50e584d16f48df70a9bb069e26ac30a072bc2236/21w38a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4e7c161ec40c9928ebfcc1f96be407d71de4b50d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1283dff678ee5efb8e52d2fc77ec9d840317c6ca/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/48909520218e7d855af4c88aea724b7cc456899a/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/eb442d7286b2c4372cd2c6dabf369947e02dd4d2/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W38A(0x4000002A, 2735, "21w38a"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7dfcb7bb54ac9e9b927627ef2a70d922543bb8bf/21w37a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/be41b4e18f4a600365fd7a2b8eeac49232304ced/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/de695215d83f1f6ec5a19847f6178b84cfde7a26/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/7761b416aed2c0c449f7f879c184fe56372fd226/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/b8bfb658eb0229d74f7d36c004d6bc71b6d2d63c/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W37A(0x40000029, 2734, "21w37a"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launcher.mojang.com/v1/objects/ab4ecebb133f56dd4c4c4c3257f030a947ddea84/1_18_experimental-snapshot-7.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/744c5dd5480cea91b5ed5e29b06aad08a3f6f982/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/965974baf3de259cda0306c29e20860d74b4a297/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/076329c73e01c93fd9bd9c1092b78ef02950abd8/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e27634f15d4a94762f7784a9e71ec521517ef572/server.txt")
    @Name("1.18 experimental snapshot 7")
    @Type(Types.PENDING)
    v1_18_EXPERIMENTAL_SNAPSHOT_7(0x4000002F, 2831, "1.18_experimental-snapshot-7"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launcher.mojang.com/v1/objects/4697c84c6a347d0b8766759d5b00bc5a00b1b858/1_18_experimental-snapshot-6.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/ba87774ed853139ce670ba836d038c4ae39316cc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a730789b6b7afa5217bf2ec66057985e62b5c2b0/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/13a8a8b0385c24336d5e01fd8debb569281222bb/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/299e2896d7f27360823fd089eda151cb7bc48a63/server.txt")
    @Name("1.18 experimental snapshot 6")
    @Type(Types.PENDING)
    v1_18_EXPERIMENTAL_SNAPSHOT_6(0x4000002E, 2830, "1.18_experimental-snapshot-6"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launcher.mojang.com/v1/objects/d9cb7f6fb4e440862adfb40a385d83e3f8d154db/1_18_experimental-snapshot-5.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/d2fa097ee28096bc262b131770ddcfe897001203/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6680fe47a8d599193219f155d7d878feb05bfeb3/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/86cb95da8a8f19f9e3881af6354539fe87ecad07/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/98b1d1ebd93aacc0561b90d77fee1f1049f8ba21/server.txt")
    @Name("1.18 experimental snapshot 5")
    @Type(Types.PENDING)
    v1_18_EXPERIMENTAL_SNAPSHOT_5(0x4000002D, 2829, "1.18_experimental-snapshot-5"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launcher.mojang.com/v1/objects/b92a360cbae2eb896a62964ad8c06c3493b6c390/1_18_experimental-snapshot-4.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/f52d527002d3678da1c9e63aae0200a1063ec184/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ac942062c6b0bf5da61ed2c7b701a13a01462c63/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/50788601a528da2f35483f6852302ec085a05c65/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/38bae2e9a3f7bd315a383eb3c388c994385be14c/server.txt")
    @Name("1.18 experimental snapshot 4")
    @Type(Types.PENDING)
    v1_18_EXPERIMENTAL_SNAPSHOT_4(0x4000002C, 2828, "1.18_experimental-snapshot-4"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launcher.mojang.com/v1/objects/846648ff9fe60310d584061261de43010e5c722b/1_18_experimental-snapshot-3.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/7d7acdf4165867cd7334bfa5f3f00af742c5ce16/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cbe106c19f5072222ce54039aa665a8aaf97097d/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/6685e6de966b4970d947302f55376913454cf512/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/7751261f6f27641bd605b579bc00598fc4afd556/server.txt")
    @Name("1.18 experimental snapshot 3")
    @Type(Types.PENDING)
    v1_18_EXPERIMENTAL_SNAPSHOT_3(0x4000002B, 2827, "1.18_experimental-snapshot-3"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launcher.mojang.com/v1/objects/0adfe4f321aa45248fc88ac888bed5556633e7fb/1_18_experimental-snapshot-2.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/1108159d2734fda202c782ff08e74bf1e399bad4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9fa3fd2939f9785bafc6a0a3507c3c967fbeafed/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/e40574bb0e42a3a2e9fd486db7f7dcd5e5d0c165/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/dde78de8bc0937fa8324efd62d78244febd431e9/server.txt")
    @Name("1.18 experimental snapshot 2")
    @Type(Types.PENDING)
    v1_18_EXPERIMENTAL_SNAPSHOT_2(0x4000002A, 2826, "1.18_experimental-snapshot-2"),
    @SnapshotFor(v1_18)
    @ClientJson("https://launcher.mojang.com/v1/objects/231bba2a21e18b8c60976e1f6110c053b7b93226/1_18_experimental-snapshot-1.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/b230ccffcf332c9d3619af85727d02e284ff4903/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/83a3c2e94b744ad8f0c8bc373dd70a85da59babf/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/117c5938948fb482bffb72e9ebf6f2f77a6d733d/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/3842b0e3eef95054f464d5de410f774ecead9f0f/server.txt")
    @Name("1.18 Experimental Snapshot 1")
    @Type(Types.PENDING)
    v1_18_EXPERIMENTAL_SNAPSHOT_1(0x40000029, 2825, "1.18_experimental-snapshot-1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8b976413591b4132fc4f27370dcd87ce1e50fb2f/1.17.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8d9b65467c7913fcf6f5b2e729d44a1e00fde150/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a16d67e5807f57fc4e550299cf20226194497dc2/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/e4d540e0cba05a6097e885dffdf363e621f87d3f/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/f6cae1c5c1255f68ba4834b16a0da6a09621fe13/server.txt")
    v1_17_1(756, 2730, "1.17.1"),
    @ReleaseCandidateFor(v1_17_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f4fc06b4001baaf2383ba5efc6648867d539c65c/1.17.1-rc2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/132b56af0236e9877261325b67d1606d126463ae/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dd9ca1bdc855535cd7ce0565f02285ad4d6d1ae5/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/38c2dcaf1ea2ed18611daed122c54ac7ad2ec9be/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/20e3df62c8698434fb626e715d899e93865b9785/server.txt")
    @Name("1.17.1 Release Candidate 2")
    @Type(Types.SNAPSHOT)
    v1_17_1_RC2(0x40000028, 2729, "1.17.1-rc2"),
    @ReleaseCandidateFor(v1_17_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7fabe4abc96d0ed905db327d6cc75976398a8969/1.17.1-rc1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/40595d7eeeebc212f6e2b8b5a3dbfc5377cfef9b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b93cbcf6c65b92621d67b735e8610f7682f54694/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/13cad5bd600c9ebc8ebe1038b432053e4c81fb9e/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/6839be84674e31281fa4539741e7eaab7723524a/server.txt")
    @Name("1.17.1 Release Candidate 1")
    @Type(Types.SNAPSHOT)
    v1_17_1_RC1(0x40000027, 2728, "1.17.1-rc1"),
    @PrereleaseFor(v1_17_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/54d8949c65a3542bcbf9288dd745db2dd099abb0/1.17.1-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c9f26f45a9c18c27ef1dd3753057ce81401d742d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/04750b5adff60610a5ba2cd3aa8102f7086c9301/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/11ef28414033c3010f9af6dadeef45a54b4026e9/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e009a085ba97816e196060404ae2be280c4a6689/server.txt")
    @Name("1.17.1 Pre-release 3")
    @Type(Types.SNAPSHOT)
    v1_17_1_PRE3(0x40000026, 2727, "1.17.1-pre3"),
    @PrereleaseFor(v1_17_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/badb8ad3adc431e89f6de496b4cb8595beb522d1/1.17.1-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6edfbe953993a45d3f7c845a5b4e97492f2e8f85/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e01e495461ecb834bb6a242bfea608af4f22b955/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ebbb1b7c4ec6a7103a01168cb4362a13db5bdc17/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/d99adc311dd0d2ef519840186eadd0e7461e333b/server.txt")
    @Name("1.17.1 Pre-release 2")
    @Type(Types.SNAPSHOT)
    v1_17_1_PRE2(0x40000025, 2726, "1.17.1-pre2"),
    @PrereleaseFor(v1_17_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fc7ab9a2061ee1d2d02e0b2cf3fdd5b0cb9f9770/1.17.1-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e2379ea3e1ff2ad1ab566e7fad78ce39eff3781f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/42dfafdd31a1e6edfe59c79ea0e109fede1c8071/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/cd9dd46791ba48dc872d91b1e405dcc9dc542e85/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/27b8583a59c3803db3155640257e83d5138c9b11/server.txt")
    @Name("1.17.1 Pre-release 1")
    @Type(Types.SNAPSHOT)
    v1_17_1_PRE1(0x40000024, 2725, "1.17.1-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/44fa141917df947ed5a138f5cfe667a34f7bbaca/1.17.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1cf89c77ed5e72401b869f66410934804f3d6f52/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0a269b5f2c5b93b1712d0f5dc43b6182b9ab254e/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/227d16f520848747a59bef6f490ae19dc290a804/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/84d80036e14bc5c7894a4fad9dd9f367d3000334/server.txt")
    v1_17(755, 2724, "1.17"), // Caves & Cliffs: Part I
    @ReleaseCandidateFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/51b6bbfd9d4e7ab4066231fd04a3898d46128618/1.17-rc2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fe88ac6c8a0bedc9a48e5c9b48eb0f4dc24ccc79/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1b6e0511e1e419fdcf5a81e53e36b5558032ee79/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/cb05fa784d1c99357cc5702a9df4daaf6ed58b9b/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/4a643e9c4b7b607da9c93f3f8a81d87a08b9ac34/server.txt")
    @Name("1.17 Release Candidate 2")
    @Type(Types.SNAPSHOT)
    v1_17_RC2(0x40000023, 2723, "1.17-rc2"),
    @ReleaseCandidateFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/20b00f9d08344dc764fb3ead4bbe281b4182e508/1.17-rc1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/006320ab2a9969f0e0d3dc64a463e1816be5e225/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4de310c8c4f4a8ab4574246c1d63e3de3af1444d/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/f98bcfe6126153d862d072c574dbe48af778f5d9/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/98a1398dc4144f92e10dd6967a231763741952e7/server.txt")
    @Name("1.17 Release Candidate 1")
    @Type(Types.SNAPSHOT)
    v1_17_RC1(0x40000022, 2722, "1.17-rc1"),
    @PrereleaseFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/db87878aa41877391c487dec9b63143c556c61c3/1.17-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ad51f4efbc250c15d84eaf07f600787246fa6cd6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/31bb40019e8d6e64299abafd743f4d3e1a1a68b2/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/d1ddc678fa5d248aa855cf4723089ef6f7624b67/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/4fd01412588c91fbc94fb36eb9b57275de0f6be9/server.txt")
    @Name("1.17 Pre-release 5")
    @Type(Types.SNAPSHOT)
    v1_17_PRE5(0x40000021, 2721, "1.17-pre5"),
    @PrereleaseFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3a82a1641c0fbaadc762280c89945e5f0b9b2183/1.17-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/de8e68ea23f837f9ab628cda7b16ba3de4b79153/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/528f491660bc5dc94c0d7911345a97438e5c1d86/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/6be34fd616ed3f57869fb92df860d5c2d90e681c/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0bdafb07d9b092dec693b3a7181504ed4bc4f5c4/server.txt")
    @Name("1.17 Pre-release 4")
    @Type(Types.SNAPSHOT)
    v1_17_PRE4(0x40000020, 2720, "1.17-pre4"),
    @PrereleaseFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b392c937e2424d76aee65ab076f334311deb3241/1.17-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3d587b97faf19d4c2fa63e03d1920eb37a95920b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/18abbb3f980fc9b05188535db45a67276ea41f90/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/33e1b9881086dab9e89e919797fbf323870d2469/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/394bffe6a0ba2ee2eaeb7163b0184afc533c704c/server.txt")
    @Name("1.17 Pre-release 3")
    @Type(Types.SNAPSHOT)
    v1_17_PRE3(0x4000001F, 2719, "1.17-pre3"),
    @PrereleaseFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/da08b22628bb013f46d9d9aa7e6a78d458c78f6a/1.17-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/72ebf53f36151a9c2657dca80f72a97c0917d3ce/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d8756c67ce3b3fe20d0510afb3e22fa16310b2e6/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/622bf0fd298e1e164ecd05d866045ed5941283cf/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/c3fc5f17f6a63498078cbcc72872e78c500120f6/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/f79c9cad034152d13c8fab69c441eb06138aacc6/server.txt")
    @Name("1.17 Pre-release 2")
    @Type(Types.SNAPSHOT)
    v1_17_PRE2(0x4000001E, 2718, "1.17-pre2"),
    @PrereleaseFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fdbcc84afc00e47d92288c93a46b72598c6e2cf6/1.17-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/940af6eda421da56e3bf9c390df65ba713cc8f7f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/80a01a1178bcfb67b42636df3a9cdd275f3cc4d4/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/e0738fc94f08362fe2eff71f5bd46288d6647e21/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/7310449e6c7bdd202e4f2cd6bd7ad177357f473c/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/1f6f65434a5ac334607a1141d676f7974308ae36/server.txt")
    @Name("1.17 Pre-release 1")
    @Type(Types.SNAPSHOT)
    v1_17_PRE1(0x4000001D, 2716, "1.17-pre1"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e8a53814450fd98c2d5de5eca8e89cf6760c89d2/21w20a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f756009979e33058d57695a3599b4a2544d856ca/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/054b2065dd63c3e4227879046beae7acaeb7e8d3/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/233aa01c6db99ffcf95594e384e72671ae279ced/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/e6bf5879f4ae3778540cf304483e035ef72416a3/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/8d6960e996a40b8350f5973d8a237469a9a6a7bc/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W20A(0x4000001C, 2715, "21w20a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a57e1436e057febaadedca85f24aae7bf9418079/21w19a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ec029994171ba8e3d9a68458d7d307a67a84faac/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d0a9151432af384f5f2ca72e8e43422772158d0e/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/a6b56d6f14869646eb8d399e99a0149bdd954490/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/7de88c6a5342a640d905ea008a1ad364bdcd63a5/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/8d8524fd057a410dbc680f8f46b967b39ad3f1d8/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W19A(0x4000001B, 2714, "21w19a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/adfced36701cbfa258de0fd38f0bc1f9408632f6/21w18a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f52cf94abf99911ca88c12f776bcf30c9b6f1617/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0b18d883bd1132f761aa715d6a97e29e54a9b8b6/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/6b510a715701aec5e601c7966d87922a300e0c73/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/95bea66557e205298d65d8c48924013d6afa5e57/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/fb0c905d83afce0ef48001acd490f1932ed3c0cc/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W18A(0x4000001A, 2713, "21w18a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cb67b76b0db3c31b4d56152b49392f9bcbdb2489/21w17a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6f0597c8dfef133d59cdce2c629a37f0e259512b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ec995f939bb41a785f960985e73821c7044fc32e/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/6d37f3c37d583e45f0d792f0eccd315032ada0fa/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ef21afb3f08a213441012c16455210cd35e52a2a/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/993c616af95fb18c76524dbb190fcd425b60fc48/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W17A(0x40000019, 2712, "21w17a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/478bdf8d8723c9894c611c3b31df815f168b9e82/21w16a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f124f2aad604e88f27f010834d82c7af85506b6c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b8bacc67a9db84db59e2f97e9a9fba3a242480a8/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/ebe5698b1f6787e30662691f57511a08587db502/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/7a8e3a33afdd6e6ab669852685e1b12ba338234a/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/63799f9f0f3738a0832cf3a3a9593b2f8adc97c6/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W16A(0x40000017, 2711, "21w16a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0acb2600bb2fe418868f911c8d5659239f396512/21w15a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/749805abb797f201a76e2c6ad2e7ff6f790bb53c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0a39422009a7aa01dd185043746c50dc909dc345/server.jar")
    @CavesAndCliffsDataPack("https://launcher.mojang.com/v1/objects/643b1f8f7f71c74ffc913e8572f52fd5bca88282/CavesAndCliffsPreview.zip")
    @ClientMapping("https://launcher.mojang.com/v1/objects/168453c06a67e83d6544f2d02b0c6ce756269f95/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/d5ac0492465e6abc2e980504f7d6ca1e07248d24/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W15A(0x40000016, 2709, "21w15a"), // world generation changes were rolled back
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f8b75fb07bdb13a306eeefe527c47e88dcf25d7c/21w14a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4af7eb4770d3e708d287db3bf023d4bbc60465b0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0cb279c49ea3afda25c9d7257bef650e8dc17429/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/559d6456faf79734c7663513d5d27368a5288daf/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/339fc034e315b00cc524ba9f9d08ab8e71f831ad/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W14A(0x40000015, 2706, "21w14a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/74f2752c789f15cb5f7a7b15f83b9aad5d9e7d7d/21w13a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/507be109a1902b7c3b30c1e900299344c7c0bee6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/36d49b1a6d05f1deac293d477bfa2b4a1babb71c/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/be3ba1ca24543ecd73f240c36a3aa61916fa4d0c/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/13ef5a693f7437b18c322654749db3ec895ba97e/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W13A(0x40000014, 2705, "21w13a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/256f291742441e215cf6743e4aba6c994b292550/21w11a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/07ad8b23e33d195fd897133c9c0e35d7fa1593eb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c828957ad249138129ccbc8749bfd14f01d96a4b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/e8f9be9094ea120eabed0030f997c51da6853793/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/cf412c14df5bb5c3dce38bc7f19169c027ac045a/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W11A(0x40000013, 2703, "21w11a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/40a9d63c50dc098824ff9117cc19e39afb61598d/21w10a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7840a9b8d9aeb480b16962c40a2ca3758893f00e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5998d2c7c15fea04b2541efdcbec4c8cfe5df2a6/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/5f15280e2823d988faa4c3b83db33d11f82f6afd/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/1a24830dcaac223465f4b915759c87fb44c7a0e2/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W10A(0x40000012, 2699, "21w10a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e849f376647fd7160146d77002a3084efa8fb36f/21w08b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c8ae0a1a8b18841e009b8dcdf21ec014f5787410/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/801d5e25869bab291077c773913cc2b490427314/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/3cade11677a20fbd46c83edc8d90f7df465b3ff5/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/03f0068276fbd063b7cbf63747d432880cd08396/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W08B(0x40000011, 2698, "21w08b"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4611f14932a51d4eac08659c3877262bce7ba94a/21w08a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3a008c012bd6bba29054701c7797493523660c57/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d5e31633d884e190e046b8645f802541bec2a5e9/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/1da14ea7ad1926496e9abdf38302766fb7dbe968/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/64b781c30f7fa920c721838f53510861ca3f8d4a/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W08A(0x40000010, 2697, "21w08a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d76d2ae366af6820990b10bb149b3360a41a59d2/21w07a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e6886725265257d34b5e0d0661632c61800bded3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/99c3a9744719d0d401af63bb684cf1eb5231a75c/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/bdcb712a65f1664ea4b2f28b2e88418817ead0d7/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/66ebacdeccfdf8f6439f7a90234fc76e8ef5c5a6/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W07A(0x4000000F, 2695, "21w07a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/364987686dc2ab82d114bba868760ff8cd8a7ed4/21w06a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/50a88791b64547d5325018270e0a5a71f8d4fc03/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6290ba4b475fca4a74de990c7fd8eccffd9654dd/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/2f99b29b39bb18ac67677d7876859c09cc1f85a3/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/c4e373406d2166580c33b075c2d05d9d2fb18d43/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W06A(0x4000000E, 2694, "21w06a"), // the overworld now has a total height of 384 blocks
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1d774ade10d088520e15e513c792988f46cc3fb0/21w05b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8230cf2349b48ba79b0581a3fc76be53f26312bc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f92547a92214ab71a58834e7453ab29a6ab2d192/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/326b623d7c09e8f9155872a8fdc70d553d1207d4/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/da7dcb36bff33f4d93c60b7b4b1d255db0aac9ee/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W05B(0x4000000D, 2692, "21w05b"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1860e394e181af30d746cbb22e5d97c76b4a471b/21w05a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/225bda6c3721a464e9f772a1ca96db2d5df246b9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ff10b6f3bb37799e933ff0c2c300626b78ebfb1d/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ff8c347ba40523b6d15610a3b1eb43358e00c926/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/9a9e43e4ebb1387b0843ace8babd975ea563c218/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W05A(0x4000000C, 2690, "21w05a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f3549b483a7662bce66846fb3d3faed82465e301/21w03a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/30d492744e5c282331958d2096cc8b39d8ec3145/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dbe81ef81e20e76b1458be822026887fef84c541/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/e2ce8c476d6e3412b5e580216c0b1a60069015e7/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/76085b5daeff626db3f2b8d221a1e366b0fc1dd4/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_21W03A(0x4000000B, 2689, "21w03a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/436877ffaef948954053e1a78a366b8b7c204a91/1.16.5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/37fd3c903861eeff3bc24b71eed48f828b5269c8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1b557e7b033b583cd9f66746b7a9ab1ec1673ced/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/374c6b789574afbdc901371207155661e0509e17/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/41285beda6d251d190f2bf33beadd4fee187df7a/server.txt")
    v1_16_5(754, 2686, "1.16.5"),
    @ReleaseCandidateFor(v1_16_5)
    @ClientJson({"https://launchermeta.mojang.com/v1/packages/fee8a5db68ca623e74247c863f72257468a1c7bc/1.16.5-rc1.json", "https://launchermeta.mojang.com/v1/packages/54e837f3bddc76d387b7b3d7fc28c3104f395e17/1.16.5-rc1.json"})
    @ClientJar({"https://launcher.mojang.com/v1/objects/2bbd201c34b43fa50a71c5865b92759b36ab632b/client.jar", "https://launcher.mojang.com/v1/objects/2b12e44073c724c6af2050ad3b6116f9c732feb1/client.jar"})
    @ServerJar({"https://launcher.mojang.com/v1/objects/c0d0c4e477e88c909e105f3065797c6170d7b3e7/server.jar", "https://launcher.mojang.com/v1/objects/ae3acf34bb6e2d8cc4e11a1d52036cdea3ea980b/server.jar"})
    @ClientMapping("https://launcher.mojang.com/v1/objects/e3dfb0001e1079a1af72ee21517330edf52e6192/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/81d5c793695d8cde63afddb40dde88e3a88132ac/server.txt")
    @Name("1.16.5 Release Candidate 1")
    @Type(Types.SNAPSHOT)
    v1_16_5_RC1(0x4000000A, 2685, "1.16.5-rc1"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c0054db03e69292f3fccceb7a795b17791d9582d/20w51a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ab0d1d122bc2c99daad33befe50a16a07d3b3bf7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/fc87ef4c3cf1c815809249cc00ccade233b22cf5/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/1f4859972a54e7aeae1a35c76895f6e8ade33283/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/204c6e7852f82489bed28825a58b4d8acbf386cc/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W51A(0x40000009, 2687, "20w51a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/13ef29a79cc0512e124963fd964e44fd11efe369/20w49a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/818705401f58ee4df2267bf97fa2e0fb6e78ce28/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2fc0afe1fd31ca872761efbd2a7f635db234b359/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/141219c3dd05268d559a5e17e8b8f1f0bf982598/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0b30deba62ef6c2064dfd12f4f46b9d6388d9c8c/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W49A(0x40000008, 2685, "20w49a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a02f99daa7db5a4a54833150b8ed6674282b1b2a/20w48a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a894354496a03e4bce6fe6c03a68313f4660e482/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a14d24f89d5a4ec7521b91909caf4fee89c997f4/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/55550d2717feb75a77920e211655a649708b859d/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/a54f1c40e3b9a63a7a23fc268df7e79c2cb7e6cb/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W48A(0x40000007, 2683, "20w48a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/00287a31ef6a14866a0b328637e60df6419d69bd/20w46a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f4c56c2b7218599b78074a500ab2a89a04db5b36/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/373675677cc57b9294a187a4d0ecab6f340d4189/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/d3687dd62798b403141db1fe7272607c53b6e9f0/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/5de650acd5894cf687a911fb9affb3b294de4dd2/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W46A(0x40000006, 2682, "20w46a"),
    @SnapshotFor(v1_17)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/61d57da4d2ac5833d19feab0d3a286237ca496dc/20w45a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/cf2cd62dfc63fc1a79061a3964d82bf26e0fd208/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/043ec38297d0ec58abd6f636bc92f5664a8ccecb/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ce69af77a39c4e1802b1aebac2f86d867bd71c5c/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e13520140ed6bdbe2ca05f59ce12700e9081a8cf/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W45A(0x40000005, 2681, "20w45a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e54eda49b4a3b6dc407b952e494d0c32da422693/1.16.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1952d94a0784e7abda230aae6a1e8fc0522dba99/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/35139deedbd5182953cf1caa23835da59ca3d7cd/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/0837de813d1a6b67e23da3c520a84e872c8d2f0e/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/d9ae0e8e28475254855430ff051daaa0dd041a08/server.txt")
    v1_16_4(754, 2584, "1.16.4"),
    @ReleaseCandidateFor(v1_16_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6af661e74841ff39edb2acb7796af85c4935d261/1.16.4-rc1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1fcf6ddd5ee925d19eadc4b7ef7278365979c7fd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/daf2d997bd6b1725b6d59b48f533a6804d43db33/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/23a0bc36490545566a79ea5345f37283f61eeaa5/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0413b5c8bb13c62f81c1336c58c09e29d8b43cb6/server.txt")
    @Name("1.16.4 Release Candidate 1")
    @Type(Types.SNAPSHOT)
    v1_16_4_RC1(0x40000003, 2583, "1.16.4-rc1"),
    @PrereleaseFor(v1_16_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7a887ee8a022e476bfd8dbee9856dffcbd20fcef/1.16.4-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0bc552bc3c6516a5831fd365c0cc35e65df2aa01/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ceb412d94900167f519100736bc5709853b50b8c/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/89f8af522cd3cfd0908217b1525d883e61145750/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/dedd2cf8e179614f7d3145ab5aa6ae6b11b7e3f5/server.txt")
    @Name("1.16.4 Pre-release 2")
    @Type(Types.SNAPSHOT)
    v1_16_4_PRE2(0x40000002, 2582, "1.16.4-pre2"),
    @PrereleaseFor(v1_16_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fcde4c4f332110829f1bd117c897b1284fa37fac/1.16.4-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/44745d09a0c6b8faca3989274996d5193cdc1560/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/28eb6f8c4c05eec278e3e7f9f0379a16adbfb91d/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/6366c7397087acc8f021401afd4c23220ad06197/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/cf2fa1a00c551d5a3d4d448f1beb7562abd66c47/server.txt")
    @Name("1.16.4 Pre-release 1")
    @Type(Types.SNAPSHOT)
    v1_16_4_PRE1(0x40000001, 2581, "1.16.4-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0b83240b80de22bdd47d93d2a0ed6f45bbd2779f/1.16.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1321521b2caf934f7fc9665aab7e059a7b2bfcdf/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f02f4473dbf152c23d7d484952121db0b36698cb/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/faac5028fbca3859db970cc4ca041aeec55f6d9d/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e75ff1e729aec4a3ec6a94fe1ddd2f5a87a2fd00/server.txt")
    v1_16_3(753, 2580, "1.16.3"),
    @ReleaseCandidateFor(v1_16_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/72aecc0ca7725038b4ee1690cbbe972f0799722d/1.16.3-rc1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fffe9f9279f52fa8a5624f4753ac9215b17cabc3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/562bf3e75afea00875cff4a06165f93056646f32/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/faac5028fbca3859db970cc4ca041aeec55f6d9d/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e75ff1e729aec4a3ec6a94fe1ddd2f5a87a2fd00/server.txt")
    @Name("1.16.3 Release Candidate 1")
    @Type(Types.SNAPSHOT)
    v1_16_3_RC1(752, 2579, "1.16.3-rc1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/363cf3fef00f554a93ff3c54b189465efeb3d0bb/1.16.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/653e97a2d1d76f87653f02242d243cdee48a5144/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c5f6fb23c3876461d46ec380421e42b289789530/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/88fbd1c70c9244d23e6166a9703cc456d6f115e6/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0dbbb5aae568c2d9aa34e3be11e7b525054265d9/server.txt")
    v1_16_2(751, 2578, "1.16.2"),
    @ReleaseCandidateFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8ac7ac3c3625eed1e4c3cfb42f36b817186ae96a/1.16.2-rc2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/157f7160b1b41bbaa681fcf8d98542bc27ab4b15/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/45287d794fa2631b8da9b9002696ebe406fbed6b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/88fbd1c70c9244d23e6166a9703cc456d6f115e6/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0dbbb5aae568c2d9aa34e3be11e7b525054265d9/server.txt")
    @Name("1.16.2 Release Candidate 2")
    @Type(Types.SNAPSHOT)
    v1_16_2_RC2(750, 2577, "1.16.2-rc2"),
    @ReleaseCandidateFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ba82e3fa0db77b36fb53ae4d8e698dd81a69ae6f/1.16.2-rc1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/dd4982bb447c1d2c7c03419b90dbe8f017c47311/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/203e18d79201b5e8c46019074b07e1c3b4c75f57/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/aadf5f67d80de8dd7d4643ce880ae8ab96552e22/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0dbbb5aae568c2d9aa34e3be11e7b525054265d9/server.txt")
    @Name("1.16.2 Release Candidate 1")
    @Type(Types.SNAPSHOT)
    v1_16_2_RC1(749, 2576, "1.16.2-rc1"),
    @PrereleaseFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/853759e47f8ccc595f07188d03d9151a50599a6e/1.16.2-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8cfa861961862c263ff80f2f6478535fd1ed7d8b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/bd47f78f185a525388e446aa44975c147057ebbd/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/4469589298cef77fb45badb202529d2cd4430818/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/b84128aa72df8d7de3e0dfe87e5e8010f2ae0e92/server.txt")
    @Name("1.16.2 Pre-release 3")
    @Type(Types.SNAPSHOT)
    v1_16_2_PRE3(748, 2575, "1.16.2-pre3"),
    @PrereleaseFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2eb11fb39cd11715246a3a90dff2234a0252346f/1.16.2-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ce5762620a698b464d07a6c733cd66c7fa8072a1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d2cae287324631b2b4bfa609dd01c63cd6d4b78d/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ed1630c1ed0455f0aa0e964d1eae13127199ced5/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/2cd92910f628edb36418e35c91bec901285f15de/server.txt")
    @Name("1.16.2 Pre-release 2")
    @Type(Types.SNAPSHOT)
    v1_16_2_PRE2(746, 2574, "1.16.2-pre2"),
    @PrereleaseFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cd16042b22ca7607566f619bb490afaffb53c091/1.16.2-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/18caa7718c665b6d8597f7979bbdcb078ea117a0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d4434bf4f2f0572a4eb54b3da1b1b3069a4e9ef2/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/adf7d5fd32f2f9d0d135c7061723a3d185708ba2/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/16c4ac0ec3c9ed95f67a781d5f3ca849f05473b9/server.txt")
    @Name("1.16.2 Pre-release 1")
    @Type(Types.SNAPSHOT)
    v1_16_2_PRE1(744, 2573, "1.16.2-pre1"),
    @SnapshotFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6533eb6c1a1669dc61036369e97149b14de4614a/20w30a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/60762a56f1552578d27b91df594ba2a8953dabcc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/db5da41d9c5f6c0d839661269d70f5b8c1ff7d0a/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/bf3e2ea7c7fde705c51a48164e286dc560ad859c/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e40bf65566a7bba119d40febbd5129726f650b97/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W30A(742, 2572, "20w30a"),
    @SnapshotFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9f0beedbb0791df6306e21e57da4f233e4ec188f/20w29a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4a7182b743f15e3c787f8e62e47eb2dd93604167/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ea9a65a38e000fe76b51fa36e923c09d5d8fa473/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/a7f22b64acdacb09b754b76c0806817ec7e9c70b/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/77836afcc070fcb34600a765bccefb0c96bddfbc/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W29A(741, 2571, "20w29a"),
    @SnapshotFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9ba02be070fb23423f6cefa4c8164a138c2248b1/20w28a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1af89d3bb666c848e5640715b6aaa4c0fc5ae7d0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1e36d315d96c29d8d32aa8fecbfb8efa4243a746/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/72f70cfc669b9f75578678a49154dc3c5caf0adc/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/07d50bd8e1d128631bedf0732693f0d5d9762cbe/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W28A(740, 2570, "20w28a"),
    @SnapshotFor(v1_16_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/efc8291724d2a7d0a3aa133b71a1d02b08f54304/20w27a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/83f30681e76d3438105159c645d9f2f6df88a4d8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/40efae0a2412154f44a99f158752b8417b384f06/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/abf394e147324f2f9d34ae2d8bee46c92a9c3da5/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/abf34a031754feab6140fc99a9c7bff253e92bb8/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W27A(738, 2569, "20w27a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/007e584150d3eb937762a491c340732d01cce945/1.16.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c9abbe8ee4fa490751ca70635340b7cf00db83ff/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a412fd69db1f81db3f511c1463fd304675244077/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/588f9a7260759c0c10e193162f76fde005a46fe2/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/a11471890ef5bdc4025dd7a587a46f106d56a7da/server.txt")
    v1_16_1(736, 2567, "1.16.1"),
    @ClientJson({"https://launchermeta.mojang.com/v1/packages/eeb5dedefe2ee986aa1a28fae226109861233c53/1.16.json", "https://launchermeta.mojang.com/v1/packages/7eb9ab4c80798ca9a28355079da88a620b9012cc/1.16.json"})
    @ClientJar({"https://launcher.mojang.com/v1/objects/d3b551b100080ea7943e653268bb7f5a479ce618/client.jar", "https://launcher.mojang.com/v1/objects/228fdf45541c4c2fe8aec4f20e880cb8fcd46621/client.jar"})
    @ServerJar({"https://launcher.mojang.com/v1/objects/7361a24df069a06748844cc7483c35d4abd2d80c/server.jar", "https://launcher.mojang.com/v1/objects/a0d03225615ba897619220e256a266cb33a44b6b/server.jar"})
    @ClientMapping({"https://launcher.mojang.com/v1/objects/553faa3433b82f5c661592c6705c7d0a4e705e02/client.txt", "https://launcher.mojang.com/v1/objects/c04e0f0d37414fc022ca31062acb0ff1d67be331/client.txt"})
    @ServerMapping({"https://launcher.mojang.com/v1/objects/2abdefdee019086df11a946a076fbd853a0185d6/server.txt", "https://launcher.mojang.com/v1/objects/a11471890ef5bdc4025dd7a587a46f106d56a7da/server.txt"})
    v1_16(735, 2566, "1.16"),
    @ReleaseCandidateFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/771d834f4673d2a5f78f20ac91208c28b2d62ddf/1.16-rc1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a056316b66aea50c0555d5f438cf839b6cdde000/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7213e5ba8fe8d352141cf3dde907c26c43480092/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/f6fa59c948ba05b846da71dd38b9ab823a6073c6/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/60d3caa5ded0d36d976233c7a5184c51e79b8d2c/server.txt")
    @Name("1.16 Release Candidate 1")
    @Type(Types.SNAPSHOT)
    v1_16_RC1(734, 2565, "1.16-rc1"),
    @PrereleaseFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b7fb24f6d0491e6ac5f07eee08518a5cffe07345/1.16-pre8.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/23b14c93185398af577353c47af04248991b72b4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d6a747371b200216653be9b4140cd2862eddbb0e/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/cc731ea8613341fe463db28e5d093a244cbb2b4f/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e12f3803214e464595e100530a23c56ad8b3c851/server.txt")
    @Name("1.16 Pre-release 8")
    @Type(Types.SNAPSHOT)
    v1_16_PRE8(733, 2564, "1.16-pre8"),
    @PrereleaseFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/49aee1659a469a63aeeb477d9a1b153b30fba6b8/1.16-pre7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/62473fe623906a01b2f7cf4f7c1396ab23697e5f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/577f7287642309a2a32e80be395329118dfddb3f/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/3c70f81a7c1c9f307be58a39ddeb5efb8e8ff632/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/5e42ed6871784b7def1332f1e735daffbcb0b141/server.txt")
    @Name("1.16 Pre-release 7")
    @Type(Types.SNAPSHOT)
    v1_16_PRE7(732, 2563, "1.16-pre7"),
    @PrereleaseFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a57cad8e98b65c9af672476824757a6d830ff93e/1.16-pre6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/44aa1f291392b002cb7096c71913306f57e318e0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8984939f42371a7e614fa48669e308c4cc9ba228/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/1b80bd23bba9a2031efab807f68028168cb04094/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/950d8a2275c5e59ae3dfa4a36b998573f5f1fd6e/server.txt")
    @Name("1.16 Pre-release 6")
    @Type(Types.SNAPSHOT)
    v1_16_PRE6(730, 2562, "1.16-pre6"),
    @PrereleaseFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a276ca77ecd34b70f66769e9ba7ba6219cd2b9c1/1.16-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/424242726ad6c828f47af0ef2a8dc3ac7a91ef96/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/56081523bca4f7074f111d1e8a9fd0a86d072a2b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/b2aac6e5da41c67eb699cbcdf1d818aafa60fe45/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/5f32040b04f7df822c072e4630aae2c8f95b6fb3/server.txt")
    @Name("1.16 Pre-release 5")
    @Type(Types.SNAPSHOT)
    v1_16_PRE5(729, 2561, "1.16-pre5"),
    @PrereleaseFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1f568b8829fdb009c99191fbe4c845fc45316dc7/1.16-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/67bd747f23f658a442766588d044074c65c41332/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/018cdde89f8ff3831ce27c6c8dbf6831e99e0e75/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/5132f6ea6a8c605a994fd55481526a602b13cf54/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/9633b909686765f69ffd67b73eba0f3adbca1c4e/server.txt")
    @Name("1.16 Pre-release 4")
    @Type(Types.SNAPSHOT)
    v1_16_PRE4(727, 2560, "1.16-pre4"),
    @PrereleaseFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/dbf25e875316d0dcbab375f69796beedb94284a1/1.16-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0d7c195c685f8a6172696c9a7f8f4e5d76185528/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0b5653b65bc494fa55349682cebf50abf0d72ad9/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/4a012680147a891696f22fd031148c5e1564f760/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/a3ce901f9c3684ebd010292b6242de60d5ecf273/server.txt")
    @Name("1.16 Pre-release 3")
    @Type(Types.SNAPSHOT)
    v1_16_PRE3(725, 2559, "1.16-pre3"),
    @PrereleaseFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3bab9adc9f00b43dbd1987b228667ed048f467ec/1.16-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a1382f4cf8815e3085efb1782cf32ed5cb621b86/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8daeb71269eb164097d7d7ab1fa93fc93ab125c3/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/295bfd26b2a39e8793800fbc777c5ff03b1cc661/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/2c32da45ceb6382b959f215f3895719f51a426f4/server.txt")
    @Name("1.16 Pre-release 2")
    @Type(Types.SNAPSHOT)
    v1_16_PRE2(722, 2557, "1.16-pre2"),
    @PrereleaseFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/aba32ceaeee4e07782a1740911f549862d2d838b/1.16-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a0041360ae7579fb553d26aa5e8bdb869815e54a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ce66f98cabc1038ceba3b715b7dad5f70e27f88a/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/2b11ab60280b7c95a092cd64fb175e0e5e8448ff/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0cc5913ef77e4b7c6c78a66a1994254b4e295640/server.txt")
    @Name("1.16 Pre-release 1")
    @Type(Types.SNAPSHOT)
    v1_16_PRE1(721, 2556, "1.16-pre1"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/aa41277e48a2ad1317239e05f7487cca11f94338/20w22a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/905dbb8972c73e2e62fbfa31b828ba299e136743/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c4a62eb36917aaa06dc8e20a2a35264d5fda123b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/25989c37e2b111db4b91841530a39bd0413637f8/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/832dbb4e544a7f9da763fabdc290ce62c45c0d04/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W22A(719, 2555, "20w22a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d12c49c18b9508ce653c918f8add0bc9c5b5b16f/20w21a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/96efb012b75620e881d5b97deb6fd9f02caab4e5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/03b8fa357937d0bdb6650ec8cc74506ec2fd91a7/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/9348184ad4eb09d88335f81757b1feadf3f663a5/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/9ddbeaafd0625fa379ed53e0befd0a751c9e6d9c/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W21A(718, 2554, "20w21a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5ca7d343024fb2f328254ecfa23d80f144f6b2a0/20w20b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ff70a84c9cdc99a866c4b06410ec46f541dcf988/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0393774fb1f9db8288a56dbbcf45022b71f7939f/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/537afc0055abfd607d569a4182967d7413826167/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/24c09a43bbc887cdd71e853819fd2936a6c3db64/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W20B(717, 2537, "20w20b"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/873454bb5b99f04a03769dd5c3825630c7e4c5dd/20w20a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2b171fb288bfd9c845f99015cbccf1d38bdaef65/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f06a943eb107494688b4447b97514af6d7311623/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/92bea2875325005b0df875b5907beb793567e7c3/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/3f588d34d00b1a282e85a4ff5f84723c234d495f/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W20A(716, 2536, "20w20a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4c3b76391f63376f1bf74e010f0040c9fd50c5c0/20w19a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/10788e762e437780f17b16832b59647548b34ac1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/fbb3ad3e7b25e78723434434077995855141ff07/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ddbcb8e1cea7a355aae5f4ec0eb9767b54518196/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/87c6bdaba70125ba2f81592b9428f81af0075461/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W19A(715, 2534, "20w19a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a93d5875d15dbf8944f142a0b028d0d6dae508fd/20w18a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/472c80b7df1ef0818da70ef7d13ad512866afd09/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4d84832bdc7f62aa96b0d5d5a73b1272e8c474b5/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/05486f732a794f005f1942750a8d04ab3c99639f/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/f6873d162c58fd15fd67b5a02d3b63e490f120ee/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W18A(714, 2532, "20w18a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/aa0aaefee328a233880cdd9471aa6a1f468eb998/20w17a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0f9a4d6f9bc5b8fe3a3b5e1d6787f856de3d4f72/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0b7e36b084577fb26148c6341d590ac14606db21/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/b8d6c3801e305aed80f1d310b1ec5d6e314e68c6/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0e74b557e6cfc6840409bc0925351439ec0d8595/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W17A(713, 2529, "20w17a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/60a73450bda35b974369205913f987e2e9b792c5/20w16a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5edab2c289420b7201b8f780c2dc4669b77fcd1e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/754bbd654d8e6bd90cd7a1464a9e68a0624505dd/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/3a11faf55f4e3a7c86cf56b3ceae29da7e689bd4/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/794785898890b741e06aeed1f0497935a4abb1c7/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W16A(712, 2526, "20w16a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2064b1ce299ae17b0255b17ae2ac1c0299787f7c/20w15a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/53585ce8bf64f921feb5090a7facd04995ffc739/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/64ca02e1e9fc7e60eac4aba788580b16eb12f71f/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ecc0ca1c8f9370f315459527812212dbab4821d2/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/7e21159461953bd52b6b965ca3eacb0b0bef4016/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W15A(711, 2525, "20w15a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c66741214bcdea01561742623672153347a2c6db/20w14a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/cb36abdee528372522f52ae41ccc0609fd9c4038/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/affcf966ca903156070aa90b63417793a78b2165/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/387a18fda209b637ae9391e181ae6617b48e7b63/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/877953d0a645c66cfa9d7aef512e89b8867d5e30/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W14A(710, 2524, "20w14a"),
    @AprilFoolsVersion
    @SnapshotFor(UNKNOWN)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/23eabba862a988d1f6ed27aecfbc14ef083dcc46/20w14infinite.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/cc5cb23748614a6396ffb77427b4f11f4b6ae99b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c0711cd9608d1af3d6f05ac423dd8f4199780225/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/3d91233a24c5de720f0eb41927a0b00e45e89caa/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/a94a32e698caff0f5c5762b3dca045ddcd587071/server.txt")
    @Name("20w14∞")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W14(709, 2522, "20w14~"), // april fools
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ce5a5eb9a2ff1ba6080f1987d146d6c9d6ccb12c/20w13b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e4f75e82519fe859932d22c9c05b762cd544af11/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0e00cff8df2532a1ae252e773552c2fd6c68de80/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/0875f30109601e9b6fd687de9ef48f1886128b08/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/92139bb52a9d3de0bc24abe80d21725e0d5a370e/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W13B(709, 2521, "20w13b"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/386d68f867dbd40af34460324d107d2574c57dd2/20w13a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/dbabcec822dc4cd7fff60793facab0f346d1b734/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/16f18c21286a3f566d3d0431d13aa133bebe6eff/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/c5a9c36fa2f660b0f4c3dfc35d750495e3dd5927/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/73ddaae15ac488e6f2fc124ccaef5f30d1030872/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W13A(708, 2520, "20w13a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ff7c95dbb9660ecee118cff64784d167a07b4cf5/20w12a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8ffb3d6807ede557ca7e114b4b6c3fb797d6e432/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3d9657a172415a163e25096942f5a4d110b984a0/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/10f612b4fcc623f71a64b432da83ad89565115b7/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/32a0720241d6e7b29f5b74356e21e62f3dde6cea/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W12A(707, 2515, "20w12a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/364eeef305268226ed8b57b021be0971583defba/20w11a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/760bf0158d0c7b59b1a6a550bbab9ea4a4921371/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0c80ec15d36440cdeaffe1a0791fed78faea62ce/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/638f8d12b3b1a70e48395fe7dbfcb5e5983af100/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/9cd39550a8a382d2528daa9a0812253cb198b827/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W11A(706, 2513, "20w11a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b4e3bb78653fe87fb71f03c2818630040f151e48/20w10a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5476bd5eda4f2fec842225b4e60dc270aa9c18c9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b9310c21839112d6758b0b245998f57a2b9a0500/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/7b1d959004c19e0f09baef016e418c8e7fa18a16/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/30df967877d4c162a24be37ee9b2b35eab1bd557/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W10A(705, 2512, "20w10a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3a4db6e1f458e7b0195c6a34bc79ba09085b0501/20w09a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d62a517011a3ec66b053a8eae703779555227204/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6f1e5ae00b938bbe15560b7174be7a3b4c78c450/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/fcd95574c2585030aaffc52eae4db7660d1c797b/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/8049ccc2b87068b80f5848c09e3879c9baf145af/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W09A(704, 2510, "20w09a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c7abfd4b77fdf3f6e3ca2cc9cfadfe1667dbeba1/20w08a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/505d4b727709ef618cf27432f1c94894133caae1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b46203f7cc23ec786710fdcf6f369935cf92dabb/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/0b3755f24a38d5339c702aefcaf9e15179128047/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e3dc1ad3c46c88dfba3481c38a53fe4bbf02c1aa/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W08A(703, 2507, "20w08a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0025e5b2b227da83b4312a0f8b07a8a9dba0bdf2/20w07a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/421d3171259d100d25c9579ac4d6fdbd1d364294/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3944965e1621a5ccbe99292479cc62e07bccd611/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ecd9dab44f38db7ed1daa7afbada9ec4913b73c6/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/d61b76c19721d259f598ed8709093d75d17ee6ce/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W07A(702, 2506, "20w07a"),
    @SnapshotFor(v1_16)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/95ea2f3ade999a543109034894ab7fb9f3fce0fb/20w06a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/cb31534291e7e126f323cdc6596d481cc09753f5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9b74998642553efe0e4d1aa079dc737b3e4cdc13/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ccd745932002270c7132784e7ccd1e11adec4ea7/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/5d91d41d874fb407156f0dd87c597a0f1894ae0b/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_20W06A(701, 2504, "20w06a"),
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/52263d42a626b40c947e523128f7a195ec5af76a/1_15_combat-6.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/0ad80b317873e1f64a9a79af09a02ddef62ce67c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0cc9a1582949297c8f1ca83b937c8d84ad295ffe/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/5c9745ba8db67bcc95e6de65a3a6dd1d4c655726/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/44b2ca1d4677f3fffaa0333c87a42a9449e0bc52/server.txt")
    @Name("Combat Test 5")
    @Type(Types.PENDING)
    COMBAT_TEST_5(601, 2321, "1.15_combat-6"), // Fork of 1.15.2-pre2
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/ac11ea96f3bb2fa2b9b76ab1d20cacb1b1f7ef60/1_15_combat-1.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/af7b75f44fdcf814727c45c2eb6e4acc01000465/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4914bb3f9ae37dabdcbd68aa05eda1783f605336/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/0f78860aa616f0ac1d044be0db3b7e1ea4eda16f/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/219ba3c078eb40bea4daaa109c4b10f706e210c7/server.txt")
    @Name("Combat Test 4")
    @Type(Types.PENDING)
    COMBAT_TEST_4(600, 2320, "1.15_combat-1"), // Fork of 1.15-pre3
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b57e2563648f1a657dddab12d5626b0e6dde6ffd/1.15.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e3f78cd16f9eb9a52307ed96ebec64241cc5b32d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/bb2b6b1aefcd70dfd1892149ac3a215f6c636b07/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/e101497d78faca35dec18f632de16c25899b6f08/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e018f7413ad5b98d7427bc3027c95c78845e891b/server.txt")
    v1_15_2(578, 2230, "1.15.2"),
    @PrereleaseFor(v1_15_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/71cfc678bd37fdd9cba8ed9389df322d5bb98a2b/1.15.2-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a6b3fcea0178c47e518a3703adb8af793f526bce/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f3eae938f3382ffeb8c3af150664d33864561110/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/e101497d78faca35dec18f632de16c25899b6f08/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e018f7413ad5b98d7427bc3027c95c78845e891b/server.txt")
    @Name("1.15.2 Pre-release 2")
    @Type(Types.SNAPSHOT)
    v1_15_2_PRE2(577, 2229, "1.15.2-pre2"),
    @PrereleaseFor(v1_15_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d92cceefd15b3e62b40af419f9511c9372d11088/1.15.2-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9f28455f9f9d09294e0ba19beb13dc26b39a9582/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5db50a719dc40d63aa95c6bdc5b302e425f673f2/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/8c8caf763afbe28a49c0880b250d2b2354a18363/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/76705a427c78e84a6921f8ded286f7b3a61070ad/server.txt")
    @Name("1.15.2 Pre-Release 1")
    @Type(Types.SNAPSHOT)
    v1_15_2_PRE1(576, 2228, "1.15.2-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5f08951bac12f943a09a62839ce8082215f201dd/1.15.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8b11614bea9293592a947ea8f4fd72981ea66677/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4d1826eebac84847c71a77f9349cc22afd0cf0a1/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/24c55605b6ebd4ee0b28d41d609b68599ef23c67/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/d10e23f8def30fcf7d0a0d027f48f2731d80208f/server.txt")
    v1_15_1(575, 2227, "1.15.1"),
    @PrereleaseFor(v1_15_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c13f2bfd8112d9b6a9b9cd43dcfe161f0152d7bf/1.15.1-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/70e27f84a178951b0df7c42c7b9313782cb9925e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/289a247dd42928880769398b049d3890513f2917/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/24c55605b6ebd4ee0b28d41d609b68599ef23c67/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/d10e23f8def30fcf7d0a0d027f48f2731d80208f/server.txt")
    @Name("1.15.1 Pre-release 1")
    @Type(Types.SNAPSHOT)
    v1_15_1_PRE1(574, 2226, "1.15.1-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d15def518373e2044bb790f28b6fa3a47473ff0f/1.15.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7b07fd09d1e3aae1bc7a1304fedc73bfe5d81800/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e9f105b3c5c7e85c7b445249a93362a22f62442d/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/a0bea08f0b96f6f30a350cd75270be63f7d0aac4/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/c79e5ee9c5167b730266910d4c5bafbaf27c2f52/server.txt")
    v1_15(573, 2225, "1.15"),
    @PrereleaseFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/34f5ee9e7ca37cfd22345ac060f7bb62d429c4ac/1.15-pre7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3d58943d119fab2404cedc465f45da09d4925f8e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c1f961491a8340a1809292b7189046896deaa338/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/a0bea08f0b96f6f30a350cd75270be63f7d0aac4/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/c79e5ee9c5167b730266910d4c5bafbaf27c2f52/server.txt")
    @Name("1.15 Pre-release 7")
    @Type(Types.SNAPSHOT)
    v1_15_PRE7(572, 2224, "1.15-pre7"),
    @PrereleaseFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ee365dbda3f8efbc9b5c7ef32b450a882628ac8b/1.15-pre6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bc120aa16cfce2be8188f8f809013476f76c57fc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8d5793fe302feb6c03d3c5e590ef940fc02f2864/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/3bad8b77c3461b0524cb1ed9ad9e3b727d9d437b/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/c79e5ee9c5167b730266910d4c5bafbaf27c2f52/server.txt")
    @Name("1.15 Pre-release 6")
    @Type(Types.SNAPSHOT)
    v1_15_PRE6(571, 2223, "1.15-pre6"),
    @PrereleaseFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fb227267e104aa6ff021ce5316f8d88350bfee30/1.15-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4cfabb9bc131faf9d99417932d813a1148836fd7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d68ce004ce760b702e2f7e298a2a1ce7a7663c55/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/87ee6fe02bed0c7629e9d84a446ac138dc0f6afe/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/27e6c3184a2360cf0b5dd047dc40de927e4e052c/server.txt")
    @Name("1.15 Pre-release 5")
    @Type(Types.SNAPSHOT)
    v1_15_PRE5(570, 2222, "1.15-pre5"),
    @PrereleaseFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f6410c70db5b860ba293b9e46e07984f7e1b2b4c/1.15-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6868a5c87243707f7936c21a4e52d076e3d73234/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8f9e23414a01d21e2cd313b2595b164ccfda56aa/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/8c32d18e101ed343feec81d5d585a505830ed00f/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/512a0f07a4183f6c1f71401fea0bf26cb44b541e/server.txt")
    @Name("1.15 Pre-release 4")
    @Type(Types.SNAPSHOT)
    v1_15_PRE4(569, 2221, "1.15-pre4"),
    @PrereleaseFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e739263a7bf4f1f84a191e6b439ca35f7ca5348c/1.15-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/468c221358a93040097edb51f768647683fedd18/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/eedb663e70f49a5592b88197ea68b0f32fd9ce97/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/af3543cb84957b119b89cfc7d1b072352b6cc2d0/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/c40a33c8fcb926ae610f732a383aaeb09e47c549/server.txt")
    @Name("1.15 Pre-release 3")
    @Type(Types.SNAPSHOT)
    v1_15_PRE3(567, 2220, "1.15-pre3"),
    @PrereleaseFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/67d54bdd396be77bfeb591c026ea85516c241376/1.15-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/86826ed25a880827a5b0a2e330402a234e7c6f70/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0f0c2e3c25693189374c8a63179e3018ebfdc1ba/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/d97cdb2d6da314dd3aaf1e2eb524319e48d56493/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e52c6202bcd403df99f9e9e1e701e97942042d21/server.txt")
    @Name("1.15 Pre-Release 2")
    @Type(Types.SNAPSHOT)
    v1_15_PRE2(566, 2219, "1.15-pre2"),
    @PrereleaseFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d5d13a00263ff4a09005aa56e174be523e241487/1.15-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6e9fe5ad18470fd1b3318f337fca18cd94d7b9e6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/332b3382108e5bdb0b23717082c9b97c54ffc8ad/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/4323ee7cf1b3cd30944d7855d85fa955fb279e2e/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/e73be3dfee02376e041572ac0f39d301ac01a8de/server.txt")
    @Name("1.15 Pre-release 1")
    @Type(Types.SNAPSHOT)
    v1_15_PRE1(565, 2218, "1.15-pre1"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5e35e3e9c7ac9f21f0d47c514041a8ab6a407b32/19w46b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d795c91e58fd1c3ef66e5061a0562df4bc480368/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/eded6ea3899b67478780576a3b92c6cac867b501/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ca0b5867683c21237ebb53f09baaa30b0066d0cc/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/1b2214bdb4c8ad7f60c23e1331e43c7a9a43387a/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W46B(564, 2217, "19w46b"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/63427be8d219afca64cb9e654e54a4fcb5132030/19w46a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c0fda1050b9e3affbd1fa7aeec39b6a787c2cb79/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3544354ee91fee0439009e71c8e064ec8355600a/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/779ff32bc6a845587e32e3564b03df6c6de1381e/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/6ae60784737c4e5a9d51285bc3b39ec7dd4a8559/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W46A(563, 2216, "19w46a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f06669f4e31c142bd7170111346a6ed913ea0696/19w45b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bf60be81bb0902fdeb221d0d09870112d31df0b7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0d0d7db69eb40408c23ce4503dfd00671bcb9e6b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/ce84678b93c49477c2e359732a13d07730a520a0/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/a684a41637fcab482beeaa44951669d62c354e4d/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W45B(562, 2215, "19w45b"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1f382ef9faad22e50b1d66b6dc90591b54ca4c4e/19w45a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/67fb46186cd0469929a2a3e06d97a2edb42aa983/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/fa9e744ee6e5cccd4000e2269f8dff8ce96ce5a9/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/117e7677564697667dd143a81195d8ee9c05fd82/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/a684a41637fcab482beeaa44951669d62c354e4d/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W45A(561, 2214, "19w45a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cf6cad32dbf5703d860288ec23d2eb5fee9641d2/19w44a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3675ef34dd983d862b366662405e0d9b9654b656/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0a68a89351325fbad9b432b3eb24ae944860350e/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/121d9f7f44495de9d3f9a7525d753d68c9cbdc60/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/860ef46b0531612ee7dea636910f0fe37771ee7d/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W44A(560, 2213, "19w44a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2b9a76cfcc0debe7744e1c10ca282d73351395d2/19w42a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6c40e373f7811321fef635c87b14686ef024b484/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1f8673dee28ff3a1714e17780f6b91d5372fe440/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/4f8dabad48468cf5b709a7346aa6754ff8cebe82/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/eed4136ba4d0a9c6159630cf716fc328efd6c230/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W42A(559, 2212, "19w42a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/48f1132b78af1c110feda454e7eb3d2501107eda/19w41a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e009395464a1e2f4c8c760fc08de73c91e5a03ee/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/852eb4bfba2d886efeb88f82bcb706099193b121/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/27fd84fa51ae7cb112ef87f951c96b56909cc73d/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/9cbe72ca6c41aae9b657d38fbaab1a96267ffcd5/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W41A(558, 2210, "19w41a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b3ba605a4aef4e5c71dbc523b2c12f0a8ca6cc86/19w40a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b5706bdc877f25168acfc337ff4d39a9e8fd57a7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7f3c050c9540cfe69d3bf8eff3ca0a38f98b6aef/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/258661eab6052a1ad21efb9dc5216bedee8009e8/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/654466e83e9216e72c3a9813b8c614c3fae4546f/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W40A(557, 2208, "19w40a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/89d4f5ad8df9687b6cec6b12dec06874ff13c15a/19w39a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a0b9a2c6cceb77d4dcf601eeef1ffc7dc882b48a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c03cf9537bd7a34640d7e173551b7005799d5675/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/b5c5a07d99839f17b2425fefdd66a7652fafabc0/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/b6e980b1391ef3707358d173be9e667940c265da/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W39A(556, 2207, "19w39a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/121b1ab889c8b09472ae43b0ac3b040a4ce01f6a/19w38b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d51e6f344aa46b609e5877699af3c9f613d8ef7c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/aff9049db1bcbd44d133ebfbd015dce49dd8383e/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/330489f2a38022821de5bb4fdd0e370012e72688/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/1d87017dd379e11f37f00f057d583cbba188045d/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W38B(555, 2206, "19w38b"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/84c31cd0a675855fc16cc50ce6e8345694d8b042/19w38a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/33e153dbada31777c9344d3e21398f825bd92064/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e40184002fa2e183de5fda0229d0709cfd6bfe8a/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/05491de2b41f0b5f2ec404a77661a73e1333b59a/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/1d87017dd379e11f37f00f057d583cbba188045d/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W38A(554, 2205, "19w18a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e13fe6eee9126c2d36a062c43219721ee7401d58/19w37a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0fd25a522c2faef517aeb55fb9472d7ac4141efc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e2c6923d9e06f6b98460f0f584567848a70bf71b/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/dbc49ff34b515b4c8998a6f15144f45b5ae6ffe6/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/77a4fb0515dc978376525599fe7078ed5b6c7718/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W37A(553, 2204, "19w37a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f6bf65ec2132bf1c0e9f8026cd330baf2974be1b/19w36a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/54a359d0b47818d85c61db79ec742f7fdab5b914/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c042fd138ae280b01ce191937ca917666a15be38/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/f483c4aa381c8f935d7a010751f12eb19851659f/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/0791193686d4c42137ba50956cfa915768721d1d/server.txt")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W36A(552, 2203, "19w36a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/144dfcc324f26650c3692a9a32f50d5c9cbe4d7c/19w35a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6a3e18dfa1ab427d77c0e52e55e62509f15be697/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e0bfc54b4b424c43b1fe5b833d68e35d031a481d/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W35A(551, 2201, "19w35a"),
    @SnapshotFor(v1_15)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/458a93685d1ea632f7c0b3bd3db4f24b58e9ba86/19w34a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9d74a00192ffc6b83c8b3c754619d057a9353754/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/288962c67d083e35d4313cf0eba8ad1e27173d17/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W34A(550, 2200, "19w34a"),
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/0f209c9c84b81c7d4c88b4632155b9ae550beb89/1_14_combat-3.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/fd8f2712d8d5089f4f0ee817a6f6fbe7f9d4c6f1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8f8ff833e6c775286a54935dad282f8499578f9a/server.jar")
    @Name("Combat Test 3")
    @Type(Types.PENDING)
    COMBAT_TEST_3(502, 2069, "1.14_combat-3"), // Fork of 1.14.4
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/d164bb6ecc5fca9ac02878c85f11befae61ac1ca/1_14_combat-0.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/307045ecb6de9a9436d333d32440f5dbfc367c20/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dbed2de0763a834bfaa851c0478c56aeee654010/server.jar")
    @Name("Combat Test 2")
    @Type(Types.PENDING)
    COMBAT_TEST_2(501, 2068, "1.14_combat-0"), // Fork of 1.14.4
    @SnapshotFor(_COMBAT_TEST)
    @ClientJson("https://launcher.mojang.com/experiments/combat/610f5c9874ba8926d5ae1bcce647e5f0e6e7c889/1_14_combat-212796.zip")
    @ClientJar("https://launcher.mojang.com/v1/objects/98cb56935c762c412b64ddda8e3851544243fb2d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/168ae89abc66fd4ee2d84c844cd980ddae26e784/server.jar")
    @Name("1.14.3 - Combat Test")
    @Type(Types.PENDING)
    v1_14_3_COMBAT_TEST(500, 2067, "1.14_combat-212796"), // Fork of 1.14.3
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fbe94183241ba2fcf8cfb71703d9a145c225a76e/1.14.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8c325a0c5bd674dd747d6ebaa4c791fd363ad8a9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3dc3d84a581f14691199cf6831b71ed1296a9fdf/server.jar")
    @ClientMapping("https://launcher.mojang.com/v1/objects/3a0e42172d082f18c4ee0b4561a6a2ecc9868a58/client.txt")
    @ServerMapping("https://launcher.mojang.com/v1/objects/46a7ba37c15820f00d49eafb38afb4a9bb64a0be/server.txt")
    v1_14_4(498, 1976, "1.14.4"),
    @PrereleaseFor(v1_14_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7017bcd84c1f27c89c6cb4a8c117468c1e6d0723/1.14.4-pre7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/53bf70e446ecfb4a88a7546ab3479c4cc868e143/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/98d1396495562dbb32828ef50bad7112c403c47e/server.jar")
    @Name("1.14.4 Pre-Release 7")
    @Type(Types.SNAPSHOT)
    v1_14_4_PRE7(497, 1975, "1.14.4-pre7"),
    @PrereleaseFor(v1_14_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3e1a43d544fe15d6756c7461955c7f1899a54e9d/1.14.4-pre6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/338cd13bb237252c59b59043b49340e545fa1722/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d7b8f310278a5ea9efef03b4e441f12524253c5d/server.jar")
    @Name("1.14.4 Pre-Release 6")
    @Type(Types.SNAPSHOT)
    v1_14_4_PRE6(496, 1974, "1.14.4-pre6"),
    @PrereleaseFor(v1_14_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bbcefa7363b685d64b73f707d0045c5d64b0ff6c/1.14.4-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/db91103c10795811477ec33589b2e1cf452f43f2/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f45379dfa2ecd946a2ed81c354225a4181261333/server.jar")
    @Name("1.14.4 Pre-Release 5")
    @Type(Types.SNAPSHOT)
    v1_14_4_PRE5(495, 1973, "1.14.4-pre5"),
    @PrereleaseFor(v1_14_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8f267102ec892b73c906446dadc00dbce551a5db/1.14.4-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ee6386897fd6d7f777d4159fd45b26deaff14cff/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/853bf851bda5862b7f68baf93ae86fb90571ceca/server.jar")
    @Name("1.14.4 Pre-Release 4")
    @Type(Types.SNAPSHOT)
    v1_14_4_PRE4(494, 1972, "1.14.4-pre4"),
    @PrereleaseFor(v1_14_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/05582943711628ecc6efa1849eb23c0c51117cbe/1.14.4-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4e7e41622e1fb083e093b071396dad50168c9613/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b7ed47d4e600c6ead80f4c73c2e080625d07ef6e/server.jar")
    @Name("1.14.4 Pre-Release 3")
    @Type(Types.SNAPSHOT)
    v1_14_4_PRE3(493, 1971, "1.14.4-pre3"),
    @PrereleaseFor(v1_14_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c95933990092b5bc44ad976bd87e76482b29c347/1.14.4-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/96f1d6989a86f1bdbf4cc1583a88e6a16f985d17/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a7023b92091ca5872d35b17c8aab1c6daa833a69/server.jar")
    @Name("1.14.4 Pre-Release 2")
    @Type(Types.SNAPSHOT)
    v1_14_4_PRE2(492, 1970, "1.14.4-pre2"),
    @PrereleaseFor(v1_14_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/825d0302ed7d7b55616319cff67a6a0f989f9bb6/1.14.4-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bcabf6e9e9664796bd97e01c54d1dbf27aa47c39/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/774c5619679673ec772b0f01f363d0145a9d6b51/server.jar")
    @Name("1.14.4 Pre-Release 1")
    @Type(Types.SNAPSHOT)
    v1_14_4_PRE1(491, 1969, "1.14.4-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2b9823a8699fb6811acd1f553c5bee009d30f64e/1.14.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/af100b34ec7ef2b8b9cf7775b544d21d690dddec/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d0d0fe2b1dc6ab4c65554cb734270872b72dadd6/server.jar")
    v1_14_3(490, 1968, "1.14.3"),
    @PrereleaseFor(v1_14_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/da615805ddafebbfdba8f977793988328bfe2bea/1.14.3-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7f35f02e03ad1b837d0302c874e8cbc662bf1b88/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d5397db937499277165abb27f8af04885be8b6b6/server.jar")
    @Name("1.14.3 Pre-Release 4")
    @Type(Types.SNAPSHOT)
    v1_14_3_PRE4(489, 1967, "1.14.3-pre4"),
    @PrereleaseFor(v1_14_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c3c3274f38be10d0574d3386b432dc497d35ecb7/1.14.3-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/360c54d41522541f6eb303771192433de4ea1235/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a46e49e1541cf24a75aabe2756514565de83634a/server.jar")
    @Name("1.14.3 Pre-Release 3")
    @Type(Types.SNAPSHOT)
    v1_14_3_PRE3(488, 1966, "1.14.3-pre3"),
    @PrereleaseFor(v1_14_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e83b743d0b5f89c7ade23a702fe9dc5674624324/1.14.3-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a9358d6b2ac6025923155b46dc26cc74523ac130/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/64caea4b63611111d775e4558341cb9718a6ff4f/server.jar")
    @Name("1.14.3 Pre-Release 2")
    @Type(Types.SNAPSHOT)
    v1_14_3_PRE2(487, 1965, "1.14.3-pre2"),
    @PrereleaseFor(v1_14_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/581a41e0240e3460f2e30a069cf5523de061158d/1.14.3-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c49ca8d28e3c64d39dc46d21dd92f421a34ec241/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/966984c5d8b5c3604a8838f8fb5635b8b9cd73c7/server.jar")
    @Name("1.14.3 Pre-Release 1")
    @Type(Types.SNAPSHOT)
    v1_14_3_PRE1(486, 1964, "1.14.3-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8b96abed06b23d3b752e653ada36062d70bf3da1/1.14.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ca6c5a139045967229975c0c0b7f93e78b4314c2/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/808be3869e2ca6b62378f9f4b33c946621620019/server.jar")
    v1_14_2(485, 1963, "1.14.2"),
    @PrereleaseFor(v1_14_2)
    @ClientJson({"https://launchermeta.mojang.com/v1/packages/f90f601344058a812144eb71a49552b30a70d589/1.14.2_Pre-Release_4.json", "https://launchermeta.mojang.com/v1/packages/683456f319c3944c6adfdfd5631c77f3b25193e0/1.14.2_Pre-Release_4.json"})
    @ClientJar({"https://launcher.mojang.com/v1/objects/f14e1ab15fb7455c81c487b2d82b29773e7cf4f6/client.jar", "https://launcher.mojang.com/v1/objects/60783b7bab4125d55f187c859e4b41418ebc8719/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/631e46624daaf9e8357fcb985e0fce489b020e74/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_2_PRE4(484, 1962, "1.14.2 Pre-Release 4"),
    @PrereleaseFor(v1_14_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cf87272bd1bd131c19489a057506d09ff27e8e91/1.14.2_Pre-Release_3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e1490260d733b18dfc573ab181f9f2df8fb34303/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/307fb7e6208bd843060b1844857dc5e1d555a1df/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_2_PRE3(483, 1960, "1.14.2 Pre-Release 3"),
    @PrereleaseFor(v1_14_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b868f1988a00dab80ad4978dea5d693b9d2e2b5a/1.14.2_Pre-Release_2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d12a34d8584f5465a4851f77bc5a1ce05ac9d59c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a2cedc73237e999a5d408ecf0923a130d69d45a1/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_2_PRE2(482, 1959, "1.14.2 Pre-Release 2"),
    @PrereleaseFor(v1_14_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0159864166fd60a0b0e7481cbaa5c0c4ee1a1001/1.14.2_Pre-Release_1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b1802f2bbe126d3b9a524a187eab1be3f346eb1c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1aad89bfe7a14bee70de0b07339a2f319771180f/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_2_PRE1(481, 1958, "1.14.2 Pre-Release 1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/965bea1177bb974be2a0f7ee98ed732c0ab010b0/1.14.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/55ba86ddcbc3579397f41910463ffd4056e1e523/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ed76d597a44c5266be2a7fcd77a8270f1f0bc118/server.jar")
    v1_14_1(480, 1957, "1.14.1"),
    @PrereleaseFor(v1_14_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c6d68bf27f963a13b2110728cb15d77925b9b137/1.14.1_Pre-Release_2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4074da2da9e8207c022e5e12355d4fe87063b86b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ea3a8bee27e1ca4185bf703fb4e414800f533fc9/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_1_PRE2(479, 1956, "1.14.1 Pre-Release 2"),
    @PrereleaseFor(v1_14_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fec802601da1a9e284876e158fe4913e548f8786/1.14.1_Pre-Release_1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bf5ada613755329f9d194c1e8a5b26b6bbf30cca/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0bbed1aa2ef4bd4c0d6134461ac3e8eba1dc5f62/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_1_PRE1(478, 1955, "1.14.1 Pre-Release 1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d3c54d6469145f7c918537209660bf20e9207057/1.14.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7a762a59345c13af7d87111207a93f5a8607f6c0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f1a0073671057f01aa843443fef34330281333ce/server.jar")
    v1_14(477, 1952, "1.14"),
    @PrereleaseFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c122c7e15e90ffcfee53c642c9ba601e4365df20/1.14_Pre-Release_5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3e61d082391ad8d25c40d5825cae8843cfeaf579/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5d550762b9c82ab4fe9f259c14fcf7bf7ed8017a/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_PRE5(476, 1951, "1.14 Pre-Release 5"),
    @PrereleaseFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b0c367198170b890ecff1facd31b73a7baae8cff/1.14_Pre-Release_4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9d2f8dd80ddc2008ed87681186af5321cdb6e560/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cf967a23b452ab474bf7bcb69fd029a5f8b84bba/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_PRE4(475, 1950, "1.14 Pre-Release 4"),
    @PrereleaseFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3954faa41100368488e8657a15056b0e742a6972/1.14_Pre-Release_3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/12f85e0b940f3649c9ecb5a3201811f56992e5c0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6b747e1338e1aa058146032a659cf654c446552d/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_PRE3(474, 1949, "1.14 Pre-Release 3"),
    @PrereleaseFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ed347c4d701b86e5f4ec3388284db48ddf90cd4d/1.14_Pre-Release_2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7d41669ddd780baecab2926d6ea6b08dac7d834f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/353cc74b9aefd4675730449f50f5c0066063ac3f/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_PRE2(473, 1948, "1.14 Pre-Release 2"),
    @PrereleaseFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/22552a86344ec100100e299cefc2ce6031a74726/1.14_Pre-Release_1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/eb144c0dbc03116c832cdd20d28a8a686327905a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6f27430bcd9b06d3dcb5d2966c75d5e491915c9c/server.jar")
    @Type(Types.SNAPSHOT)
    v1_14_PRE1(472, 1947, "1.14 Pre-Release 1"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/eda0051523ec5df52cceed1ebe13135d3f268708/19w14b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a008dc3c45cb4f120ae5e0f124d5af2de1bafed5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/719781c28dbcf7d0576e81fe5e77d75c1f18117f/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W14B(471, 1945, "19w14b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a4a1606620a0f22b1652f7a93bd5fe51d79fa15b/19w14a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d55493da62562de4c8005f6dd117adf78b287658/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a786a10223f5218967bfd42a06f4bee9e9563f56/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W14A(470, 1944, "19w14a"),
    @AprilFoolsVersion
    @IgnoreTest("Protocol version is 1 on this april fools version")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/14b4bda35d123bb53313ce099943d40cf25fc159/3D_Shareware_v1.34.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/44db7d7bcd5a1bee6f54f6a623f26a1b3d1e293f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ffd306fc2aaa884755c5a6bf9fbd87aed26dd78f/server.jar")
    MC_3D_SHAREWARE_v1_34(1, 1943, "3D Shareware v1.34"), // april fools
    @SnapshotFor(v1_14)
    @ClientJson({"https://launchermeta.mojang.com/v1/packages/a2f724dec1e7661e0560b75add8a6b6667566a1a/19w13b.json", "https://launchermeta.mojang.com/v1/packages/9352276bd2110a6df9265446c6899c5e1865bc0c/19w13b.json"})
    @ClientJar({"https://launcher.mojang.com/v1/objects/06fb7ba6c76cbfd266d83e40d1041d6eaebc5bfb/client.jar", "https://launcher.mojang.com/v1/objects/bf33e377d07eadd8989570e24d9fc484aa39c81f/client.jar"})
    @ServerJar({"https://launcher.mojang.com/v1/objects/aa9be93b2a89a724d9a87e4ca0fb4e1fffbcdf13/server.jar", "https://launcher.mojang.com/v1/objects/6d395392d8aac9bcde96322831042c77410b0a19/server.jar"})
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W13B(469, 1943, "19w13b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9d1dd6b47867a3cc7be9efe0ad78e041a9fa79e1/19w13a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/dac80b7f57dee4b0deaa6c78821908c5a5cc7071/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c63080e9349640fda5820bbe48cacc623c99c496/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W13A(468, 1942, "19w13a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/22b64304b7d1e19325c8db612631db200776d77d/19w12b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2fc0501773a90d120c9f6476037c4bfba554a549/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/37d6d9753b8eac2420e9deba132c38e00c8204c3/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W12B(467, 1941, "19w12b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bd0f4bd23dd41dc63df25ee83943cbc6364d2db0/19w12a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/15ee2d37e5ec79dbf51aa39b000616be94033d6a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dc1a1dfef026d38dfc04b360653172f5428f86ef/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W12A(466, 1940, "19w12a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3a546c5ba2d431ef9c7a3af159501eaa33359055/19w11b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fba44eb056f80480832482cf7788f725a727e3c3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1c453ba8ccaabc38d924e7c11fe73c65a1978a33/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W11B(465, 1938, "19w11b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5fffae390b35a582f8cf1fc8db118dcc5d93bbf4/19w11a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/03e795efb9c91f2c4994826c45f3a99d2c695517/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/388221ffa9e8e1576e07f9839eadd2ac7bd51cbb/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W11A(464, 1937, "19w11a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c1c7dd946f1063943adc577cf9ccd941a83e1888/19w09a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8ea094f62c14d184bed801b9d7eb06120ffbd2b6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/266d772f79eebe55de3856ae3fe675c0699cd1ca/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W09A(463, 1935, "19w09a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0a3036dcde1934c2c59e78c63445ad7b8cfec551/19w08b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/cc17b46768c36095f2bf2f621bea12dc307b57d0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/045006b74b84a8e04e0e6e0c89c8069c9476938f/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W08B(462, 1934, "19w08b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bb709105f79aea09dcb8c279063d012787fee5f8/19w08a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8107282674163f5bb025548fef3ec26d6c5cd6ba/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f337f8dfb765f152388d5038a6e0e8830782e5ed/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W08A(461, 1933, "19w08a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/266a9d65454a6daf58e61e7014f4508d0c48d32d/19w07a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/656fcedd90336e82678d260e4fa20df958926474/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d370db01d591576477c3efc940a42926f43bc98f/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W07A(460, 1932, "19w07a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/60cb1ac72483ee66d261d3bdda543bb2a2ded49c/19w06a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/10c8f97e8d9d32a6d0a951a7db6f51818d5d258a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/20c069d373e77265aaeeedb733f7051e294325a3/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W06A(459, 1931, "19w06a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/23dcb5a0efe3528262aff27db4f486794eb30060/19w05a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/26f8cdc6354884a4564a6d4e9dceb4e4440dfb54/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/521021450baf9b9b98b0a6d0cb60e97f306f4f57/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W05A(458, 1930, "19w05a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/28300bfd6a3e806da0a62e1aa4226b12678651bb/19w04b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1db2550289499e9611fb03744a63adc50d8ac811/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7a5a3bbefcb4d27fd9ac30736eee06ae1e2c0991/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W04B(457, 1927, "19w04b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/49a754e11683174087e94d273a453e995fc97eae/19w04a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4a075e5ceae3fc15efd36222daeb832c94e16946/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/261edfd76c32c9f675c12264b6fa03f670c3325c/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W04A(456, 1926, "19w04a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c36987ae62acc036b4ab4bccfa70aa68ce8f3d0a/19w03c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/332bdc5f0f0505d86f1f7e5b0f5c7693b494a830/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e9fdb18631fc4ff23b06b1e827fb653ac20532fe/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W03C(455, 1924, "19w03c"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/77583d56b10ba442cfb64dc91ee4a1e084086f02/19w03b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c23a6e04cc6dc2c3a139d80d17e005599e2243eb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a3a358a7566debb17c5332fbc43eb8b84e000997/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W03B(454, 1923, "19w03b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f340aedc323586c562a336937139486a040ac43e/19w03a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7280ee42cce1c0371c96c95c22170d3aea7068bb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1e80738a5360887bc93a46bdffb07699a45bf5a1/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W03A(453, 1922, "19w03a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4f49595ce73756aa739488fcbb76e3bad5d569e8/19w02a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8664f5d1b428d5ba8a936ab9c097cc78821d06e6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f8078dd487483a917645f7a5561290e28bd875c4/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_19W02A(452, 1921, "19w02a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bb3dedc8edfa074b4d5a6a483ff073801dde6479/18w50a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/865a610fe77eb9d2fea48de1a02229526a391249/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/de0577900a9071758d7f1172dd283bdbe88b7431/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W50A(451, 1919, "18w50a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d108918c2200a58ee88a53af16038f09e2bedfff/18w49a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2a0b27ad8bd6cd2bb09e3a2210170fd0b5424c54/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5b6eb767f6708d351e3d1009a44115bb033b854f/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W49A(450, 1916, "18w49a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/885db4d59177a47165a6aff819bdd5d9c09b40cf/18w48b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4b1dc59156a888b2e20bbcbfdd5704fb4e7f6789/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cfa41132beeb877a093e044aba591d9dae236c38/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W48B(449, 1915, "18w48b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/31474d84c9c427381364b1af1101724c78bc7d19/18w48a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8c2c778a22201836bf482a8ed06e1b1f994c61e3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f0f04983d197388b05a4647f7a7cf8b5fbbac5d3/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W48A(448, 1914, "18w48a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d15cf2a1911c51c3409e955dd8614cf21a1a49eb/18w47b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1174ad74afce51a9309f1293af5bf24f60609cee/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/fa9d22eea98b62f6663f1aa8a25840e0993485e6/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W47B(447, 1913, "18w47b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/dd0869b53e6d122cf10f4d7a6f21d0aadbb0c8d1/18w47a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1cac5e82265eef3a7670c8752f31f02c65116aef/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7066873e9b86cfcd5b66c6a98d2587d95bf94adc/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W47A(446, 1912, "18w47a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/62df39229cdcdb64e34a5a37744ebaf87219e4a3/18w46a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/342ece78f131c72c4669c9aa27a7be542b911171/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6681e24d2dc9ba60a6e7d1fbbf25b2af70ff9d1c/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W46A(445, 1910, "18w46a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bfe49b392ddcb350e3b1640af871a2b40482fa35/18w45a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e03e8d27b07cccc85ae669e666bc3e4e2036c374/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a004069d93ebfd9a6d93c57b66becac29f876d4c/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W45A(444, 1908, "18w45a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/64b7f9d3fd28f28bbbe0ddb9fda297feef8814e0/18w44a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/20ea61f07e34b3e81ca356b6a71cc98cc4e571a9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e70221701d85ad9ed8be35e042f4c8e52fb627ec/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W44A(443, 1907, "18w44a"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4fa21e77b1c4b3c46e5f8437b21374a14ca43ba0/18w43c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a040369aa294a5a42048d828b03592b54db6a8d3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b2dc0522b0802cbb8e81d1afd3e46be8819d3c1d/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W43C(442, 1903, "18w43c"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0cacce08fa32592b33a27417591d6ef21540e8d3/18w43b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0b93502884da84e9d60532729eca59b70c96f281/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ed443be5ff6a304164612c545f0942fd99d53e13/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W43B(441, 1902, "18w43b"),
    @SnapshotFor(v1_14)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c3ae981f18f625a235a6aec9a924e2cfa224fa1a/18w43a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6f0fa604e9c8b1996c985aceb9b589fa4e583671/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/08ca3aaa7ff61d4ae06d5d63476724a1f32cb6b0/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W43A(440, 1901, "18w43a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/081135896bfc24424033c1ec0b2e5d3c69c5f764/1.13.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/30bfe37a8db404db11c7edf02cb5165817afb4d9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3737db93722a9e39eeada7c27e7aca28b144ffa7/server.jar")
    v1_13_2(404, 1631, "1.13.2"),
    @PrereleaseFor(v1_13_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d62148cdd47d2e7e524ea027bf01d5f74f26a020/1.13.2-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3ad1375091d9de67beb3197dcd173d05ff27dd0b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2f39df32f20196b5a6acad117f7d6b404b069c58/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_2_PRE2(403, 1630, "1.13.2-pre2"),
    @PrereleaseFor(v1_13_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ab2a76c05480aa1b56a63377c11766fc7f3cb388/1.13.2-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/843bc6377ff859b7744d12df0b62653dc318456b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/744df5d6872645a8f919459473e0e02a3571e6bb/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_2_PRE1(402, 1629, "1.13.2-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bbed6214da465e25f769366835b7321d5380a1fa/1.13.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8de235e5ec3a7fce168056ea395d21cbdec18d7c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/fe123682e9cb30031eae351764f653500b7396c9/server.jar")
    v1_13_1(401, 1628, "1.13.1"),
    @PrereleaseFor(v1_13_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1594d6f7242d2065c2b61c242397f40677e5123c/1.13.1-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7eaeaa37e0c7642d519c39de70a630119ad4929a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c2a4bcf3e244c46f13c39e31e7ef6030564fb6c2/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_1_PRE2(400, 1627, "1.13.1-pre2"),
    @PrereleaseFor(v1_13_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/45558ece6af1cdd1beaa4d18c0ef984eee8598ac/1.13.1-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7f7ae07cc319346b632f6c9f26ff8c67728b203c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/988fec4e71e5fa1fc29a50230de05a11973d62ab/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_1_PRE1(399, 1626, "1.13.1-pre1"),
    @SnapshotFor(v1_13_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c031592a8af5278ade153116919b55aa62895e91/18w33a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b8fc21c1446df367ac02946f1b475bd72df84dd6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e62f0a29e4ab5963488330f29c03ca2914b5b22b/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W33A(398, 1625, "18w33a"),
    @SnapshotFor(v1_13_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/29eed1d54f2527422dc9f6f90137f35bac39330a/18w32a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f4f53276150e295afc8cd300d87568f279607bfb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d36429ccdcaa73cb37b366d608024e3a6a5a20ab/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W32A(397, 1623, "18w32a"),
    @SnapshotFor(v1_13_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8b603c88a9b33a27a4c436b6b71d1740dbae4ad3/18w31a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0a343ef39365d70908a3c59fbbf2d9c0ddd2ad75/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4646084899fb62a7b9afa6f453fae4e6e786e5a5/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W31A(396, 1622, "18w31a"),
    @SnapshotFor(v1_13_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d27430174b9369ab860dc9901e76ec4941f2cc84/18w30b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e6bfb0dc26e29d80efb137c8e9359fd3c324cf1a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/373b2fb24db8ed21d25483a986e9eb7f945c5277/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W30B(395, 1621, "18w30b"),
    @SnapshotFor(v1_13_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/dc1939cbbccabdfa7c5a19bcad0109351d175f1e/18w30a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d368609e838cb1b22e1e1e9eee8f83dbe4847909/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4cfe675115064caad14712c3345660f4069a2e8b/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W30A(394, 1620, "18w30a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1efd5dfcae060b847706500e408a76674922de89/1.13.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c0b970952cdd279912da384cdbfc0c26e6c6090b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d0caafb8438ebd206f99930cfaecfa6c9a13dca0/server.jar")
    v1_13(393, 1519, "1.13"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7a5c5769e1c420db177040c33a4516515bdc3e55/1.13-pre10.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/72c4fbff2a1318a57bfb66e325055064a13378a8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2ffcae7a9489d515b0f733430923ef974dffd56b/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE10(392, 1518, "1.13-pre10"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b54392801613930233d5f96b44662729bf23f7e0/1.13-pre9.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4dedcb718a3382496d19d13cfe5dc070528a15cd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ee66f5cb1247f4340734a151db4f940bbe04f833/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE9(391, 1517, "1.13-pre9"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/aa97bdcf593e6ff67b0b044590eae96ac81c5572/1.13-pre8.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fbece4a24e47af57c3ee75e331f9390309f92ae5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b04f82ae0f3018c4c22a153184b385012c4d0814/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE8(390, 1516, "1.13-pre8"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/dec652f76a03e192b7b8de0e093869ca803eb4c8/1.13-pre7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0b5d9df7bc2d0e4fd00d0bf7cf4409b999567497/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6cd8348fadedaa1de5851f449b995c835bb569eb/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE7(389, 1513, "1.13-pre7"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/75e367814db76567ca02da12c80246cd22935111/1.13-pre6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9405570c459c0803da2754b34e5ffeb74413a904/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/71a2f9a760f0cbcf09d1eae60eebe1ccbb7ea1db/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE6(388, 1512, "1.13-pre6"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b5f4b7d67e57a2784204af0c744e6bfb02a5f04f/1.13-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f3262055c586a075fc84f9d4bc76b3cf1a72d69c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6d9ede222df5726059aba1b01f99c328bc16f1a5/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE5(387, 1511, "1.13-pre5"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/aca7f5d7d13b996eeaf6f186d208769f18bdb04c/1.13-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c4a93fea1ea2a1a7886c8f5f66f6d929db53f021/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d57007a8722ed645319666fc56b27690054d8363/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE4(386, 1504, "1.13-pre4"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/06c31253996b4de3188705e3d6c33577d1f9a305/1.13-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/94f2e86f94d7d80c19ec1d3d637b1ef2d862be9e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5406f31cb5274ae48938851de697b32976ecb499/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE3(385, 1503, "1.13-pre3"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/05ba232797b3cf7fa2ac879624a7b5de1d6651bd/1.13-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b833d32e1846989a61c6c3faa40232bb72bd59de/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5b312060d457a1f75846afd3935ec3f140da3942/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE2(384, 1502, "1.13-pre2"),
    @PrereleaseFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a4d5660628eba8143c723ff40112006365d02f1d/1.13-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f9b3302a997e52af71efc3904d805957430e4820/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e031e58e1d9e745877404530d39775bf9ffa9a56/server.jar")
    @Type(Types.SNAPSHOT)
    v1_13_PRE1(383, 1501, "1.13-pre1"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/27a99c8d0f2a998a3fedb180804a16f2bf99b95f/18w22c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ec446c24c4842f6237ba7c560a5b0dae9ac87c22/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d66173b86e26e6835e36c63eb2828652186a4698/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W22C(382, 1499, "18w22c"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0aa1569c658a410cb2f83d1b052635d7e8392683/18w22b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a7db66a86e6696aef0fbfbf813293ff1aa01a64a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cc0b6a96e537528cdaab685c4eaeeaf8ed905b51/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W22B(381, 1498, "18w22b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a8d3d3213543f0465d5f465f8c1e80a2957eefa3/18w22a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0a864719da82dd91bf5d7031cf9c40e5ec3dbfd7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/077225ee7bca03f521ed8df86fa4740b8e7a3cad/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W22A(380, 1497, "18w22a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e898f26c0a93e726836fd16d89df63837e6eee82/18w21b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/77b9304fd8e97953de4c6334f56abe4bc2661fe1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/df8cc7cfa4c2d24f31f5997a102f1d6411f038d0/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W21B(379, 1496, "18w21b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7cdac8c7c494291a01f151a5dc146f38a70c4a2b/18w21a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9b1d1486518585537a0d9e608dd27e3946880d48/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2022a23da58dc55371b6a182fb1ba59742dc66a2/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W21A(378, 1495, "18w21a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a7e08d32440189aa8e10f0abaf7a4fa0c9e8afc1/18w20c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/273595b95fff5080b74cefe18ce0c747d02663ed/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9e0ffb265e3771dc5c7b56f291b9c9d8f668f48b/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W20C(377, 1493, "18w20c"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/86e70871ca7a1b6d2ffa33cd8df79357a29dfb5e/18w20b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/91aa79a2aa3c656221defebf5310c1ffacfd81ed/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/35304e17de5fbe503b10bad50192d14a38e5cec0/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W20B(376, 1491, "18w20b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a64998fc7679c161aa9dd671bec77329dd68e2cc/18w20a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/89843d397a9b0fd42bea26ada6890ebc693ad288/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/108a051216637e0145f6b0e66182b48736595fc3/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W20A(375, 1489, "18w20a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/dfdacf219ef2d126416e8c9e3d08feeb244a8a49/18w19b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6e5306869f9644e0a91f23345b4f445742daf5cc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/87edb914af0594016fab77eaaa9d25c7f1f1d132/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W19B(374, 1485, "18w19b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cc868f094a6cdec8e1a24ed90dde12c8006e308c/18w19a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d52b2e8f15a764000c1ca6dabab4440069ff97a4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/97ad982d57fb7b7cb9dc28ffd87c79538b1901f6/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W19A(373, 1484, "18w19a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/97812ee3d6cc39ed5d0eb8193704691480bdf3b1/18w16a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8787bc29f2a1e151123f70e21698af23374d1b08/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/87ca53126694ff105edf65d8206a4529fbadd0a3/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W16A(372, 1483, "18w16a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/104ffb10f7e2017e50525ad6def27d43a1351ffb/18w15a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ba02c440e50e0197a13cef03ca2356c8cc51f058/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3f9534ab77a524593db7a20196e41ae36b23d69d/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W15A(371, 1482, "18w15a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f1663847c676301b39c6165dfee617b65f633eb3/18w14b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d9b4fc98eb5242346ed0421f6ccd3c9032dc0514/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/85d6445fc4596e6b69fb00f0d3e5462dfeeb933c/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W14B(370, 1481, "18w14b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ddb3a3037ebefd9c7921482ce7b71470157b2bae/18w14a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/73885c6bf4fdcca8ab1ca22b56f69c9945725770/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/50b4ca8fe7853ae6757a163a80e67cb8437fb082/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W14A(369, 1479, "18w14a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c508c442a75e5f9bc5645fc6b5d81c95ef9cb9d9/18w11a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e4abfe0c5e7f490a1071e7c99cb1cef81ffd89dc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4286b7cbc4709c8f61c93a77b42c70918376cac3/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W11A(368, 1478, "18w11a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/298dd4f9927310f91e999833ef96211f7e4642db/18w10d.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/062c014c0e8684ca554d3abbcfc31e3e56334a2a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/28727c7dfb62c56ac48153ab9a25d42115f85f94/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W10D(367, 1477, "18w10d"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2777b49ae9c7260f4ef39f9afbab6cdc3b0ee703/18w10c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/cec68c82ce5824f74069e8ba84871786077da6ab/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7c2494311ab74f97623ebf6e2d5beba625a9d5fc/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W10C(366, 1476, "18w10c"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/351e6670bac10aa5ae50017076a01c1f7f6ffec8/18w10b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/383e0396f585fcc5a487f04fcb77a9743a0e44c3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b45d7194b91327c8fd2c1d0d5a738b80c9600562/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W10B(365, 1474, "18w10b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9040a647a6496201cf0bc0139664d8eccf153a00/18w10a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fb24610e6fca6f83e8b45e3a46224601d4ca6c27/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7bb1cfb4560d2e99551b22a631b6087d43817a45/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W10A(364, 1473, "18w10a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2363421af13b87a427a32273f733f628db3bc262/18w09a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/701085c1b668d45b7c0ee5ea911b11d6691c01bc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/57dd2fe4a2fdb6e846b978e77442465d2ea27f43/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W09A(363, 1472, "18w09a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d81bdb924f53a6abb940501c5c1ed03966a2853a/18w08b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/665fd71175823d517cee81154b374bb27ac5c070/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cdfdcdd799087d9b66f04667f0717a11e28c29cc/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W08B(362, 1471, "18w08b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/57ebf115603deaa30e1e22bf4e13cd4824bca925/18w08a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/52cacb4730ddee013b67e10e49b99955b4ec10ea/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/09b2bc558d86878ce69f303ddbd62bf4489db068/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W08A(361, 1470, "18w08a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bfa0e12abbeca98ea31931a8ff9e328bb09d017a/18w07c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3d5865b5bf013f84e44c3f096193aa45c672bb51/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/52e141870c3c850811710f2ba07eb3e7e583ea92/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W07C(360, 1469, "18w07c"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/24ff49e1f821ccac495af70d7e8779e013251294/18w07b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e1aeafe25aa454e35e53bd489523bed51aa5e826/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/669811c0df3fedef8a15f1b31c96df966b9aee79/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W07B(359, 1468, "18w07b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/45d425c0ceb8e451886f6e90ff116f20a90d17d8/18w07a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fa2960642589fc7bd3e14049ffe7d84a4d2bac1d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e90255faadbb7f009fa38a507f62f751dcc56c9b/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W07A(358, 1467, "18w07a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/83670eeb3b4579b6f93d4228b7e2bc1f89475d71/18w06a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/78ed8d3359453614d8f69bd982111e8aa6c8f612/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4e47158fd42d966884a7ffb7440b35d86c038049/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W06A(357, 1466, "18w06a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a9e94f4c88dd7905aa475f04ba3bfc134b70754a/18w05a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bc3c321006bd1864a9e3dfea8c351927c44519c6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a4029c808cef57bed3228a51dcb7f68edd018a77/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W05A(356, 1464, "18w05a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ceb0851b72357177d6d817ddda3af082ca80ca3a/18w03b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/39b958dd8e4ab25c6b6522ce9c83d4bd45173738/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ef8c70a7c9b88c02c64ea01d050614929b7152f6/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W03B(355, 1463, "18w03b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fd5fb7fae09fac64397224517ab529e3bbfa3e70/18w03a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b9e9cfa4e6019fa1d4aa7b368366b9d8979db2a1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/713a291a4da5cad056964c1fcda8c888e154eb73/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W03A(354, 1462, "18w03a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b0ddd29e3ab04729b1948bb50d9431cce420724d/18w02a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/05932046cbefd34e42ba21530b96986435163bda/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/950b737e9cefc9f91f286190166f062d6b0e0105/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W02A(353, 1461, "18w02a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b1f57752ac2e0ead0fdd7434140bf2f5088cff40/18w01a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/504f07f4a10f295522a57f2b1163298dc4a63103/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/47a8d2bb4db5b5e3db6b7837c9f0fa17ea660448/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_18W01A(352, 1459, "18w01a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e116ee9be7f2aa00af3c3c6ff7a95991b550b1b6/17w50a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ebb9600d0f33b6ffd1dec8fc3010677dc07accbc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/670c67a4dfbd1070a9be629124ddd8aac8d9b9d9/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W50A(351, 1457, "17w50a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f8d0a2d9bc6b178c941fb31069196574b4858732/17w49b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bb28e11e5b6ca4c0678d00bf82d061d282ab6445/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/caac50590085014355070ea6381baec0f58aa9f2/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W49B(350, 1455, "17w49b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6de4e269122102c9cdaa49ce1a65f9b185dcc86b/17w49a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a58ce444458ba9267973c31877a57eac5a5cbeda/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/561fe37463ef30b4e1ab4c6b1da057d9e2b17801/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W49A(349, 1454, "17w49a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f0cd9d5fef902a57075246580a12413caba68c4b/17w48a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1b31d5152548eeb7dfa94cdeafd8d9321de8f8c3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e132a348243b824ba6f74569c8b1080b77104981/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W48A(348, 1453, "17w48a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7081b367c5a7d140cdf58fa6788f403968808b19/17w47b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/049d118c3fc0d3fad544aaf387ca6c5cb2cf4e00/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9b4e7894906f0b379c7300cff0b3e68a4b9db662/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W47B(347, 1452, "17w47b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/602e8ef598d492f707621954685e029434f27ede/17w47a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4485b04ad6358eef525aeeb246fe2b6b23d232ee/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0cec7f11d7bf9c36464b1815e5bbcb0afe6db019/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W47A(346, 1451, "17w47a"), // flattening update!
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5b07e94d1276496e661c99d117b8dc5df4f6d099/17w46a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fd90b150fb461573b121a7e6b6de657ba382f14d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9127416e2341eb8fb7b63636c3ae39efefb2843b/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W46A(345, 1449, "17w46a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f9acb09376005f47f647ebb8bc687e5ba9e515ec/17w45b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/83e5c3728b473a8d5afda12906a3e581888489fd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/eec0c6c49b1066b648f39e1dcef8c76510a794dc/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W45B(344, 1448, "17w45b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c3a0cc0ba68d054095dc52010b7b71a35b9ab17f/17w45a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/42c93d04a82371094d9a4a844c932b8db45d3a40/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/471b2dfa12e4df234057159ce5ee8320da3c84c1/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W45A(343, 1447, "17w45a"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5ee9c314fc10b6501711802802818c0d75d6c4e7/17w43b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d4316c6f1dda3211e8c990259d9be93fa1517055/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0447782ac5280f8f981c3998609928984213a4c7/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W43B(342, 1445, "17w43b"),
    @SnapshotFor(v1_13)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e83e27bd416cc5abed43f86e01579fdeb1801ea5/17w43a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e37ed76424b6d3f5ff08842ee2aec35619a00e99/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6f6869d527140e5531e655bda10911efb65425bb/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W43A(341, 1444, "17w43a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6e69e85d0f85f4f4b9e12dd99d102092a6e15918/1.12.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0f275bc1547d01fa5f56ba34bdc87d981ee12daf/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/886945bfb2b978778c3a0288fd7fab09d315b25f/server.jar")
    v1_12_2(340, 1343, "1.12.2"),
    @PrereleaseFor(v1_12_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b3f6aa5c952b9ff8c39046b3fb7fe3b712a9909a/1.12.2-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/404877dbb91887a2b481972912f82e98c55cdea7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/641adfb6a646fe12f1fb2715ed4e3167c7ff2f2b/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_2_PRE2(339, 1342, "1.12.2-pre2"),
    @PrereleaseFor(v1_12_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ce18ba69f4d0a7947d182b47d7a3bd499d24a1e2/1.12.2-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/97d35764e0cd59b163c765d422a8d7af919bb705/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b81c81335e68731d66ccddc21df0c06d7b9b46ab/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_2_PRE1(339, 1341, "1.12.2-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/24b28f562e354309697a1c9d835dea55a185df1e/1.12.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/83385d346cf7f97d1e447b888750fb88e9928b93/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/561c7b2d54bae80cc06b05d950633a9ac95da816/server.jar")
    v1_12_1(338, 1241, "1.12.1"),
    @PrereleaseFor(v1_12_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fb7202af7c5d5efd6f81e5db6aa8de04e049bc08/1.12.1-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c1448a29036f20c03557720eb1754feab15e7f5d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b25c39f4658911169e184f00a24798f6463ded14/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_1_PRE1(337, 1240, "1.12.1-pre1"),
    @SnapshotFor(v1_12_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ed63bb5facba58bfeed785149e05dd33910135fc/17w31a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/67bfebbd0af5e7b7b4d089a7e9b63dbed2eeacd7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/00b83b98c91dbe3531342325f72654ef6d7be6eb/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W31A(336, 1239, "17w31a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/367843437acbae63de3084dd6afd3dd8bd2a7479/1.12.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/909823f9c467f9934687f136bc95a667a0d19d7f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8494e844e911ea0d63878f64da9dcc21f53a3463/server.jar")
    v1_12(335, 1139, "1.12"),
    @PrereleaseFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d734d4070653b2c0e8e6a5abed905d78982203f7/1.12-pre7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2439b69adbb6d5f2e8fee5145084603e033007c7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a8d79598161edc5f67b606120ea9e62bcefcaaa7/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_PRE7(334, 1138, "1.12-pre7"),
    @PrereleaseFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3fa2c3b5ff806ce0acbffd8db0895525ed253e32/1.12-pre6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/12e23c0811c097ed63e50fad861fea297e1ae0be/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9bc0e57debc61da93c0ea0d97849254db4f4e556/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_PRE6(333, 1137, "1.12-pre6"),
    @PrereleaseFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2069bb4938682be97f248baa73d970d37b61d540/1.12-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/87f980355264f222daa292528116281d62231402/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/40e76b2836c92cd9e05af61bb64046c8650c088d/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_PRE5(332, 1136, "1.12-pre5"),
    @PrereleaseFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9fc87076b48db5717efe92183a44049b90eae915/1.12-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a3c2de97aa317cc3d71614689d14592d555e02bd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/588bcccfff42acc2cb6f7c6470cd6bc8ba393668/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_PRE4(331, 1135, "1.12-pre4"),
    @PrereleaseFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a2dc7f1792b986f3b1456630e0a76b9cfb37acc6/1.12-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8929ff4a80fae0cf26e24bb05c6706f4d7638fdd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c985b2083848efcc8d1658d6cda5644681035f80/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_PRE3(330, 1134, "1.12-pre3"),
    @PrereleaseFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a472bb7234be82c489f5c7fca03724298a95585b/1.12-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/16c7be111b1efe29f163abc16426705be51ca7b7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e5fd1c4202f9b0855d9104b66ba4182d52e79c38/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_PRE2(329, 1133, "1.12-pre2"),
    @PrereleaseFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/51695897d818f3414ce5dbea33dea58682c6dc44/1.12-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/451d983529e78b807c8f8479f7f542863b1b6ae0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ebcafa3e1a3312500893087bf4bfb6c6f335ef0e/server.jar")
    @Type(Types.SNAPSHOT)
    v1_12_PRE1(328, 1132, "1.12-pre1"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/03c7dbe028a8a62862d4fec5951343ff0f5012b5/17w18b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d10320fe0a9bf0e86bbea792216bb0da4430b17a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/915c1833209d588ade3e064577700037093861da/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W18B(327, 1131, "17w18b"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/03ca07f26b8336732e720ecd13e912e19f0d3a77/17w18a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9eda8162e92b2db820a140f4b4d8fc7b70d32b3a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b1f45946bd74f4e2cf1833324770809ebcd0b7b1/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W18A(326, 1130, "17w18a"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f8751aa4fcb4f2aa0955c3fae1d4cd9a12c89979/17w17b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/37e3f7d47f6f528455bda16684ff00308f375b1f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7cf669824e4c8340050adcc2125f1ec4cb84feac/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W17B(325, 1129, "17w17b"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b2ffee6fc34b1f2cba708c544492ea939d6773fc/17w17a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fa78ab696aa02914171deb57e31cfb737506f272/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3795d253cfef44f1f1467422b4399d1770484dc0/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W17A(324, 1128, "17w17a"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/635a0c0f77e2bf6157c41e25647dfe65cc1b18f4/17w16b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/339b2099d66421af8f194e76074ebda5694abdb3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/80601961e590046727791d6b18f51d840ea86e1c/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W16B(323, 1127, "17w16b"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4baeef9effd9d3eacdb6bef1a974f20be394278b/17w16a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2b7de5e297fda9fc35500c6db18627be00ad003c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/47cfe5d44ccf6333b697da3e82e35bb3725e53d8/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W16A(322, 1126, "17w16a"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b629aee8a9e4bb4711ee5583aa512d4eaaf73e2e/17w15a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/243f42af3ecff89646d001d781ed42c7c736c74d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cc26caa34e1a53326ec374d229db07a0e2a7de17/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W15A(321, 1125, "17w15a"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/51f1acd9b0e5f8dff45dc80b4d73eb8e8317e733/17w14a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/23500be7cee6c8a4519d475a7c8f2b8493a3336f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0530caf1d099fc730ca335a21bcf2fbb58c42c64/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W14A(320, 1124, "17w14a"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4b1a19a71cd90167e7464da777fc6d4bd93c8f6c/17w13b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7104e16e9e02af09cee90cc95487502641e5bbbf/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7bd51f821ed09b6a1d3a9a9b2fc67b48f1d829c4/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W13B(319, 1123, "17w13b"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ec0d9ff2917f223b24725b259d7aea1249f4a07c/17w13a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8a11edbdd3d8be019b3eb85089f2f5d97ec3ac4e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d3806f89b9c90cbfb78919a3bcc010ad2e5d6ebb/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W13A(318, 1122, "17w13a"),
    @SnapshotFor(v1_12)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/17070716831f1f55a42c2f218fd5d7f56c3407fc/17w06a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ace57ac6f4a661fc095241004c46d1305c573bc1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/37441cab126ee2a4f292c9bf488c9dd800cff841/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_17W06A(317, 1022, "17w06a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6bd228727ed48bd7ac7bdc0088587dad0fb7c02b/1.11.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/db5aa600f0b0bf508aaf579509b345c4e34087be/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f00c294a1576e03fddcac777c3cf4c7d404c4ba4/server.jar")
    v1_11_2(316, 922, "1.11.2"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/363096f6590653e170bcfd56c085c6a77578ba42/1.11.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0935745a11806d6b4cf00221938e7560c23f9291/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1f97bd101e508d7b52b3d6a7879223b000b5eba0/server.jar")
    v1_11_1(316, 921, "1.11.1"),
    @SnapshotFor(v1_11_1)
    @ClientJson({"https://web.archive.org/web/20161218235805/https://s3.amazonaws.com/Minecraft.Download/versions/1.11.1/1.11.1.json", "https://launchermeta.mojang.com/v1/packages/34b08beba7d9711dff07484e17daf9cd9681c770/16w50a.json"})
    @ClientJar({"https://launcher.mojang.com/mc/game/1.11.1/client/94d4254628f24668b191fe4d8653615e9cc2ecbc/client.jar", "https://launcher.mojang.com/v1/objects/925650c3ed9e1e79dd3f846a49a9de3a7f8e700c/client.jar"})
    @ServerJar({"https://launcher.mojang.com/mc/game/1.11.1/server/b58a0421c86378759be16f4658817fadad619c72/server.jar", "https://launcher.mojang.com/v1/objects/d4d30a5433846d205974ace4cf34c9b294e0833f/server.jar"})
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W50A(316, 920, "16w50a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/340d2e0f200af20b1e4d5da501facc7fc1cfb0e5/1.11.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/780e46b3a96091a7f42c028c615af45974629072/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/48820c84cb1ed502cb5b2fe23b8153d5e4fa61c0/server.jar")
    v1_11(315, 819, "1.11"),
    @PrereleaseFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fde7baf263756f1bfc20ba51a5b9bc6333b23bd0/1.11-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fdc07c099ad33f77c426464754841747a09ee8d7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7e2884f11e3fb52ed1ad82376e3cada3aa95152e/server.jar")
    @Type(Types.SNAPSHOT)
    v1_11_PRE1(314, 818, "1.11-pre1"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/85cdd8a8918be3975d4edb1176cfa9971fd2681d/16w44a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fa3d0b4d577f475534e600a0ee1a62fb08ca29dc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9f30eff92cc234034581f0a1ef40c6d76f6b3e69/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W44A(313, 817, "16w44a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5ddba06d364f30cc871465a25f7325e520a0e544/16w43a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/70449cf6d3f1f068ef7269d49ccdecd18e3a4712/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c5cc57bfd0a3462c2634a37c83877e91f25f020b/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W43A(313, 816, "16w43a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6ffff59eb02a4fef3c6aee893136858606832183/16w42a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3742e2ccb78ef02f1820f7dc73f5aafcf8c213a8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ad6aa39daf88864fcd84b231638e3dc28bde83f3/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W42A(312, 815, "16w42a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7d4ece5f41496402d25258e5725b88cb6190284c/16w41a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/89c23ff48bce1df436919147044be1668270e60b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/94f47b24edd154d89240e49d9b7371e74f433d19/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W41A(311, 814, "16w41a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/53c8af9aa235a12b623fc6be9e02c4aafc1df3ad/16w40a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6e5f07830bbd10ab10b6cccdaaef17c6b589a6d7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/64a1a5ba3f347c5e03477b42ac13d10ee193b51c/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W40A(310, 813, "16w40a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e811be4a812aa532b0bbab31d4b22b3b9f7dee70/16w39c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/417fe811581f045d4f5de0381b08cd7dc3744c41/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/df13c6cbf5fc735896b22f56b1f8940dd11a3b5f/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W39C(309, 812, "16w39c"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6ee9f1afbc2fdf74e5c07cfb7298cb84755c6cfd/16w39b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f04ca007b45c3fed9ba03c5ada8926320a4ddbd5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/07eb3f85fc848ec8e209377aee1f7f574566e130/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W39B(308, 811, "16w39b"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bac2bd719657ff8524cf97b1913e5a56bb150ac8/16w39a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ebfc3681ad92d9d200232f913645411728f45dc6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f5e840e9f37ae7f50c9c979669279bcc68c91fa7/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W39A(307, 809, "16w39a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fbd5d83a14b4d6e8f7029d3c08dd6985d09c4f40/16w38a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e249ff8eded25695b921ccef066bc8a5db154a6d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/95ffd7c33ad9f978d4a23762978923b96fc0aa7e/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W38A(306, 807, "16w38a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9d775a6488e53e42267585dd5924178c3f601d7d/16w36a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f333065b34c818493736a90d5f559ee702957bd3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/921580b22ce7d48f9d541364a3b04eebb680222e/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W36A(305, 805, "16w36a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e64f1a32444286fc5fcd65dca20709ce5963d066/16w35a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/96bf2617491528e0a4d636fa08afe3c8c14282c7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/16ad43cb3b87b0279028af26201af7651b87c9e0/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W35A(304, 803, "16w35a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3065c85819ff5854f991c5e4bfde2b6d8832d981/16w33a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e565f6a8dacc85b81faaf17e4a13125b2ad5c335/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dfdda3e5ba769ba0634ad43ca1124a401d6addca/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W33A(303, 803, "16w33a"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a672dd946075b43da267bcd73d3953f09845767c/16w32b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/71afbf19a5e9d37cceb449743323acbb17895dae/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b912ff1468e93003f36cda32db5d70133b517f97/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W32B(302, 801, "16w32b"),
    @SnapshotFor(v1_11)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/78178d605ec7bb141b91b4eed36adb9ffdf82527/16w32a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/198124cb36e4284feec3204f8e20f14f6a531cc3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b1309cff6c574e9487e3413773841ef5eb260587/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W32A(301, 800, "16w32a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9e23991d61e9b4eb9dfee56cb8ee7392fb925aff/1.10.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/dc8e75ac7274ff6af462b0dcec43c307de668e40/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3d501b23df53c548254f5e3f66492d178a48db63/server.jar")
    v1_10_2(210, 512, "1.10.2"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ee31c565a9aa614676b786c55a0be77268743b60/1.10.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/44b389fff90324c4ca18796d4428a7b8ec6c2eb0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cb4c6f9f51a845b09a8861cdbe0eea3ff6996dee/server.jar")
    v1_10_1(210, 511, "1.10.1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0590cc1c11f1be246af9d972f919693bf6b0d1f6/1.10.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ba038efbc6d9e4a046927a7658413d0276895739/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a96617ffdf5dabbb718ab11a9a68e50545fc5bee/server.jar")
    v1_10(210, 510, "1.10"),
    @PrereleaseFor(v1_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bd196d2494f334adcefd78089b0d371a22bee56b/1.10-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c08e980eb1d79405c9213717df4cd11e509b0761/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/aa4ec0004eb20a70ef7426816cae992d73718038/server.jar")
    @Type(Types.SNAPSHOT)
    v1_10_PRE2(205, 507, "1.10-pre2"),
    @PrereleaseFor(v1_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/08a9c29b2cd4df7c9ad51ab0be5f9683c20d4c3f/1.10-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/33c87d0abcd90cfc694ef651e96e81689e14cffb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c9c34ba406f694e56c1729b465c25e0f63ce9743/server.jar")
    @Type(Types.SNAPSHOT)
    v1_10_PRE1(204, 506, "1.10-pre1"),
    @SnapshotFor(v1_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c9e280d280279b0cb1b4906d33fdab47524dd719/16w21b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e0dd76d667fec04c875f3e8b6e9465c3f03da2ef/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6dedac03d0fbfbcabe8ef09b170a577a9f72c6f8/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W21B(203, 504, "16w21b"),
    @SnapshotFor(v1_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ccdf81a69335bc84fae0ae69663ae82f9e277a0d/16w21a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a48f966d00c5d9bf300c2b8407efb98df743bde8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/12d65aa459d3e93643746dce14c100b05fbcdddf/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W21A(202, 503, "16w21a"),
    @SnapshotFor(v1_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a1958213b24176f0cd6698929ae965caec5eb53f/16w20a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/73de5728b610cf31bcc9c497447856374893249d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2cbcbd735cb48c8cc2bebb7b43c8afa69a923269/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W20A(201, 501, "16w20a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7f40b382dedcfe9eca74a5b14d615075ec34c108/1.9.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4a61c873be90bb1196d68dac7b29870408c56969/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/edbb7b1758af33d365bf835eb9d13de005b1e274/server.jar")
    v1_9_4(110, 184, "1.9.4"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e8bab05ecee645e3c9b962f532ca7fd6c52e120e/1.9.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b6985b0d3a0520dfb6f17eeb1e8ba58ce9577061/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8e897b6b6d784f745332644f4d104f7a6e737ccf/server.jar")
    v1_9_3(110, 183, "1.9.3"),
    @PrereleaseFor(v1_9_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/84e5b1bf3974e0ef38f9badce9db14d68419a57e/1.9.3-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/364766592529c4a74397ea33ef1f10eb01cad872/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ef902371fa5cbb50288b4801f9e58432c627d8e7/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_3_PRE3(110, 182, "1.9.3-pre3"),
    @PrereleaseFor(v1_9_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e1a60758446450cd5631d5191216b00b1e87a633/1.9.3-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9f0ed8007fee5763a1d8c18e2e51eedb855b3e55/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/41c29ba7fca8d2a0ce3bab620600459e6023458c/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_3_PRE2(110, 181, "1.9.3-pre2"),
    @PrereleaseFor(v1_9_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9f5e4882ac87d6e479f60e62705f0b6bd3f96d47/1.9.3-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ae942605669e2d25ab539b8c2ea45d469b022bea/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5d7391b36ccbc4ec04a259a3f7c6609232f30762/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_3_PRE1(109, 180, "1.9.3-pre1"),
    @SnapshotFor(v1_9_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/eb2ded7b829a5938af1f83587c4c63d27a953024/16w15b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7500b534d32a89f4e8de937323aabe6fd9778ea2/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5add6bcbd04c20bef6ed5db4431651c0c1282489/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W15B(109, 179, "16w15b"),
    @SnapshotFor(v1_9_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/93791968f6648db8039e972d13dfc405b1516f8d/16w15a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/042a78b65cfd53a0dbf102bba24dfc7ec295905b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c254bc24caac3f6d5059f2cc64a80ded2e164289/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W15A(109, 178, "16w15a"),
    @SnapshotFor(v1_9_3)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c62d4d7fd9df479b0f5084e2c833a22474b25c23/16w14a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ac59f57ecf383113e3dd92dd90d2fd7b391252ef/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5616b2213b727241821a137b4ef290c7bbace20a/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W14A(109, 177, "16w14a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3cc8cee91366290508c8767e8826c6352c2b89c5/1.9.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/19106fd5e222dca0f2dde9f66db8384c9a7db957/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2b95cc7b136017e064c46d04a5825fe4cfa1be30/server.jar")
    v1_9_2(109, 176, "1.9.2"),
    @AprilFoolsVersion
    @PrereleaseFor(UNKNOWN)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3c1973d91e234fa30eb12be0dce7587b0b3c75bd/1.RV-Pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3843fae71dd283e68897ead618255fa1ddcf4c8d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f51d9489706f603be6be9716407f1dab5f7f2733/server.jar")
    @Type(Types.SNAPSHOT)
    v1_RV_PRE1(108, 173, "1.RV-Pre1"), // april fools
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a7c5c055718d8e7d709f3f2338b4e8f1125b5aae/1.9.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9bc7f02323d90b9385c1a5dbd47fb144a3fb8835/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/bf95d9118d9b4b827f524c878efd275125b56181/server.jar")
    v1_9_1(108, 175, "1.9.1"),
    @PrereleaseFor(v1_9_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2c5e8a1d144de3c9b2e3c543675313ac821d967b/1.9.1-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/54ad739a28758d411492aa2aa562d6604ba3227e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6cf7cb1c561e2915c4370bfb4cf3f5e10058d537/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_1_PRE3(108, 172, "1.9.1-pre3"),
    @PrereleaseFor(v1_9_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cb1f20ffabf06b466406a93041ce10c4f7d7b1de/1.9.1-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3b1cd2f3720a2b4c48eb8b1d2505c875fb6c78d5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/bc7000381cec5819aefeea8b68ecc232208ab3ad/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_1_PRE2(108, 171, "1.9.1-pre2"),
    @PrereleaseFor(v1_9_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/440cb683d6c525e5c2201e2be89d75451c30c426/1.9.1-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/23386d5d39a8376ee23e61d65f27fb52ed5bee2b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/04a6ca96d4024050c50570731568b94771ff7910/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_1_PRE1(107, 170, "1.9.1-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fab85b386a3de3009e5944b0183ce063faa09691/1.9.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2f67dfe8953299440d1902f9124f0f2c3a2c940f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b4d449cf2918e0f3bd8aa18954b916a4d1880f0d/server.jar")
    v1_9(107, 169, "1.9"),
    @PrereleaseFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6a64da9184804a50d0b3fd9d71725c5e38862f8d/1.9-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f5dc0169eb605cf06aa6db60a0a164c9c5009554/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/bbcbe9f89ef3cacd96dfd1df4d88588369fbd767/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_PRE4(106, 168, "1.9-pre4"),
    @PrereleaseFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2afcc13afbad403ade52d562b5737dc7c40d357f/1.9-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/81b626ebd0efa06f07b3f0dec1af34989ab61fd0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/db995628b109fd83953ffadb749c2432fac70d9e/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_PRE3(105, 167, "1.9-pre3"),
    @PrereleaseFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/479af80b2ad5442eedf5bfb3b1b16cb219ba0a1f/1.9-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c61b03c6a0cdc7ee87f2bc0b707ce27ded2fa066/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ac6c4226ca5f1f7ea4c6f936f88d1df7c82d3a92/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_PRE2(104, 165, "1.9-pre2"),
    @PrereleaseFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7c1e51a0fd773629192004941858d7e39b130166/1.9-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fa13948aa05aaa99b5f9d1700bbbdb2b6ecc59b1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e166c9863dc5a6444d8260b46423325d4130b429/server.jar")
    @Type(Types.SNAPSHOT)
    v1_9_PRE1(103, 164, "1.9-pre1"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7a90eb9033a0174be4133da67a3bb8ff4520467c/16w07b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5c048a4a9998e2efc05d3d46675be6ec43c7f28e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/35749ef82ac7ae76b990d9e6f6c23a14f213ea68/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W07B(102, 163, "16w07b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/002431778380004494d981d4449e9d02f9ed73de/16w07a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7dc58069a02ea8cdce3a8394aec8f33b5885cc11/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f2bfcb799a616611801ff0295312e563f782ff78/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W07A(101, 162, "16w07a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f90799db6ea46ee93a3abade178475864c30427b/16w06a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/544342f959159d63da205b23947ee9c10b73045c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c4da6936d6374fd7116900135a2ae664de63d3bf/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W06A(100, 161, "16w06a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f2d853e1e3d55de9f220e923eee762de5ff4cf42/16w05b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3a07cea3cf6f1198a7db39a8bd3775883fb391be/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9fdf8a90055b3cf689265cc30bdd9d1faf2c743c/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W05B(99, 160, "16w05b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/119bce41454a1d3ade4fbab1894540cff4ed1380/16w05a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/21633205eb7bdbc2a0d2da901cf8e96ed5265650/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d74a9989d7dcd73c90191a65ae09e15b2371ffbd/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W05A(98, 159, "16w05a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/dbe7c4755088d3cea55c40b207915e601ed573dc/16w04a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1bb971fd5f636f4dca76410c1abd02abc1b32101/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8b7d974f3161ddb90b14ff77a668bf0350689bb2/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/2077c62e50332fd004203d452d8f08f25dff8eb3/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W04A(97, 158, "16w04a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0c68af2406f0ee25b93305e28dcb3978275a23ca/16w03a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d8072c24af1c48dc7a206bbef74f342b4f48f038/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ab14d7c921434c4651d171ce7f2873f56e8a7316/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/f96a7f91a74ca54a875ff4cf463ccb9af264afa4/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W03A(96, 157, "16w03a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2f6007d145fb6dc0406bedc21e1d5345c84cd5d7/16w02a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/efdeb1a9736db56e5ff319bdf62dfa6fa6395bee/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c574c54826489e1c04dd54d634da83945824337b/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9c2924a8763f34387029bab4907bf22804075ae8/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_16W02A(95, 156, "16w02a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3fe2e181cbe3daa24a3f824a547fa241268686b2/15w51b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/001fafaef03804e8220367e1344b12fb596be5fd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2fe31afafacd3cd000d8496b258124a79db6dd01/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/7e8aa374ab95833e8c7ea4f87d403394bd2712e9/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W51B(94, 155, "15w51b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7070c87a526910524cbec04c3e0b76759a0208f3/15w51a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/764384c71c303b3e18146dd90ac8cad2550b6ffb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4d5f4d2111272d67f2238b83a552599b9b7ad92f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/10b74066cbbe39e0a829205278402b5d428ded19/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W51A(93, 154, "15w51a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/89807df9342360d793089116e8c226223059c4c1/15w50a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/51c42f7a28ba70acd957c3963d5b3ad7da5f7ec1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3ce8624859c8d38b38d2209e30f4fe76b2866de9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/bbcd682e3c7b3bdb6392c36045f5327f57518b70/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W50A(92, 153, "15w50a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7b707a788fbee737fdf209b03af308c940a38ba6/15w49b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/52b24b872a1280023f2d9dc44a70ad9a052a11f1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e376081a73fe429c23db41a99a68a4b04c53ba8e/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8d72d717ad9ae39afa3d19d62e0b5f5809a53010/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W49B(91, 152, "15w49b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4ccaa5b6ce63f7863d8535e85069581c0f04c3ab/15w49a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/16e868a098239c16ecde3f06865eaf1995c11445/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/63e4904766e1af15c1a4a412ec3aeb9c5972176d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/d444f3e1f18d0c15d7ee5e6f439a51859632a02f/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W49A(90, 151, "15w49a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9d3d456943c1c9c0dd3662e3f99dea1ce0bbeb57/15w47c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4fa6325dbcf710d3dbfd707acd4a541b9c30638d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9ec245a239150ccb0f8cdae430d25ed04899bb51/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/ee3bbcaf7ed43846524087736b730df99dbea147/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W47C(89, 150, "15w47c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c52201eca7acd017743fb9b9a66700c729c8fe78/15w47b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/517438322f119b3bec2490aada10ec3fcd2e8774/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/80cfe2c26ef21e10feb1458c46c244caa07ebcf1/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/ec09e6643fe8e57967d92c92b1fce7cb4b12fd6b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W47B(88, 149, "15w47b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/704b41ca962e73deeaea78d3c6fc07f01e7f02c8/15w47a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6af473660604bf20c99c2b8f04002666f0bcc53d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2299e712df1aacb7297d63b75a5299fe35c9b9fd/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/4532cdf8d18767fd87ad5f5890bb8681fc9f22de/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W47A(87, 148, "15w47a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ed28a3f252a40cd4dfa3a84f9c7a1aab5f79493b/15w46a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/101e4c37464438ef7fe9dc12113a3ea828eac4f0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f0f25f22430b0c122308244f210df66ae3ce7894/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/979e26f45ba7cbb80c633828a3c206c0e872508b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W46A(86, 146, "15w46a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/15829ef167c98687ca0c4c7d140225efe2769bed/15w45a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1cc965816c3c01b3b2226e15e884b74f3b04dd10/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6bae28a2f80749ba7fc379e44acc46ac5fe44920/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e18d49e82958f7b537fbe6184e93c7ea0ae21a3f/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W45A(85, 145, "15w45a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a2d3fd6e371e1a789f432227328f6967c5b6bc7e/15w44b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/cfc7eba7e23bf76c81facf1ebf9dce7215c3141d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7bda3375d5509536766d65cf47b2a17ef42b964a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/78669b2fcf9d362d9e9f6299b6fdb88cb42a0bf3/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W44B(84, 143, "15w44b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/57a72f59f661a1b00d6c152f3663fc4af35714ed/15w44a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ab3e8b04d85b873a028ba7fd49a325c61d4ab360/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/087cd273ee072bf626f89da4ccbb2841854f39ed/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5881e7514dc798bc7c0e7eb9abba01e6c84ec79f/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W44A(83, 142, "15w44a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/57b03175602261e9f2787cd513e05fe6ee0c8b6d/15w43c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f0437e3ac44089f3e604308041179ab2d3ed639b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e514e7107639d2e8b285ceff5eaa114379dafba7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8865d9f952d967bff93cfb75a260518cb20a0a6a/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W43C(82, 141, "15w43c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cf68e682555c704dec3796db1b2ae7f6f84b31ed/15w43b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fb00ac4550199a99a3976f185309fcfe7e1ed1a6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3154e2f53b1a50159d53f0dc8e4f47857344690f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/80709ba40fc4b9b621b162db1c67e31932b1ada6/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W43B(81, 140, "15w43b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/06fddff71f0c2590cbee9b179b076e4c2516c72a/15w43a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c7869840cb9c9acd152c0b8aafe74bef191a9d44/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dfc6b233c097fa377f35972e7c95e3c23c632f3c/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/41857c07f019f4389e79e63fec46ea057d6bccc2/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W43A(80, 139, "15w43a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/544aa5c98d30017dd12769feed0f6ac411cb120e/15w42a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8205907ebd8bbb4e328e0db193ffe4b1727d191a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d789ab5179e3bb5d298d82570ee123457cfdfb94/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/3112ceb2cf577ac6cadd328a108977add26f613d/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W42A(79, 138, "15w42a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1e77da8ae623253dceb946a831499821b9ff3469/15w41b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/83b7a7c64fb3fd11c2923bda1574276c1bcdded7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/994a048f6a3f8f800f2807545b8401617c553dfc/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/d8fdb6aca5ebbb9d2452eed37cf507fe64d50f5f/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W41B(78, 137, "15w41b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1667759ebf20581022f06b926976f8a0906950b4/15w41a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/edcecdfe258c36fcc857dfce1ee40167587d250d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/92fcc884b954fb7e87b163d478fd5ff91bdb1550/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/0ba1b8e7ba224914db5d8bfd06873064ef585466/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W41A(77, 136, "15w41a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/722edb06697f9552919310222e6e384885a122d2/15w40b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2d0a8a24c90034d529277e20414080952a6c7e7b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/adba98d3a02da95106d782991a90a199d38e5d9f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/7a27c136e6973d3250620b9fccd0c6cbb52fbe23/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W40B(76, 134, "15w40b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/979332ff22b5883583db3427feb76da226d9c510/15w40a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/582827b571e0039358b75e8552b9491c24737e5b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/be6ffb291a743f64abff316bf96933a029e78712/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/46f96755c175b956ac11650760015c4bc2f3466e/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W40A(75, 133, "15w40a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9c6872f8758ca25a5c7d4378700d2cbf7b9e88f7/15w39c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/101e82c68b63be1f8c2dfc1bddcdb4a196442a84/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d3f7fb05eef0331941b4161b1f2f2ded7151bbaf/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/24e1fc13125bfa952396b13e4beb9e25581c6eee/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W39C(74, 132, "15w39c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5a78fbe82c699c64438d34fbb1fecdff07a20e74/15w39b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/39da2b441cd74782e6ee537dba7168ee9d483ab0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/031a5a79a1548f54c7bd148f6f3cf9e42fbd3222/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/18c4ac973d4dc9a206d3a29fc2c2572f5036419b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W39B(74, 131, "15w39b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/75423b4d58f4247fba33e71822b970e5c2c0d841/15w39a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5a26b65ccea3c436a56673e3d59ddd1bc901a827/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/871b86fac1a4d71642166e0deba2a4b85780d82a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/ab3a0282661b2bf8bb7528c86d45751bd3917f95/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W39A(74, 130, "15w39a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5324ca4063759d9d44557d8514db4ff36823ea68/15w38b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/acf1e36ee1c02249a1e5f5927b0b5b2a52e882b9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/41f8ae90397575214b958bb5ef99d25b541fe366/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9c262c1cc50d8a95980dac4fe984d35a54779252/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W38B(73, 129, "15w38b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f6ca23e9ea8a6ba939eba48c9c38bbffdb3c2bd8/15w38a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/befc74213863009297e81873644a48c52d94fde2/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9b14cce8545a6f03f16ef52ef8a2725afaea5c1c/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e1ace2bb0e1f7684f73d67ca43addb4ad0540c8c/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W38A(72, 128, "15w38a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e94380c8f89d89e5ec3ef0a087af5907c67a3a97/15w37a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0480d8e610a57fe18c78cb40eb76be50469accee/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0f29d64f94ccc40d01ebc1ddd0c506edca7b5dfb/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/1b945df5c6464b4694e20087c9c74b6f5b0594dd/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W37A(71, 127, "15w37a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/70730c79f021c92eea9c099f1cabb908ce7a2016/15w36d.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ea3bbdb010acdbd558aacd67a48e3de83515b4e8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b862ed48ecf134683470145662ac8cb0e1ca7e4d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/15fbc3881312ec988345502e273e588b52681e09/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W36D(70, 126, "15w36d"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8ab2e79205adf5e84857eec0ccc9e24612f34db2/15w36c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7ec3fd61065f2f82dd881b81645b66ce61c6b4b7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/72a23cbf5f21b3589e230164f5c40c1aa7de36cd/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/1a9fa2a238118d2d1e35c85b178029c72596cc23/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W36C(69, 125, "15w36c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/834c0125a54c72543a5956f8f84a132983c51a01/15w36b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/603273cbc881fdc012541e692d78c6f471349f56/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/81ab225579322b61b3a37f7d56f400077c1c5978/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/aa102c87c376775147e7239aef02b7f1319bc302/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W36B(68, 124, "15w36b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/851de2edecdd714d0deaeb6138a8aca5da02575f/15w36a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/132f019cf1bd9524451c83756440bd71468dac26/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ee0b49a2fff99c93b7a216931c11292537eed473/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9c8b798a59ae6c151e7ae21c22d6af6fc4cde62c/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W36A(67, 123, "15w36a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e5fde3e58e56bd04ddda7bee585d7034a3a0e43f/15w35e.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/beb13ba79289289e231d0892c4a3a9a72c46f45f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/04ade8521778da7786ea9c8bbda2fac005229e0f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/d625e135fe40d3389e187355d5f048bf83eff3c8/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W35E(66, 122, "15w35e"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/408cbdd6dba59c8826ac7e960461f62bf89e0f93/15w35d.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6f28a53808e5ae69b4538580d35a235bd09eca93/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ed244d36678d875b979f81dbea05acacb89dc4d1/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/75736ed3c956d5a2ffd29b22d4a7cd437b148c59/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W35D(65, 121, "15w35d"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8ae6715d0a632afaf4322125887a935d2414b2c3/15w35c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c5928359f77e74892dd8d496e9de4f1fca6e685d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a0f20e4bdd79e53d923d3fe2853ba11da993e6a1/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/4cd0a9196274edd35a123814856e24553bd3c3aa/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W35C(64, 120, "15w35c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7f4f70d63fb85b02aa6512382c7815923ad0151f/15w35b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2c73745d684db77aa0dc4a85fa96902918c0ddc5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e92badd361f83730436c010044099fdf1af60bab/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/6ad682c18cdb9b3aa9c5b3a607f75b44c3bb7521/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W35B(63, 119, "15w35b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4ab25b24d191d46add8c53bb8714c5fd113bd2e6/15w35a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2880da12d8997ad4c669b7531a09e64c7e038f10/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a3a1c19d861bce39a129ef18226449ea02afb58a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e0165bd93b2397274429b70b7ffee41eb507e72a/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W35A(62, 118, "15w35a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/eb6f497f5c40fe804fe859b62edae4f8a0b18cb8/15w34d.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/db8e9c2ed19d783588e9936fcd6a923629e883cd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8bf058527fd4bd5d2951e1573d0ff849aedb0197/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/3d601d3f4984bfe14a1efd8085eeac9420523ec4/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W34D(61, 117, "16w34d"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/85b06fb6e7527063bf76adc7bad1f2644affc166/15w34c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/afb42058a0f8432bc348071a0e0fe329e108aff4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/639946a883a6a2636a82641a1fe4c9243c8e633c/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/26167a5cc9b6a899704bba504b1ef99e255faa21/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W34C(60, 116, "15w34c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/08021851a9711f2665d7dce0fe0cbf7528bf482d/15w34b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/60af6ff7ca2aded6080506096143010034aa11ea/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6ee63157f9201f461e056652831348b9c1a51d8c/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e7555ace6f24f733911e2ac6e656c5ca815fcb90/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W34B(59, 115, "15w34b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/71b1b3cc02415227a5600d97c84eb211b741a49f/15w34a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e8320ed660bcdc6c80d94a5c4e068e783465a2f5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/70103317cd7b973e4f8511a5d8973da20c6654d1/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/d18d0618ddfb5f4a7e00f04d09709717e5861e4b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W34A(58, 114, "15w34a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2b27de469db8b259764d97fb7570f668a1cc7606/15w33c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/23237d415c9cf637a261e02f6759f4ab1d553f52/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/042b351243f4236d02976ffc1e7f83f93ac932c7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/3674eb9221355c735fe16e5c9b0f7ea36e6185aa/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W33C(57, 112, "15w33c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a06b1d00ba90e10c3aa83bdfd9469cefffde8ba7/15w33b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/502082050bf59e72332afe508f8c19b379173551/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/991c628d7c3ea224d90539297d8c2e9127b2489f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/99f7505b0c4e7362cf646b7fb7f7f90f4fc7da36/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W33B(56, 111, "15w33b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a31c9b43de60bdc2410d63716f522b2242843b38/15w33a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/337da43d1f130f57b69f295ad8a24b6851e111bf/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b2f50a0daf6fd2e70dac4d7da302524566b57a55/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/44092fc0d5489a9cc448450cf85f55cef970c18b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W33A(55, 111, "15w33a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/79372029c5f7164c4106b3445c6a72fd89b91641/15w32c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/160d90035f2032db8bced2c1490b7c47d274c382/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6bef1fd3f1cb34b1d6654d93c43abb899072bd24/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/09e8115b0969fe114c19b54062d59add398164d9/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W32C(54, 104, "15w32c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7b39a2921fd7f29cc0cead1045adc1d08f55d7fb/15w32b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1f448b05e56d3b36f0408eecd798b875ec230ef0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/53c13fc634c89d408155553ebc8724f4b900fa1f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/c824439e3d5ee6d6448b5e50fdc7384fdf2b3f9b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W32B(53, 103, "15w32b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c04d45676b3c64735e07f485207530359fd208f2/15w32a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6f85d469a2f6e8d24cc71f1882eba1142ecc29bd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5cb1aa4a4b26979405cea5a181bbe38b72a85add/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/51d9e27366cb9441327dd61808816083b8b64f91/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W32A(52, 100, "15w32a"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c617cf4d2350d0936b0cd532e204d4c0db9a8695/15w31c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a903feeba306b3e2415ec97757a9a32b4a27859d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4fec021cc8110ce87451e22e23e958ce9d8d61f2/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/c2bc5918aaa2220ba3c107329bf9e2641594320e/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W31C(51, "15w31c"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/705e90b4e738b47cf768926cd1f54ed56e6562d2/15w31b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/25f9d73567cb53e3d62675c297946ba8d47c4282/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/67f5af98eeef5f6267aca782ea3a536d50f33bc6/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/95ff19a5eb3b5938bc6ffb8c3269a7df92851717/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W31B(50, "15w31b"),
    @SnapshotFor(v1_9)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bd5a158581e6ceec4c34b32774153661b63913e3/15w31a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d702effa2e2ff9f79ffc74dc6becc3eeca376fee/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7799f1f6a486be08185b470a64ca4649e37de578/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/69df0c2615d2ea5ebe08381df6d1bbd3c403c036/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W31A(49, "15w31a"),
    @AprilFoolsVersion
    @SnapshotFor(UNKNOWN)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/18fff5c4aaa556b97a66d6651cbf6a3484ac97e4/15w14a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1bea9340956b96f2b5452aa576e0cf460990efc6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f7d2bd26ce7893477fc1ca6e27b671345253bae4/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a93cc6d45dd62cae48b4758e9b04e2147e11033c/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_15W14A(48, "15w14a"), // april fools
    @ClientJson("https://launchermeta.mojang.com/v1/packages/856d9bec08b0d567de39f46efaf4b76066b53059/1.8.9.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3870888a6c3d349d3771a3e9d16c9bf5e076b908/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b58b2ceb36e01bcd8dbf49c8fb66c55a9f0676cd/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5143618265b8a2d1d28bcadf206b7327738c2670/windows_server.exe")
    v1_8_9(47, "1.8.9"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/389ee2576f1c7ac6efe0edcec79f2e465d2a5278/1.8.8.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0983f08be6a4e624f5d85689d1aca869ed99c738/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5fafba3f58c40dc51b5c3ca72a98f62dfdae1db7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/6c95fb4d56a7873ca30385640c546d89c1478b71/windows_server.exe")
    v1_8_8(47, "1.8.8"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/87c78678d155ff55fc91fc64a7a84f2daf855f1e/1.8.7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d546a6a092060c85f1eb1d9213ff823c558b1255/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/35c59e16d1f3b751cd20b76b9b8a19045de363a9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/bc3e9a1f4192313766dec46a5d1e72f0bffed19b/windows_server.exe")
    v1_8_7(47, "1.8.7"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/13b52ffde81121125d69aec94589abfba7e04147/1.8.6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/faa55e34ded35089d34fe921ea83d317fc152e93/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2bd44b53198f143fb278f8bec3a505dad0beacd2/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/d7a97168d593e944a369ced9e4ee00b63d4fc7a0/windows_server.exe")
    v1_8_6(47, "1.8.6"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ced2d59fde6e68ca9e84bbb00e5c7dc9c052df06/1.8.5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5d39957c61d19042f8bd669a6faa99989cf37083/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ea6dd23658b167dbc0877015d1072cac21ab6eee/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a02c088dca4738e78d15bcdc8909b7ecec7aa0a3/windows_server.exe")
    v1_8_5(47, "1.8.5"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bf6b4b4bef435804faacc6fb8d350119a7482262/1.8.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/459204fabee3fd9976a6c942b24cbd8382d02d6e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dd4b5eba1c79500390e0b0f45162fa70d38f8a3d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/dc10e839bdb302ad472d05b25f23da25b216cb34/windows_server.exe")
    v1_8_4(47, "1.8.4"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/94f0e372077d0fe6cfeaad990b2c25ba67b3531c/1.8.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/69d14463ddc22e581bc66c66ef5eb72a8b452c46/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/163ba351cb86f6390450bb2a67fafeb92b6c0f2f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/784d11c7cc6578c045c6a5ab29fae2f718d6e0ae/windows_server.exe")
    v1_8_3(47, "1.8.3"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/05655de45c43872c48eea1e07ae9740bc4cdf47e/1.8.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a8e71f6c81acfa834d249579a242f5b0852075c1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a37bdd5210137354ed1bfe3dac0a5b77fe08fe2e/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/cb05819c607a62ea6b43ab5c07d28892247d7c3a/windows_server.exe")
    v1_8_2(47, "1.8.2"),
    @PrereleaseFor(v1_8_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/15e11b9224f6eebee835685523ce209cf16bf7e8/1.8.2-pre7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/07e1062c3fadbf70b10a819bf5c3a9a12339be9f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/61039f9df585c52fbeb2e95d1754852ac00b4344/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/315ad16fd7fe15c6fc26986872d68552945358cd/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_2_PRE7(47, "1.8.2-pre7"),
    @PrereleaseFor(v1_8_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f8568849a5cf9aae4693f72704ca43e438057b85/1.8.2-pre6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/319e3ec8671db1bdafee732f27206f696a162e6d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cc40241ef5acc247048b9d351aefa6288de13d8b/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/737afed3e0061fc6cb6c233e360df22e7bb699db/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_2_PRE6(47, "1.8.2-pre6"),
    @PrereleaseFor(v1_8_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f507249b1e38774fe1acb4f923190a4466fd7200/1.8.2-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e94d11dc1b1174da7aa8341925de78a898738f5a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0226544b417d842a3a78797784615f11f1262a79/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/c01911093705e16448a64484158196ef0f28e75f/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_2_PRE5(47, "1.8.2-pre5"),
    @PrereleaseFor(v1_8_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cbad80725e00af8857ddfbf15bd160099b630e07/1.8.2-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b0dcb6a181d2977f88854db582d3972f34b09880/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b1d4937d5c39c5e1c462d39cc081544170c962b3/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/cfdf7efe6a9b4eaf8ccea71bc9b7cdf73d759425/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_2_PRE4(47, "1.8.2-pre4"),
    @PrereleaseFor(v1_8_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6c40eb3030a4c327c03d0ac50b13199cfef69051/1.8.2-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/672b075aa0fc7d4761aebc1ad68dc2c95e764f42/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dd98a2d8148cdaa92fc0deb4201186d552201314/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/d015f15f7d4b24f5b33492e45ff32a8f0b16f51b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_2_PRE3(47, "1.8.2-pre3"),
    @PrereleaseFor(v1_8_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/544bba3b67c7b08a3445432b7071393b9c8ed86a/1.8.2-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/153aa945c44ff00502d96b68ff5e0941794e39d9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4c32f01c356568b6c6b3cecf4ab4d0f0e7e14fab/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/07c75f010e7d72515d64bd3f1bf17a83cea2a2c9/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_2_PRE2(47, "1.8.2-pre2"),
    @PrereleaseFor(v1_8_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ac9ed8bd2a93295eb15caba10af6b92e6cec2eb7/1.8.2-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b4be275f3854908c5ed503f25a0f225b798253d1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/32320f5d6162cceed3cf618f3c37bde6978eacf2/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5dc29846fddb6b810f22d6d535269826c670cec4/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_2_PRE1(47, "1.8.2-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cc3bf2b602bcb4d55b4581ea9bb55c4e4b2d9bc9/1.8.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6edd2a3e3d76a7602c52f319f87cf11f7720b43b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/68bfb524888f7c0ab939025e07e5de08843dac0f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/af2948251122e017c1254afa969019bc78815510/windows_server.exe")
    v1_8_1(47, "1.8.1"),
    @PrereleaseFor(v1_8_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6988d729f5e1013395e6d04c903d2b224491da21/1.8.1-pre5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/927b71686a743a5907c9875ffdcfd8ed156273d9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a25350da18085ab12f01ba56ab03c562cc722a40/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/ec06b30faafebfec8f947e5e92d153636e4cf9ff/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_1_PRE5(47, "1.8.1-pre5"),
    @PrereleaseFor(v1_8_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/384982851d1ba287a6e8f57a23d980bc21989101/1.8.1-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/128be924bcf81890ba024f1ddd2a259ff1895f36/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5420c131b360f58ecbeb970127a49b525b28f921/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8a4b7991a8052bf0072cbe52f07fa52442d3518a/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_1_PRE4(47, "1.8.1-pre4"),
    @PrereleaseFor(v1_8_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a2f10c2bb65925c9fccf2395608dcc3b393e76a7/1.8.1-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/022134c463c189cac436a2381cf8be41dd2071fa/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/22440c0335d95efb7d52d9c844108aa2c69da179/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/dea4b9be5a25e1711d4d03e4d81d8810928e27bc/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_1_PRE3(47, "1.8.1-pre3"),
    @PrereleaseFor(v1_8_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5799aa67b9a0e18abb9c9705babfd291a43c0b07/1.8.1-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e326dea1becc6e1372b05bfe2440531d13f76959/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d0b163d9a442e8b49187e4925ef75970ad451f41/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9dce33afa6eb49ea692741346c041f143da6332e/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_1_PRE2(47, "1.8.1-pre2"),
    @PrereleaseFor(v1_8_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8689f4a30cec09a4339f06a4c8100b81d407cad2/1.8.1-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/650ed5ac903ef19ca76f0f46d6b6486880488802/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/dae8203bc40eb43e15e6e9ed454404f330c591f2/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/35ba052e51559d8180ee84fb40e398653b8107cb/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_1_PRE1(47, "1.8.1-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c6309181ce8df8a06ed556e315cd4636c4082b9a/1.8.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d722504db9de2b47f46cc592b8528446272ae648/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a028f00e678ee5c6aef0e29656dca091b5df11c7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/73e0862463b91a6a5aea29da58f85ef1e7915c83/windows_server.exe")
    v1_8(47, "1.8"),
    @PrereleaseFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3b5e366a0f265c4dce1354ba76e1a53dae1f1c1a/1.8-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/228f1f260f34350e37576aeb87fe9cb98b9a5137/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/27fb956fd88ab39205c7c45a39ca4e8820f96cc4/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e6b6f230f93624fcdc3345f07e9e627390b538ae/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_PRE3(46, "1.8-pre3"),
    @PrereleaseFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8a41c8e0f33834284ecc64c042dfe03a5ad5998d/1.8-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/81fb8e9ddceca2cfdf453ff4755d1178b1de482e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5673d722ac14f571e6a46f368d34b144e90ef8ad/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/164d33c0217a49a03f3a0e83aa33f170c9e3d8f0/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_PRE2(45, "1.8-pre2"),
    @PrereleaseFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b33940927ffd7f5112af8e90a8e726a57a542ccb/1.8-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7f943ab9342e7d63d7857486ba964d8c763799cc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/88b759849519ca8a7592a2e90d6891c98f50cc17/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/f8a36cfe9dfd93755637e8e5a246deec2e32c9ac/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_8_PRE1(44, "1.8-pre1"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2a8b971cbe57230242c7a6f7f9da8796f95400d4/14w34d.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/529703e7e0c5875d812e5457133f19f30b0eb9ef/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0e05b086df677d9802ff5335719149ea90b6f302/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/94bb2483a54d001a9f2e46030bd3c3583bb4f48f/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W34D(43, "14w34d"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/73382e160ea059e990f6af8dc068c155506e0bad/14w34c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5fa7f6102fc0f228fd8cfa39b92947b1834f5392/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5ab3e11d059a6f321a1d284d6849b95264d77e66/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/61ab0f4f710567cccbeb8952831bae0178b55c6b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W34C(42, "14w34c"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9d27f8e4593e28316ea458bf66cf666bc78d44b3/14w34b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/620147b7a1cf8a4de0c1bea530da621874730bf6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7991f32cd598ac7e5a8cf11d91965e597ae148b6/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/231fc5fdb7d8016ce2f37a14d3a174d5787edf22/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W34B(41, "14w34b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/91086b10591fc00bd66b9eb62b49d40a6ef19e4b/14w34a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f17337ce79af702e78eff85a004569603d1e2435/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e59eecd2f79579f7b87a89b14aa07671eb94c9b1/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a2956635dc3e117c64b9937bdfcbff34ebfd5bab/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W34A(40, "14w34a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f578b2cfcc8c7e03f185f51135c533e780f7fee0/14w33c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/98301d34581ac9c1274c34c62a01cf1be53ce887/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5479bbd5f4717d7c8bc8ca895b3e0894e490814e/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/33a719439725befdd0af00f3982abf1b00efd09e/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W33C(39, "14w33c"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cc33663d42af1a69adc7fa934b34e11cafabaac4/14w33b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fd2a3ea5778fff84f8580fd05952f14938351477/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7e0e5511b0049ba92e5c991b6bd0264932559af2/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/04cbbdb8cf92e73a62259a2a7143e98c8fe916a8/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W33B(38, "14w33b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d428ae184b2362dbd4a822a6955f98162040c523/14w33a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/910421082420053a0e4fee72fa94017be6d68dbb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6c0d06c1b3d8c3365be6e1b9b269725eb4e05ee7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/60f060e8b9dd33c7c2010d17afaf060c82838f2b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W33A(37, "14w33a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8d49aa8007af2738aa0d14ce4f248622f4cc2ebe/14w32d.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/03188ae34f0fe7e75dd724882140a0cbe7a6e4c1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/83d7acb6f94dc606591ebe4d7a06ad29127cd3de/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a646ff923f73dfc8c198fb707766e0ae5edaac53/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W32D(36, "14w32d"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/28096d1beba37533f16bc08ad80f9a5ccceca791/14w32c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/15b1ca66ba5fd17b8c76448eb769ea4ea853b06a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5fee0612322feaf374867336375810580da6fab9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/155c646bb70cc84364bc1c042c629933c44b6fb3/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W32C(35, "14w32c"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9010ff6f3dc5e1fce9dc071438a24baeb93491d6/14w32b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/cfd33586f6033c2ddd092db137b83b85cc10733c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8aa6b045d31cc4a9224ecce602e9f5f748d8f460/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/cd04077d5ff9e2fbf7860b49ab576cc7f8a13fd9/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W32B(34, "14w32b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d64a982daf815491ef04cdf8a38b1c915da83ba1/14w32a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/66b8ed45eb1e8d687d269f2f26e4d20edd07333a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d3b96be87d921fa4f95ea43e5283a253b778f24e/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/dd19fe6e7d03d8ea62361083873354be0ee7b0e3/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W32A(33, "14w32a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ef279ffa71f8f36481dad0de9744e166805d54fc/14w31a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/76f1d68d032fdaa228c477fd927dc12745277e8a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/05fde0b4039104a27df8c7b95d327ecafc06cde7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/55303b539eb9193a5e580457e46cb55ed23e119a/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W31A(32, "14w31a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/76b580097ce6f4481828425518a139cf3cedee35/14w30c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2ab883131b1ee8ef13e945fd6d4fef5b6f2f44ae/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2c936d1f410d636a348f100ab926d94d92b743b7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/3253dc9c36ae0e2930f650da630c34b0e6447554/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W30C(31, "14w30c"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8d57bc2e01916ff6fce4f370ae1cbee639a76428/14w30b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3a0d41e74a18e2c26498a918724ff39d62af329c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ee24a6e63b007b9ec97a591afe1a29a6bbbfe143/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/fb80a59b1159f2a57edc0f837846253f89fdb379/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W30B(30, "14w30b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8d57966d0f23a9f97af540709f1b51bd8d02b21d/14w30a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e335e50b527fe15c82242a0a8ce8ad4e5fdcf513/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cb7bd4bebcb40c128a571c8f15fe1990b1f50a32/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/b9912d88d068bb60df5b1b37f7ee75118e83a042/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W30A(30, "14w30a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/55f170c41313f25eb4ec8a4a52cc477c8da00178/14w29b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/60c4779dbb9bf70972ad45d204adf8d1c9dd1f0f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b81bb5f919d5489859e9a38c7f6b49e6931a8cc8/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/4ca318f2e836668218beeaaae68bb30347dbf229/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W29B(29, "14w29b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5222c2bfda606abf4c181bd4d2da5c2f583da9cb/14w29a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e8775d2214111c9600daffb5fcc15f8e6381f9a8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c16a61be653b5921391c55b337640ddfd7a5b472/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/65b3fdb3dbc4a8f8bb5f4418f7a37fe28ca74afe/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W29A(29, "14w29a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/82ef4b981d95ccab9e7e5fadef82c89dfebf9604/14w28b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b27a6f1882728b61a71d68c9a1c2454ff802a21b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/aacec09f5ed0475eb474052a4a55b3ca6edaeecc/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8fa725dc99daf17d0559b569dc52e1a23eab6932/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W28B(28, "14w28b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1bb62510021eb93df67c5ead257d829c21064911/14w28a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/747bc2c39af6ea3c803709a91b49898466636f5b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6987a36f248e88fd8b2366e87fd88834b4a06f7a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/2f8be72d535257baba67e20c3458d4cbcbd61703/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W28A(27, "14w28a"), // missing pre-reupload
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/551af51dcb3c047908f4a175233436f32b56b1c7/14w27b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/11bed76015aaa2d673132d0c5330d3f14c17a988/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c5be337237224f752b2ea09d3a2a00a00b26e14b/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9858c17a5c7356efef578e746d8bfd33a2852807/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W27B(26, "14w27b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4e4033a046bca69c81d57555d372d2c89f5d8c33/14w27a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7c9eac4e1b56e6a3583370d1f77111b111f986e5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b5350953ff062646d4a61b7c8fb4c0570829843a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/6e218287b6cb71fa681ebc51ba4e2f4f2d2a4e2f/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W27A(26, "14w27a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fe4a2cfb1ee0ddbeebcb227a9ae9d871a0673f7f/14w26c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c382a4a6f6fca726a398bf648e74c7d12b67b3ff/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/247352905e446c66db85ecb26361a9b5a8eec4ea/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/db0bba4a8107db5473333a248f01969835109a30/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W26C(25, "14w26c"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f4c2e4092c1a97a09fd9b7a389c30359fe4fbefe/14w26b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6b0d36e0ff0cd61fb2b4ba665e3b5070a2871e0f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0b461d7af1194a192f5b7a9a8989bab83f7317b0/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/bd3e56ecc714e6661e6ca4d72b44662cbc13ead8/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W26B(24, "14w26b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/140b76f6e82e853412d21cfea3c2f98334e852de/14w26a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/20f0b48333cf446fe77317ab95012c595b65a8d0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9d167e0b009b99d637ad102a1cb4f5aeb1501e45/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9cc0cde33407fc785f25093ceadcdac7ce209e80/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W26A(23, "14w26a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2565bfeb09df816d4313c37af293fc8a9597c0ba/14w25b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/43ddd4b49640512da54df98a33d7f863313993a7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/29209a8e73b6f4afa691d0682aa848c2a1f52dd7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/172717bb475802bc7fc10f86ae4c7dca16438417/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W25B(22, "14w25b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6a1030badde86081dfa929cf3c8da92352e27310/14w25a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9bfdb6456e3b9a2d93c5af37862a1174987794bd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e22dedab430bc1c0f938a1e1a2811d11fe29f67e/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/2439ff22af9eb5f98dafb2db380b287415a43819/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W25A(21, "14w25a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ade99be51a33692842377f66f8a381165520bfa8/14w21b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/02db91714546d082952fb70bb3e2ff9916135569/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b02c5506df94aa5d5200ef063f1bab22ce260c8a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e108a12d6547a9917aa57ae67922adf14abecacb/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W21B(20, "14w21b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6c5899eeb043abbc218cb74ee712d049458ad3fd/14w21a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8d764e567c25ab9f5c1f1d5f16c0b673f3f06eb6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7e26d5c2feb9df58353b942418640164a8cd0fbd/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/ed3be533ec9a4e1fdd554579bb1ed9f3cbd58bb0/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W21A(19, "14w21a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/069b90b7de445d8b403ee81b97477cdfa1526f8b/14w20b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/09edbf6233a54fcb30656cb6fd77f55209c37041/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/93ff3d1043ecf25eaf7c9626d8cbde7986dde65d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/18ea84c064dfc401d17512bce13373b537fb220d/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W20B(18, "14w20b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a2af33f2a37beef83a8d10832a677072415a24fc/14w20a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9f3b303c1de10d3229353471e63e834339f3acbe/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4dfd82a84113cfb7e4b489c52caa68bc3f21198e/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9214756d7f72407db88c5ec71c2d73cb92a76f66/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W20A(18, "14w20a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/14bb3b1e4b05852ba81e3fccf55e36cf1b731eef/14w19a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1d498b388c98ec363cfaa19cec3fcc9717d7ac35/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a7df79e00c4d75e3916438658839785a476bd6ac/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/d4d240fb82eac62425a8febee305874975ad6c57/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W19A(17, "14w19a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1d2d5c9fb333d6f08312aeefdead9adbe041d0e6/14w18b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/75b92b48b4ae0cf2facd9d4a57ad94b22e608fa8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d7300a576860c056938760153cbf56ed98e9c7f9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/b7fc35de68ced8189ece74849cbecfae326f88ce/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W18B(16, "14w18b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/108308cc8f8d1e28710926710c123a2be4247971/14w18a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9f9457fa624e797ee8b7fd409abd4843548affc5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/48d6b3b47e870f61a95645e2bc1a84a27a1da068/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/49dd5660a0764d03dd02c7149c4c8b56e1142b69/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W18A(16, "14w18a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8ab598d1696783c449b778b641ae3c6df914b1de/14w17a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f0ffadfeae5064fc64a5e80aa6e6787dae419fc5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/701dca9511fa3e6b26799d11475fb3a719d6a26a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/d086adc017b813b73a36b36602f7eaef4a738295/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W17A(15, "14w17a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/90f60ef6202a2f83feac88e6ae4fc18fa0c9425a/14w11b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bd8b4cebafe218d14c0d1d9a83c2377e63020804/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/58694879e09c500dccb00751ed85a1d6b983229d/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W11B(14, "14w11b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5fa270226ea95656860ce49fd69d408e25f62933/14w11a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/34ce7e9e1529560f8647599840cd33d6f107d6ef/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/286924e7082ff1f6baed77a100f73abae81f25e3/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9d1107fbdc10d7ee07cdfecec9e96e557c6d0a18/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W11A(14, "14w11a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d0bf7b7151f2f9bbadad8b095bb0f06bd22c28b9/14w10c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/53fefd411c245f945c828f35aada4e5c0423d1a2/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d97cc24dad232b5452644facde54c47854283b99/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8e53ed92ea48856f6bcd7c267b5b95c8b017b112/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W10C(13, "14w10c"), // missing pre-reupload server (.jar and .exe)
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9388d70d55a06ebf7cfe0b602622f696e33676d7/14w10b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9520f823ddc8b0aa600f6cbbb72298d905c4c6ab/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2dd525cb725635b94c763c2efa5e1fe931a0d6d6/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/eef5b9f5ec25dd3c36ae67092f1d7df6c626abe5/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W10B(13, "14w10b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f857660a1be0a034e58e79bce8acfd846fd38cd2/14w10a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bc38e1cc8db9df50d0b5a1a68b74ec1d19450728/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/03503dc8c3f615bf8b65d8e1ebbf923e81162e3e/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/16c8aa300b49f7d4b41553e70f57e7cfa7366acf/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W10A(13, "14w10a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/efabf06c42017d6e108952beb19f1e505eedafd6/14w08a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/05b9cde52497d1c419ddece4f16784202e45c0f4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a2716623b9e2c01cf0a1ec44497cc3279fce8f6a/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W08A(12, "14w08a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b3f18dabae1e9c1b4888e26f2a7ee0fc4ca13cdd/14w07a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d6a73ccba25f4c30d56af73f43a2d3c9a5458a1e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/de78ac487cf3fb6770e8c15f83e2219d4df851ae/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a2c16840eeb7d900c8bf7f9f9f228e1c856637d9/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W07A(11, "14w07a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2bc8fbcea17ac7a3a950c313ce7e9a6e4ae297c4/14w06b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6e5e5c7e131f241c0a830143d133d89815d13692/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0591a5e7e299182c6849e705704095d2a1efe1d5/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5938a06a745827b605e66cf56491b5df3baa7f09/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W06B(10, "14w06b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0bc79bdfdf67e18e5786f701f460b19ee4af50a4/14w06a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e6dd656dd57666a500079d6545a77b07b45d5a1b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a6a41979ed198086f2c8ae638f26286b2dc931db/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/17eb137856874f1c6155dd697cf6a17ae35a48ae/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W06A(10, "14w06a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ce7fca43310f73f6532c6f8f94f850a86532ae80/14w05b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3e925a7e4cd1bbfa12fdf1bd9efc92618bdaa644/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d2d2b00952748af9ee8e60f49b9998dcfad3071f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/86b07b8315f7364adca87c62602879227135bf78/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W05B(9, "14w05b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fb2600e556a199c81b238795ee3a3a05ddb02c59/14w05a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3b7c6e09b60d4aecdddf1e453a8b10ebd90becd4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/27abecb729cab3a6e11f635dae2cf9be5f620a75/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/66baa6d77dd04a432734aad75ef7270da321675e/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W05A(9, "14w05a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b6df6484e2ae6a57f4cfd5f3da29de238846702a/14w04b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a45ca517635783db8d902e6dd4099383a3a8ca0b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7af6befa241678d09d4031fed5578785dd3c126d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/11311aa6f0710912054d048f6a674818a238d74b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W04B(8, "14w04b"), // missing pre-reupload (both client and server)
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3be1cf3e471a51e4a8346337a58d9379175f4bd4/14w04a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3034b21f0091e779b38d43d687f98037b4ac76c9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/bd483603d1b07d3ce3fde76a35abfb0489933d72/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a8a97c14b22c15903c491436ad0430dff50b4574/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W04A(7, "14w04a"), // missing pre-reupload server (both .jar and .exe)
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/44d7d06106c00398e96ae0ec46b936e4f22fd8be/14w03b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2cdbdfb9ccfb79be03e2b352fbe088f0875d2d1c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b8bee8cbf485aad0be9789fe58ab266d8fe82215/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/524d1012a56466f1b1e4f42c4042c7cfb337b33d/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W03B(6, "14w03b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6ee35b2eb136f1ec3246ff71e357149be156e64f/14w03a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c1932528d91f084be73651509804d2266fd4c24d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5cbd5319a7b1198f049286d443148f1b88ff7bc7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/eb1148c22e2b399ffcc7487fbe45de0371d227b4/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W03A(6, "14w03a"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/965c31544504b579f64926d0ac3c611de5c0d84c/14w02c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/03dec58354935b687679b9e4f7f9b346415778d2/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c844eb4e22c6c0a3b87835fc61a508caeeced1f9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/ca77d3fca9cd1c786d98c5e0949abd1f6bce4d4a/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W02C(5, "14w02c"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7d7d7362484c27ba4df5250e55c6ce7f9ee507cc/14w02b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c595430ae9d3624bae57b6cb5719399d87a0fe61/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2f873b2fd721c9ed5ef51e80df96d10e5390ee9f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/ae141a3e630991520327f9f4f9ad5516359624ff/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W02B(5, "14w02b"),
    @SnapshotFor(v1_8)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/32084e58b99ce15a667ed1ef39c3366c84350651/14w02a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/16fd472f9634bf49d051e4d84676fe4a5498cd14/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b908214fb99891c4f1e77c21b1fcbe4f7cafdd58/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/6071c89c09e3b8172f09c71bcc36465c1863e800/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_14W02A(5, "14w02a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2e818dc89e364c7efcfa54bec7e873c5f00b3840/1.7.10.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e80d9b3bf5085002218d4be59e668bac718abbc6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/952438ac4e01b4d115c5fc38f891710c4941df29/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a79b91ef69b9b4af63d1c7007f60259106869b21/windows_server.exe")
    v1_7_10(5, "1.7.10"),
    @PrereleaseFor(v1_7_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1aadefe92e61950c9ea178db4d562c4c1a0bb5ff/1.7.10-pre4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fc8b2a30a28bbb45dd8a1b0257f51304c102ad13/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7c8249c626996c4474afe4f26071a91e7efd825a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/b2739ca427c95010614cbcacf7390bf17410b57d/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_7_10_PRE4(5, "1.7.10-pre4"),
    @PrereleaseFor(v1_7_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3283163b0e4f3cbfb13f32ff3d19bd1d1c83c177/1.7.10-pre3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9e3d4d71e9827fa2024ec90c065b2120ba80a024/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b9fdcbd17407d9eaeedcf4ff79b3121ee40133db/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/267c1456c63485f1b91fd3504795e18799c3a404/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_7_10_PRE3(5, "1.7.10-pre3"),
    @PrereleaseFor(v1_7_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/09d4e1fcd0b02cab2709a19558b20136268168cc/1.7.10-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/aadaad3fa610c67fd96728fc2dfedd4239896965/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/ea9fdacf5b0eadfbec5f8aed89c4da3c6be87060/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/550ec9f1bb2d43f6d978d8bb3d4b20515e96947d/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_7_10_PRE2(5, "1.7.10-pre2"), // missing pre-reupload (client)
    @PrereleaseFor(v1_7_10)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b1832b49dbc5dae395b34cc6bb4aa32e3b450324/1.7.10-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/06110da00aa3cf4a6856a736422336dcb4640017/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/db79ef4be8b37093c7ca4ddbd54ede2ca21d2a9f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/2741b477f10e06d58012c9bc552e06dd0a17a534/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_7_10_PRE1(5, "1.7.10-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/930a26a3c81803e2f6b9a4069ac14c2e7aaf3b8a/1.7.9.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fbbaae784b1de315a8d08a82c6c345a583fb676b/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4cec86a928ec171fdc0c6b40de2de102f21601b5/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/51c1fd99e3814bae2a5d470dc9068205ab5c17a6/windows_server.exe")
    v1_7_9(5, "1.7.9"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b9b245eb23540c2bb1f5886b1d3a353870c8b684/1.7.8.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/83ae44189888a873f46f7509a87ebdb6dc785741/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c69ebfb84c2577661770371c4accdd5f87b8b21d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/6a6f9c4ee3cf15f27e002c171568571677cf7820/windows_server.exe")
    v1_7_8(5, "1.7.8"),
    @ClientJson({"https://betacraft.pl/launcher/assets/versions/1.7.7-1.json", "https://launchermeta.mojang.com/v1/packages/ef55209910a073339aadf8394bb3504f6c03048c/1.7.7.json"})
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/1.7.7-1.jar", "https://launcher.mojang.com/v1/objects/e520f254a2b496d61839b816d712e238b1243f30/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/a6ffc1624da980986c6cc12a1ddc79ab1b025c62/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/10e3b9767064b2019142b8a68c9e179f897f7496/windows_server.exe")
    v1_7_7(5, "1.7.7"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4cdba7fb4ea885d508bf7469812bdcee6b490681/1.7.6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6b2c5827994e17f904f0852f962dd6fccfbb8bdc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/41ea7757d4d7f74b95fc1ac20f919a8e521e910c/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/99615bc71d0a6e178961edc13be57cf4b7d0ef75/windows_server.exe")
    v1_7_6(5, "1.7.6"), // missing pre-reupload (client)
    @PrereleaseFor(v1_7_6)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8eedd564a29fbf6185d0a95d683d24e4322cb884/1.7.6-pre2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/24e28d53aecff54ff9be2a1ba1ffe008b86f7ed6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5aa5deddbe750a384bdb5ed0652bbda33cf4e5c8/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/f2e07d3d06e4daba5d107f5d1e59324ee25e4679/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_7_6_PRE2(5, "1.7.6-pre2"),
    @PrereleaseFor(v1_7_6)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ca0399bf77ba4598018eb81a89897b57ae2b22ab/1.7.6-pre1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0a8b12ed910a51bf7099e2e2b3a279ec63073e5e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/121176f19f38780d0cd04bef87c1296fedb37cd0/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/883b4f03233b2e92285d85a741d91e4a758d3fdd/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_7_6_PRE1(5, "1.7.6-pre1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a0481eaa9979795bb567398a02cc3d7a3775403a/1.7.5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/77aa70ac5054cbf1140b6449b579e950d5050c4a/client.jar")
    @ServerJar({"https://betacraft.pl/server-archive/minecraft/1.7.5-1.jar", "https://launcher.mojang.com/v1/objects/e1d557b2e31ea881404e41b05ec15c810415e060/server.jar"})
    @ServerExe({"https://betacraft.pl/server-archive/minecraft/1.7.5-1.exe", "https://launcher.mojang.com/v1/objects/933b87c8fac1bc72271442d419b96dd87125dbc8/windows_server.exe"})
    v1_7_5(4, "1.7.5"),
    @ClientJson({"https://betacraft.pl/launcher/assets/versions/1.7.4-pre.json", "https://launchermeta.mojang.com/v1/packages/b06faa2910235ba9ecfab434e54e04a0d5f6187d/1.7.4.json"})
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/1.7.4-pre.jar", "https://launcher.mojang.com/v1/objects/900950d8e3217b3a42405d1ecf767dcc31239d69/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/61220311cef80aecc4cd8afecd5f18ca6b9461ff/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/7ab49ad1c31a59af47033437e3f39a79084f88f1/windows_server.exe")
    v1_7_4(4, "1.7.4"),
    @PrereleaseFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6ad7a69e99996ddb88824a764a869c7ea410ffb3/1.7.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/feaf10fa9da94c388f2c53a2cf31a14406d0c532/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/707857a7bc7bf54fe60d557cca71004c34aa07bb/server.jar")
    @Type(Types.SNAPSHOT)
    v1_7_3(4, "1.7.3"),
    @SnapshotFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ba7947f99ec9a16b9d2f2e1f2bef7d71c523ea54/13w49a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a200562ad380a768fc63ad6c51a05aa2363dffff/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/164c350e011f491f6e12861ee4988ef2ccecfe0e/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8c4a2c73fb3b81a9fcf8863ffa68207e6e107230/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W49A(4, "13w49a"),
    @SnapshotFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6d3d2f6b7fa888b2c6c5bd457e2b6baaf4405faf/13w48b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/064dae8977232b5470127c689e0c9d19c1c16dcd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9ab8a06fe77ed7f553ae3427d304e9f55de339d9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/dd4d9088d6c954f498cb2115168f888c3597ec04/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W48B(4, "13w48b"),
    @SnapshotFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e1330699e090befe8deb8b4606dbc21e59ed8e5b/13w48a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/069a7c867e6ebac830c9f3fef42a942ebd1e2204/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/8f43e47eb288d3485f7825c422e9c5bcaf6418af/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/9e131db93147ea60265b9f262ad2de359be12aa5/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W48A(4, "13w48a"),
    @SnapshotFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/880bdce57f43afb0d5a083fba090c99e7b99f514/13w47e.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1f9aa6969b4f086bef1232241579312de5c51d7f/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0f08e81b37b2c06ead45f498a7c8efa10a02633a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8092d8299d8307a63760a98420211376bc12b736/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W47E(4, "13w47e"),
    @SnapshotFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0ccb6fd168823b91d26934e43af326665ba48963/13w47d.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2e94ebcc798b810409e7b1ea8174ec3c060634d7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/28982e580acf736120a4f1c3e7418e2a8daa3a8c/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e32e5cfe7b15cffb8a73eed5af75074e3dc916a3/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W47D(4, "13w47d"),
    @SnapshotFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/dd754b7d7f95b056556a6044ab4de763a9bead73/13w47c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3ed9a5dae1cb4d5776d2e0df30aaeb045e32d7cb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5cf618125f87452e665f0097171d089f73dc7e1c/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/1c72fb9b13daa15ef1d0af552ad770d4d2b7bc27/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W47C(4, "13w47c"),
    @SnapshotFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/231f5e4d3df49da8b84e71cae2d90d14b575460e/13w47b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a7e8a25c8940ac44805e0de9cb622c03ef696d62/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/7c1b69de43b6edf1d20f5030b88df78fd08ad8c7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5f1efcb583df70edfa40ee1dceb0a2e8cd8c6083/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W47B(4, "13w47b"),
    @SnapshotFor(v1_7_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b871593e6fe9faf9e1557b4cfe272e7c1e05fd20/13w47a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e15cafae431bda45dfc2f41f400242247807a046/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f3210daa0a05a88b8b8edadfc8af385ff3f88987/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/646a5a685a3eb9bb9e94425dd3594858c774d0d9/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W47A(4, "13w47a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/83a7d28760ed623225e7cb2e29db140cc68540e8/1.7.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/0c8689f904922af71c7144dcfb81bce976cadd49/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3716cac82982e7c2eb09f83028b555e9ea606002/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/07ae7cdcff6199735eb0f40da5d5c0763558a678/windows_server.exe")
    v1_7_2(4, "1.7.2"),
    @PrereleaseFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4772d17d3ffdc243d22d136ccec04b0d1093bb25/1.7.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c0a041784d05e89b556ab8be42bed6009355165a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d26d79675147253b7a35dd32dc5dbba0af1be7e2/server.jar")
    @Type(Types.SNAPSHOT)
    v1_7_1(3, "1.7.1"),
    @PrereleaseFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/5d831c6ad5d1d3547168e981f7786555ae154c05/1.7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fe85ec7d2dee38ac978288a964bed44030287245/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3f031ab8b9cafedeb822febe89d271b72565712c/server.jar")
    @Type(Types.SNAPSHOT)
    v1_7(3, "1.7"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6c1693fe1f674b821699782ddee5370f432041fc/13w43a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8012b0d70a55f7267f34d4fb414cfedce05defa7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0fd72957ddbedd604d2bdf155dd03c8501c48f48/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/132e487de965e8bf610defcf490f3917a1efc268/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W43A(2, "13w43a"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b4010b058dd098ae49ead32d1c03deda74a0285a/13w42b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8f61c8284d3fe53acc77f122420d07ff46038e4c/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1416ebe3d6e6aa62eaae305ce542c39b7dfcb2b9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/1a4250e4f4101a82c44caa01b570e15f77dcfc5d/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W42B(1, "13w42b"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d6d9998807948f87aaf279dd0555dfdbf1c3baaf/13w42a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1021c0a06cc98db76dad2b19805ed21935c8d938/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d7007e5f46bb1ad4f4d38dc8cd2ea54898c6cccb/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5bda1ffa1e5eee880b52f58ecb806a4ef01833d1/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W42A(1, "13w42a"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e0b86f8f6029b81a980afeb661774aa7ebb9067b/13w41b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1464fe999b3f2f9488bdb53bef775a5e80753af0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d0f1808505d59bd69c47d8e0ce01dc5936d34c34/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/bba9cdf1c0316f557da10dad0a440803cd5d8377/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W41B(0, "13w41b"), // missing pre-reupload (both client and server)
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b81e1a63c1e420f5fb5c9b5c0aaa5bc7eb187e7c/13w41a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e1577011742284794337ab4efeefd1414714fc45/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/fbe939a8a9246db801428e33a1c53506af637247/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a02e614918369b234e76eeee93ff2cf922985ee7/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W41A(0, "13w41a"),

    /* pre-netty versions */
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f2bb7d91452ebcd98bc77b0e69d279b1146c02a4/13w39b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/17969ef3be3a8ca59d38cfc2e2401ceb1dd17abc/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/1db7286055aeb35c709d98ace1c9cdc739206d5a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/bfe00d5f74a521b9e41d343c4acbc32000e429af/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W39B(80, "13w39b"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2f4e00c7f6e3bc4a707c027ae2b527bcede4adda/13w39a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b091a8b92b9d0b1f23ee2fd1a048b751f437ff76/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/10e8687a623cb3def606fa3855aaed5ef79aac66/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/0fd70dcd7cc81087a28d7cd508cb8c896220d0b9/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W39A(80, "13w39a"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a9e87e0699f19fea280878f5deb744c5d5d3ccb1/13w38c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1424fb2795c4d86ea034b868a2fd56c6ce6912d9/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/03081b4b569174ec68ef9cdd574ee4feca05dea5/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/c5cd1c39b31d3b66e7c2620769a6d6a42ebce477/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W38C(79, "13w38c"), // missing pre-reupload (both client and server)
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6f426be1993b140ab5d10459c91eb1f542d58c82/13w38b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/fe9877ec3c63ebf262c22ce4a941f5b02273ced1/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/82588f79a6a61c4c4289a9dc60b7b7b3fedaead9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/7a2bb70916e9855cec0a60c5c5d05487f4b20049/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W38B(79, "13w38b"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e6dc1d9f9c8efeec67af438d5bf61be082f6e8a4/13w38a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5eddd7089cf7535281927be7f183e62a6d9fdfd3/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/627585cdb9386e7f05cdfb8f092e5a303d4fd5f3/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5b1a28f0ba642f1fe1d0476b9ffa7faa6f307888/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W38A(79, "13w38a"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b8d28154ee056af6af3c8c37815418fe0e9f34f8/13w37b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/40850dff34422b17c4b6308d43277d3ebf5c5b0e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f6322a6791bbeabac94cbaa1cf9b779ad88b120f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a938e1b0f75eba363e4684c3b7967dcc7f6f6187/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W37B(79, "13w37b"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2f33c613a4bb81ef5f56be03a8f578208ada382a/13w37a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/02a9c7237e5a2b68d62d3cacd36d23c0437a14d5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c3d3d936394b35f20b871b140f5a8e6079822e51/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/6bb92bba0a587ce863d7e7184345c5b3f6fd6681/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W37A(79, "13w37a"),
    @SnapshotFor(v1_7_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4a538e23057a596fc8c7e04d8a7738d866467f51/13w36b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/bd29267cb8bfc3dd3821a9e5995e49c0c7516e72/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2b6cdcd2df82ca8f04c1c2c7d77faf4cd25151ea/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/3fe33f83c16710049c551bf2e93d458165d1bde7/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W36B(79, "13w36b"), // missing pre-reupload 2 clients (this version was reuploaded twice)
    @SnapshotFor(v1_7_2)
    @ClientJson({"https://www.archive.org/download/Combat_Test_7ab/13w36a.json", "https://launchermeta.mojang.com/v1/packages/bc915c4dc167dfba92fcc0ae3aa051ae0f9f089b/13w36a.json"})
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/13w36a-1234.jar", "https://launcher.mojang.com/v1/objects/875b8f0cd1397b6eaaaef71090649382d46de2d6/client.jar"})
    @ServerJar({"https://betacraft.pl/server-archive/minecraft/snaps/1.7/13w36a-1.jar", "https://launcher.mojang.com/v1/objects/8453f031175bac1a92db000befd14f70c8df8fb7/server.jar"})
    @ServerExe({"https://betacraft.pl/server-archive/minecraft/snaps/1.7/13w36a-1.exe", "https://launcher.mojang.com/v1/objects/c0daa790cac55423b641b7ce643037c373edebf6/windows_server.exe"})
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W36A(79, "13w36a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b71bae449192fbbe1582ff32fb3765edf0b9b0a8/1.6.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1703704407101cf72bd88e68579e3696ce733ecd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/050f93c1f3fe9e2052398f7bd6aca10c63d64a87/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/30d3267c6b04422ef6349226ee539173f848574c/windows_server.exe")
    v1_6_4(78, "1.6.4"),
    @PrereleaseFor(v1_6_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/903d6ba1bc87c301d88fa418f8b33446201c7d4e/1.6.3.json")
    @ClientJar({"https://archive.org/download/MCJEPrereuploads/Release/1.6.3-pre-1.jar", "https://launcher.mojang.com/v1/objects/f9af8a0a0fe24c891c4175a07e9473a92dc71c1a/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/5a4c69bdf7c4a9aa9580096805d8497ba7721e05/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/fedce558d531d7c01c76e169ff92aee13b8d9da8/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_6_3(77, "1.6.3"),
    @ClientJson({"https://launchermeta.mojang.com/v1/packages/c0729761bf65dc58138ce508645dba1442fa78b8/1.6.2.json", "https://launchermeta.mojang.com/v1/packages/c0729761bf65dc58138ce508645dba1442fa78b8/1.6.2.json"})
    @ClientJar({"https://archive.org/download/MCJEPrereuploads/Release/1.6.2-1.jar", "https://launcher.mojang.com/v1/objects/b6cb68afde1d9cf4a20cbf27fa90d0828bf440a4/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/01b6ea555c6978e6713e2a2dfd7fe19b1449ca54/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a08ad9bdd208d0861cd62cef7251a2611b8217f5/windows_server.exe")
    v1_6_2(74, "1.6.2"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7fd8e0c76f62813eb0465e31bb74b160c01472d6/1.6.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/17e2c28fb54666df5640b2c822ea8042250ef592/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0252918a5f9d47e3c6eb1dfec02134d1374a89b4/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/f495386d0eded7346e7e77a1c6d7dfc5a5dae068/windows_server.exe")
    v1_6_1(73, "1.6.1"),
    @PrereleaseFor(v1_6_1)
    @ClientJson("https://s3.amazonaws.com/Minecraft.Download/versions/1.6/1.6.json")
    @ClientJar("https://s3.amazonaws.com/Minecraft.Download/versions/1.6/1.6.jar")
    @ServerJar("https://s3.amazonaws.com/Minecraft.Download/versions/1.6/minecraft_server.1.6.jar")
    @ServerExe("https://s3.amazonaws.com/Minecraft.Download/versions/1.6/minecraft_server.1.6.exe")
    @Type(Types.SNAPSHOT)
    v1_6(72, "1.6"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b349702aef5e3adaebec30c79338300423943930/13w26a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b9a5d053016efa035f1b424625e0fd4736ac2dd6/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/bafe11faf3419c8813beb948e353912239d50bc1/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/fc3bf59fce8a5a2bc3b871559d3b8bb9035cec36/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W26A(72, "13w26a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/934788bc580ef0a19725ee5bd31f02a0b866e0bf/13w25c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f0f3a912f7a929cc21b6340c5e552ed28f90fa94/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/0f21dbd39728a50843d1b20cf832f26aaada353d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5a48f00f68abd9278144eb1930d49ae9a3ba10fd/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W25C(71, "13w25c"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8b7870ddd0d0b38779479ad782d65ad80e688cf7/13w25b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/9c43c2084d56b7fe4a4952e64a070ab7c5fa2b17/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9f7f205d7c00098d9aa6abd67ce4f93d0eeddcd7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/2c71694ffd74c2adbf3884da657cab53847f01cf/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W25B(71, "13w25b"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/65c0e5fff89b477ac6f8ddb336f0e718d525d311/13w25a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b397e5bcf74858ce8f527c62c973087a0ea518a8/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/e1c2e7376fe489c5eba744b010993c402ab3f3f2/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/7ad6c310e5837343279377a6010d33a8e82d62d3/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W25A(71, "13w25a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e1294b52803771cfb06767c4c40dced70475cb25/13w24b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5a48548ecebbcacd9cd4d9faee77c4b34a4e092d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9c312da9bdcc562dc57e235a7a56900148c77f8d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/58f0c6a8dfed724bc99bb61028cbb9a1996d0843/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W24B(70, "13w24b"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/74666ab85cc5539f08aec638eabd63a552ed4125/13w24a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/440abbedd473bdf38821906db6ea825d042848ae/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d0f1eb0455c1bc3f73d5fc7252e282fd614f1f5b/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/692f473dbb2cf519e3729d062a8d9f9054b776c7/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W24A(69, "13w24a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7538fbae2b9f3613c840d7d59ebf3ef256cf7266/13w23b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f374a05f667ed8509cea98ad8c905feb1bf5d9cf/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b6b627c0a5fe9f53a22892f21c473e19617c1c0d/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/04657066c3f03ace103fa4ef2b7308670d53d1b8/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W23B(68, "13w23b"), // missing pre-reupload client
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/365db94f11e3aa54ab49f2add65628c67162d19f/13w23a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5f4d786a78b0b9b169f048b849f71dbc2d4ac0b0/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/b26a278856a6a4703054ad266b79b1ef397676c2/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/44a526ce45bd1e95444e2d4aa869dee140494548/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W23A(67, "13w23a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/70dd231f8782c47521532f4016135064172a8f71/13w22a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ae1cc0f5971d4b582791b34b5c4131ff324f91ac/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/94b99928dccee27ad9b1d90bd00e8f68f38f92e4/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/f2bc96a7d275f442b6e5fb2252e66cf7a3d19722/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W22A(67, "13w22a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f23bdcf606b386785433937dbd86a61aa5b05c76/13w21b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a9217325242df6decb96b2f14e1796953d1ce0fb/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/f5236a7628c74c22c33f57b50cb755598042aa5b/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/85af0c70d45b4fb8b8f6ee1ba78788a74e35dbd0/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W21B(67, "13w21b"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/fde079e7e92109831ddb7365bec0560408b4916e/13w21a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c89ead145ca87737ca2d10901a4f3bc837937006/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/a04b6f0349b8de64c68a9311b4eaff478e37b558/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/f1e233ab374e929d0d76e568fcd7e046f8b75106/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W21A(67, "13w21a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/31817d010e077565c5897c1a0b211705fbd5c422/13w19a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/39ef2f27bada1fb1a6addd972a25427ec33bd39d/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/17997ee2d9a3ad1070a74707f58ebb3e3a46ae10/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8d7e18b2ebaceb1f6cb7dec83149026a297f8ece/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W19A(66, "13w19a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e14ef99365c73ca560e465008b7fbd40943657c0/13w18c.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e228310436fe3f70919092b5faff1aef9321b9a5/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3f8dc565567174d777a416f979901e0fee010d2a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e45c278ae58dbb479a6fb1b13027410bad8d3e36/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W18C(65, "13w18c"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/06a6347b879b23939c2ef891da793c901aad1abf/13w18b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/8061f2ea34b71999048b78a8aefe0bac9d30f91e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/af7fd5e8cdc610f1e533ba7963bc39de422df1b6/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a57e08dced02e0f0af59b1bad4ab642329ca876c/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W18B(65, "13w18b"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c3b954ae61f7d12e054ef01aae578877434567fd/13w18a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a2c623ea7fb3bfc5cdcc402f8aadf22ff657b2d7/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/6084eae41c6e28d58fe8a1ee4ab4389a392f0139/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/749f128f21b7c5efcc2cc14649541c0f207cfe4e/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W18A(65, "13w18a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1d8fc94746613cce31742b0cb100e4eac773d65d/13w17a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/87ef559adfe7d7980c0158d3dbaa28792d4e62cd/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/48ece561c3512b2f9c0915dad7c3cb65560ceb39/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/6a058ad6d8766af311ed11c40a0f62e6952bb2a8/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W17A(64, "13w17a"),
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/08460fe0cd5c5a717c6e672e9a9c25dfa1bfda75/13w16b.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/17bdf9c566c9ce6726122eb3866581e4bbfa8e16/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/c125111764b5774403ff2183debbb9da4805a64f/server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W16B(63, "13w16b"), // missing pre-reupload client
    @SnapshotFor(v1_6_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3b6e2f21e4b462476e8ce5f5dcd018a934aea656/13w16a.json")
    @ClientJar({"https://files.betacraft.pl/launcher/assets/versions/13w16a-181812.jar", "https://launcher.mojang.com/v1/objects/0764eecadf08ffb7a5ec96594afbc2ce844f8716/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/dd76b63bad493e42b303dd8952c240f330251760/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/55ae63f28948740fbabe4a85639fccd38dc34c1a/windows_server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W16A(62, "13w16a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b2c923ac5d0a933eb76a9ff54da59aaab18b4625/1.5.2.json")
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/1.5.2-pre-1.jar", "https://launcher.mojang.com/v1/objects/465378c9dc2f779ae1d6e8046ebc46fb53a57968/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/f9ae3f651319151ce99a0bfad6b34fa16eb6775f/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/49fded489aae76e012048c3c81dcc323384ef781/windows_server.exe")
    v1_5_2(61, "1.5.2"),
    @AprilFoolsVersion
    @ClientJson("https://archive.org/download/2point-0-blue/2point0_blue.json")
    @ClientJar("https://archive.org/download/2point-0-blue/2point0_blue.jar")
    @ServerJar("https://archive.org/download/2point-0-blue/2point0_blue_server.jar")
    @IgnoreTest("april fools version")
    @Name("2.0")
    v2_0_BLUE(90, "2.0 Blue"),
    @AprilFoolsVersion
    @ClientJson("https://archive.org/download/2point-0-red/2point0_red.json")
    @ClientJar("https://archive.org/download/2point-0-red/2point0_red.jar")
    @ServerJar("https://archive.org/download/2point-0-red/2point0_red_server.jar")
    @IgnoreTest("april fools version")
    @Name("2.0")
    v2_0_RED(91, "2.0 Red"),
    @AprilFoolsVersion
    @ClientJson("https://archive.org/download/2point-0-purple/2point0_purple.json")
    @ClientJar("https://archive.org/download/2point-0-purple/2point0_purple.jar")
    @ServerJar("https://archive.org/download/2point-0-purple/2point0_purple_server.jar")
    @IgnoreTest("april fools version")
    @Name("2.0")
    v2_0_PURPLE(92, "2.0 Purple"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/71734ab8e78abfa294fedd297aef2dff6e8a9127/1.5.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/047136381a552f34b1963c43304a1ad4dc0d2d8e/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d07c71ee2767dabb79fb32dad8162e1b854d5324/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5492d8d1dfaff8b9dce1536a1e578e60b57b4d31/windows_server.exe")
    v1_5_1(60, "1.5.1"),
    @SnapshotFor(v1_5_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w12~.json")
    @ClientJar("https://assets.minecraft.net/13w12_/minecraft.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W12(60, "13w12~"), // missing pre-reupload; no corresponding server because the fix applies only to client
    @SnapshotFor(v1_5_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w11a.json")
    @ClientJar("https://assets.minecraft.net/13w11a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w11a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w11a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W11A(60, "13w11a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/737ffeea721a7a5a5f92f91e6e6ca670f1e7080f/1.5.json")
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/1.5-pre-1.jar", "https://launcher.mojang.com/v1/objects/a3da981fc9b875a51975d8f8100cc0c201c2ce54/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/aedad5159ef56d69c5bcf77ed141f53430af43c3/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/6aab93583104a1acfa9b01fd48a10726daf8f011/windows_server.exe")
    v1_5(60, "1.5"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w10b.json")
    @ClientJar("https://assets.minecraft.net/13w10b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w10b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w10b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W10B(60, "13w10b"),
    @SnapshotFor(v1_5)
    @ClientJson("https://ia801403.us.archive.org/11/items/Minecraft-JSONs/13w10a.json")
    @ClientJar("https://assets.minecraft.net/13w10a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w10a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w10a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W10A(60, "13w10a"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w09c.json")
    @ClientJar("https://assets.minecraft.net/13w09c/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w09c/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w09c/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W09C(60, "13w09c"),
    @SnapshotFor(v1_5)
    @ClientJson("https://ia801403.us.archive.org/11/items/Minecraft-JSONs/13w09b.json")
    @ClientJar("https://assets.minecraft.net/13w09b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w09b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w09b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W09B(59, "13w09b"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w09a.json")
    @ClientJar("https://assets.minecraft.net/13w09a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w09a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w09a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W09A(59, "13w09a"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w07a.json")
    @ClientJar("https://assets.minecraft.net/13w07a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w07a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w07a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W07A(58, "13w07a"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w06a.json")
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/13w06a-1.jar", "https://assets.minecraft.net/13w06a/minecraft.jar"})
    @ServerJar("https://assets.minecraft.net/13w06a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w06a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W06A(58, "13w06a"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w05b.json")
    @ClientJar("https://assets.minecraft.net/13w05b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w05b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w05b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W05B(57, "13w05b"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w05a.json")
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/13w05a-1.jar", "https://assets.minecraft.net/13w05a/minecraft.jar"})
    @ServerJar("https://assets.minecraft.net/13w05a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w05a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W05A(56, "13w05a"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w04a.json")
    @ClientJar("https://assets.minecraft.net/13w04a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w04a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w04a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W04A(55, "13w04a"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w03a.json")
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/13w03a-1613.jar", "https://assets.minecraft.net/13w03a/minecraft.jar"})
    @ServerJar("https://assets.minecraft.net/13w03a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w03a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W03A(54, "13w03a"), // missing original client
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w02b.json")
    @ClientJar("https://assets.minecraft.net/13w02b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w02b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w02b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W02B(53, "13w02b"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w02a.json")
    @ClientJar("https://assets.minecraft.net/13w02a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w02a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w02a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W02A(53, "13w02a"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w01b.json")
    @ClientJar("https://assets.minecraft.net/13w01b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w01b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w01b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W01B(52, "13w01b"),
    @SnapshotFor(v1_5)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/13w01a.json")
    @ClientJar("https://assets.minecraft.net/13w01a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/13w01a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/13w01a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_13W01A(52, "13w01a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1f39de3ea637baf634a1a9cfcbb17ea41ee6edfe/1.4.7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/53ed4b9d5c358ecfff2d8b846b4427b888287028/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/2f0ec8efddd2f2c674c77be9ddb370b727dec676/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/89215f5de02929aaa091e580ffbcfc4b5b0c1bbf/windows_server.exe")
    v1_4_7(51, "1.4.7"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0a0a5ec9d5b9d9b0d917bfcd286f04e268475c17/1.4.6.json")
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/1.4.6-pre-1428.jar", "https://betacraft.pl/launcher/assets/versions/1.4.6-pre-2.jar", "https://launcher.mojang.com/v1/objects/116758f41b32e8d1a71a4ad6236579acd724bca7/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/a0aeb5709af5f2c3058c1cf0dc6b110a7a61278c/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/739da655218583520e129c5af0580b8d5dfb1b31/windows_server.exe")
    v1_4_6(51, "1.4.6"),
    @SnapshotFor(v1_4_6)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w50b.json")
    @ClientJar("https://assets.minecraft.net/12w50b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w50b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w50b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W50B(51, "12w50b"),
    @SnapshotFor(v1_4_6)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w50a.json")
    @ClientJar("https://assets.minecraft.net/12w50a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w50a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w50a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W50A(51, "12w50a"),
    @SnapshotFor(v1_4_6)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w49a.json")
    @ClientJar("https://assets.minecraft.net/12w49a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w49a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w49a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W49A(50, "12w49a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0529655d5f71b11f962debe52937af2f5499bf89/1.4.5.json")
    @ClientJar({"https://betacraft.pl/launcher/assets/versions/1.4.5-pre-1.jar", "https://launcher.mojang.com/v1/objects/7a8a963ababfec49406e1541d3a87198e50604e5/client.jar"})
    @ServerJar("https://launcher.mojang.com/v1/objects/c12fd88a8233d2c517dbc8196ba2ae855f4d36ea/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a60dc51007cfe8b2e61cfbbc48f3846f4c471f98/windows_server.exe")
    v1_4_5(49, "1.4.5"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/bd4ba783db61fdf4f23638b03bc6e5dd77e6c3e8/1.4.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b9b2a9e9adf1bc834647febc93a4222b4fd6e403/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/4215dcadb706508bf9d6d64209a0080b9cee9e71/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/384a621aa8e8f6f7483bbf4a0e1a9d13142bbd59/windows_server.exe")
    v1_4_4(49, "1.4.4"),
    @PrereleaseFor(v1_4_4)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/180deba5c263367e914217be0701bd9e1a44f13b/1.4.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f7274b201219b5729055bf85683eb6ef4f8024b4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9be68adf6e80721975df12f2445fa24617328d18/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/a488348feb1bb708c36bbef1b1bfadb404106a46/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_4_3(48, "1.4.3"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/654842fb5da43a3b3df9cf76ddb46e6a88a6ad08/1.4.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/42d6744cfbbd2958f9e6688dd6e78d86d658d0d4/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/5be700523a729bb78ef99206fb480a63dcd09825/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5c94ac0043dc21bc71b8e1fa3fbac62139c820fe/windows_server.exe")
    v1_4_2(47, "1.4.2"),
    @PrereleaseFor(v1_4_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/859f584890b4db227f267026510c6ac2a5076d94/1.4.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/67604a9c206697032165fc067b6255e333e06275/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/baa4e4a7adc3dc9fbfc5ea36f0777b68c9eb7f4a/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/024759aa551129d71b202c0b5a65d56d5a6c093f/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_4_1(47, "1.4.1"),
    @PrereleaseFor(v1_4_2)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/070986801bc1d42eac872758cf12f00afa7b5f35/1.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/2007097b53d3eb43b2c1f3f78caab4a4ef690c7a/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/9470a2bb0fcb8a426328441a01dba164fbbe52c9/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/29a7d1e17f7594a9e88b6ba8e7888890aa746a5d/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_4(47, "1.4"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w42b.json")
    @ClientJar("https://assets.minecraft.net/12w42b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w42b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w42b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W42B(46, "12w42b"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w42a.json")
    @ClientJar("https://assets.minecraft.net/12w42a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w42a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w42a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W42A(46, "12w42a"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w41b.json")
    @ClientJar("https://assets.minecraft.net/12w41b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w41b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w41b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W41B(46, "12w41b"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w41a.json")
    @ClientJar("https://assets.minecraft.net/12w41a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w41a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w41a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W41A(46, "12w41a"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w40b.json")
    @ClientJar("https://assets.minecraft.net/12w40b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w40b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w40b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W40B(45, "12w40b"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w40a.json")
    @ClientJar("https://assets.minecraft.net/12w40a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w40a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w40a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W40A(44, "12w40a"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w39b.json")
    @ClientJar("https://assets.minecraft.net/12w39b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w39b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w39b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W39B(43, "12w39b"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w39a.json")
    @ClientJar("https://assets.minecraft.net/12w39a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w39a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w39a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W39A(43, "12w39a"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w38b.json")
    @ClientJar("https://assets.minecraft.net/12w38b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w38b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w38b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W38B(43, "12w38b"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w38a.json")
    @ClientJar("https://assets.minecraft.net/12w38a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w38a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w38a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W38A(43, "12w38a"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://ia801403.us.archive.org/11/items/Minecraft-JSONs/12w37a.json")
    @ClientJar("https://assets.minecraft.net/12w37a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w37a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w37a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W37A(42, "12w37a"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w36a.json")
    @ClientJar("https://assets.minecraft.net/12w36a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w36a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w36a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W36A(42, "12w36a"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w34b.json")
    @ClientJar("https://assets.minecraft.net/12w34b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w34b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w34b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W34B(42, "12w34b"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w34a.json")
    @ClientJar("https://assets.minecraft.net/12w34a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w34a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w34a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W34A(41, "12w34a"),
    @SnapshotFor(v1_4_2)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w32a.json")
    @ClientJar("https://assets.minecraft.net/12w32a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w32a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w32a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W32A(40, "12w32a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/f26cd0fc6c8f18f54cf43a529faac3c0cc9de7ac/1.3.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c2efd57c7001ddf505ca534e54abf3d006e48309/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/3de2ae6c488135596e073a9589842800c9f53bfe/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/1aba78a34a6c412fffd69ea2d3fbcfc40316e521/windows_server.exe")
    v1_3_2(39, "1.3.2"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/af8b3899e7740cb5c83b8825dc6a0ed2f71e1b1f/1.3.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/33167e71e85ab8e6ddbe168bc67f6ec19d708d62/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/82563ce498bfc1fc8a2cb5bf236f7da86a390646/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/5dda8413c6376e0ff0eccd5817a2ca94954b16df/windows_server.exe")
    v1_3_1(39, "1.3.1"),
    @PrereleaseFor(v1_3_1)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/aeb1bb40dc59420433ae46a0f133392508218bbe/1.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4dfb8098b39c122f2aad13768d3f0d04db910f12/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/cb21a9aaaf599c94dd7fa1b777b2f0cc37a776c7/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/e3109763d7e2eda3a3ac4c3f0c11e27c0415535b/windows_server.exe")
    @Type(Types.SNAPSHOT)
    v1_3(39, "1.3"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w30e.json")
    @ClientJar("https://assets.minecraft.net/12w30e/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w30e/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w30e/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W30E(39, "12w30e"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w30d.json")
    @ClientJar("https://assets.minecraft.net/12w30d/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w30d/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w30d/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W30D(39, "12w30d"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w30c.json")
    @ClientJar("https://assets.minecraft.net/12w30c/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w30c/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w30c/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W30C(39, "12w30c"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w30b.json")
    @ClientJar("https://assets.minecraft.net/12w30b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w30b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w30b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W30B(38, "12w30b"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w30a.json")
    @ClientJar("https://assets.minecraft.net/12w30a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w30a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w30a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W30A(38, "12w30a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w27a.json")
    @ClientJar("https://assets.minecraft.net/12w27a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w27a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w27a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W27A(38, "12w27a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w26a.json")
    @ClientJar("https://assets.minecraft.net/12w26a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w26a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w26a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W26A(37, "12w26a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w25a.json")
    @ClientJar("https://assets.minecraft.net/12w25a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w25a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w25a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W25A(37, "12w25a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w24a.json")
    @ClientJar("https://assets.minecraft.net/12w24a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w24a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w24a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W24A(36, "12w24a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w23b.json")
    @ClientJar("https://assets.minecraft.net/12w23b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w23b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w23b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W23B(35, "12w23b"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w23a.json")
    @ClientJar("https://assets.minecraft.net/12w23a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w23a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w23a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W23A(35, "12w23a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w22a.json")
    @ClientJar("https://assets.minecraft.net/12w22a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w22a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w22a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W22A(34, "12w22a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w21b.json")
    @ClientJar("https://assets.minecraft.net/12w21b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w21b/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w21b/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W21B(33, "12w21b"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://ia801403.us.archive.org/11/items/Minecraft-JSONs/12w21a.json")
    @ClientJar("https://assets.minecraft.net/12w21a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w21a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w21a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W21A(33, "12w21a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w19a.json")
    @ClientJar("https://assets.minecraft.net/12w19a/minecraft.zip")
    @ServerJar("https://assets.minecraft.net/12w19a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w19a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W19A(32, "12w19a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w18a.json")
    @ClientJar("https://assets.minecraft.net/12w18a/minecraft.zip")
    @ServerJar("https://assets.minecraft.net/12w18a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w18a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W18A(32, "12w18a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w17a.json")
    @ClientJar("https://assets.minecraft.net/12w17a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w17a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w17a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W17A(31, "12w17a"),
    @SnapshotFor(v1_3_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w16a.json")
    @ClientJar("https://assets.minecraft.net/12w16a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w16a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w16a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W16A(30, "12w16a"),
    @SnapshotFor(v1_3_1)
    @ClientJar("https://assets.minecraft.net/12w15a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w15a/minecraft_server.jar")
    @ServerExe("https://assets.minecraft.net/12w15a/Minecraft_Server.exe")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W15A(29, "12w15a"), // missing client json
    @ClientJson("https://launchermeta.mojang.com/v1/packages/10d52c2d052078115cbbaf6e927b8a1af1ac206b/1.2.5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4a2fac7504182a97dcbcd7560c6392d7c8139928/client.jar")
    @ServerJar("https://launcher.mojang.com/v1/objects/d8321edc9470e56b8ad5c67bbd16beba25843336/server.jar")
    @ServerExe("https://launcher.mojang.com/v1/objects/8eaf5909489d9b54fd9748ddbbb4b6870a1d3de6/windows_server.exe")
    v1_2_5(29, "1.2.5"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7b1328920b979517feb3210d73f4da7f52955e60/1.2.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ad6d1fe7455857269d4185cb8f24e62cc0241aaf/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/1.2.4.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/1.2.4.exe")
    v1_2_4(29, "1.2.4"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/732667ccdad3ded51308bb2ee98b39cc91478e09/1.2.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/5134e433afeba375c00bbdcd8aead1d3222813ee/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/1.2.3.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/1.2.3.exe")
    v1_2_3(28, "1.2.3"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/00c0f7895513335aec6693ec42c29ed033b1245c/1.2.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1dadfc4de6898751f547f24f72c7271218e4e28f/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/1.2.2.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/1.2.2.exe")
    v1_2_2(28, "1.2.2"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/336126769b60851df3d17acaea21715575e2c427/1.2.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/c7662ac43dd04bfd677694a06972a2aaaf426505/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/1.2.1.jar")
    v1_2_1(28, "1.2.1"),
    @PrereleaseFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/1.2.json")
    @ClientJar("https://assets.minecraft.net/1_2/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/1_2/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    v1_2(28, "1.2"),
    @SnapshotFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w08a.json")
    @ClientJar("https://assets.minecraft.net/12w08a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w08a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W08A(28, "12w08a"),
    @SnapshotFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w07b.json")
    @ClientJar("https://assets.minecraft.net/12w07b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w07b/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W07B(27, "12w07b"),
    @SnapshotFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w07a.json")
    @ClientJar("https://assets.minecraft.net/12w07a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w07a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W07A(27, "12w07a"),
    @SnapshotFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w06a.json")
    @ClientJar("https://assets.minecraft.net/12w06a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w06a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W06A(25, "12w06a"),
    @SnapshotFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w05b.json")
    @ClientJar("https://assets.minecraft.net/12w05b/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w05b/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W05B(24, "12w05b"),
    @SnapshotFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w05a.json")
    @ClientJar({"https://archive.org/download/MinecraftJEPrereleaseClients/new%20changes/12w05a-1.zip/12w05a-1%2F12w05a-1.jar", "https://assets.minecraft.net/12w05a/minecraft.jar"})
    @ServerJar("https://assets.minecraft.net/12w05a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W05A(24, "12w05a"),
    @SnapshotFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w04a.json")
    @ClientJar("https://assets.minecraft.net/12w04a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w04a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W04A(24, "12w04a"),
    @SnapshotFor(v1_2_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w03a.json")
    @ClientJar("https://assets.minecraft.net/12w03a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w03a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W03A(24, "12w03a"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ff5090f9c4a71c454d9f0d1c4d0f61aa810b282b/1.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f690d4136b0026d452163538495b9b0e8513d718/client.jar")
    @ServerJar("https://web.archive.org/web/20120208062853/https://s3.amazonaws.com/MinecraftDownload/launcher/minecraft_server.jar")
    v1_1(23, "1.1"),
    @SnapshotFor(v1_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/12w01a.json")
    @ClientJar("https://assets.minecraft.net/12w01a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/12w01a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_12W01A(23, "12w01a"),
    @SnapshotFor(v1_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/11w50a.json")
    @ClientJar("https://assets.minecraft.net/11w50a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/11w50a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_11W50A(22, "11w50a"),
    @SnapshotFor(v1_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/11w49a.json")
    @ClientJar("https://assets.minecraft.net/11w49a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/11w49a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_11W49A(22, "11w49a"),
    @SnapshotFor(v1_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/11w48a.json")
    @ClientJar("https://assets.minecraft.net/11w48a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/11w48a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_11W48A(22, "11w48a"),
    @SnapshotFor(v1_1)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/11w47a.json")
    @ClientJar("https://assets.minecraft.net/11w47a/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/11w47a/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    SNAPSHOT_11W47A(22, "11w47a"),
    @ServerJar("https://betacraft.pl/server-archive/minecraft/1.0.1.jar")
    v1_0_1(22, "1.0.1"), // server-only update; missing exe
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b37678e5477edf44d7fabea9957106ad9bc309a2/1.0.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b679fea27f2284836202e9365e13a82552092e5d/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/1.0.0.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/1.0.0.exe")
    v1_0_0(22, "1.0.0"),
    @ReleaseCandidateFor(v1_0_0)
    @ClientJson({"https://archive.org/download/Minecraft-JE-Beta/1.0.0-rc2-1/1.0.0-rc2-1.json", "https://archive.org/download/Minecraft-JE-Beta/1.0.0-rc2-2/1.0.0-rc2-2.json", "https://archive.org/download/Minecraft-JE-Beta/1.0.0-rc2-3/1.0.0-rc2-3.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Beta/1.0.0-rc2-1/1.0.0-rc2-1.jar", "https://archive.org/download/Minecraft-JE-Beta/1.0.0-rc2-2/1.0.0-rc2-2.jar", "https://assets.minecraft.net/rc2/minecraft.jar"})
    @ServerJar("https://assets.minecraft.net/rc2/minecraft_server.jar")
    @Type(Types.SNAPSHOT)
    RC2(22, "RC2"),
    @ReleaseCandidateFor(v1_0_0)
    @ClientJson("https://archive.org/download/Minecraft-JE-Beta/Prereleases/1.0.0-rc1/1.0.0-rc1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Beta/Prereleases/1.0.0-rc1/1.0.0-rc1.jar")
    @Type(Types.SNAPSHOT)
    RC1(22, "RC1"), // corresponding server unknown
    @PrereleaseFor(v1_0_0)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/b1.9-pre6.json")
    @ClientJar("https://assets.minecraft.net/1_9-pre6/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/1_9-pre6/minecraft_server.jar")
    @Name("Beta 1.9 Prerelease 6")
    @Type(Types.SNAPSHOT)
    BETA_1_9_PRE6(22, "b1.9-pre6"),
    @PrereleaseFor(v1_0_0)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/b1.9-pre5.json")
    @ClientJar("https://assets.minecraft.net/1_9-pre5/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/1_9-pre5/minecraft_server.jar")
    @Name("Beta 1.9 Prerelease 5")
    @Type(Types.SNAPSHOT)
    BETA_1_9_PRE5(21, "b1.9-pre5"),
    @PrereleaseFor(v1_0_0)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/b1.9-pre4.json")
    @ClientJar("https://assets.minecraft.net/1_9-pre4/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/1_9-pre4/minecraft_server.jar")
    @Name("Beta 1.9 Prerelease 4")
    @Type(Types.SNAPSHOT)
    BETA_1_9_PRE4(20, "b1.9-pre4"), // missing pre-reupload client
    @PrereleaseFor(v1_0_0)
    @ClientJson({"https://archive.org/download/Minecraft-JE-Beta/Prereleases/b1.9-pre3-1/b1.9-pre3-1.json", "https://archive.org/download/Minecraft-JSONs/b1.9-pre3.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Beta/Prereleases/b1.9-pre3-1/b1.9-pre3-1.jar", "https://assets.minecraft.net/1_9-pre3/minecraft.jar"})
    @ServerJar("https://assets.minecraft.net/1_9-pre3/minecraft_server.jar")
    @Name("Beta 1.9 Prerelease 3")
    @Type(Types.SNAPSHOT)
    BETA_1_9_PRE3(19, "b1.9-pre3"), // missing pre-reupload client
    @PrereleaseFor(v1_0_0)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/b1.9-pre2.json")
    @ClientJar("https://assets.minecraft.net/1_9-pre2/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/1_9-pre2/minecraft_server.jar")
    @Name("Beta 1.9 Prerelease 2")
    @Type(Types.SNAPSHOT)
    BETA_1_9_PRE2(19, "b1.9-pre2"),
    @PrereleaseFor(v1_0_0)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/b1.9-pre1.json")
    @ClientJar("https://assets.minecraft.net/1_9-pre/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/1_9-pre/minecraft_server.jar")
    @Name("Beta 1.9 Prerelease")
    @Type(Types.SNAPSHOT)
    BETA_1_9_PRE(18, "b1.9-pre"),

    // Beta
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2f6d2141c99bd626a069d8655135c4b13c45b981/b1.8.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6b562463ccc2c7ff12ff350a2b04a67b3adcd37b/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.8.1.jar")
    @Name("Beta 1.8.1")
    BETA_1_8_1(17, "b1.8.1"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/237811ba6f3418f3e64edb26246037625528ddf8/b1.8.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/3139e9c29b2c74f59ea04de760ac2af5bc21b410/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.8.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.8.exe")
    @Name("Beta 1.8")
    BETA_1_8(17, "b1.8"),
    @PrereleaseFor(BETA_1_8)
    @Name("Beta 1.8 (Preview)")
    @Type(Types.SNAPSHOT)
    BETA_1_8_PREVIEW(17, "b1.8 (preview)"), // missing
    @PrereleaseFor(BETA_1_8)
    @ClientJson("https://archive.org/download/Minecraft-JSONs/b1.8-pre2.json")
    @ClientJar("https://assets.minecraft.net/1_8-pre2/minecraft.jar")
    @ServerJar("https://assets.minecraft.net/1_8-pre2/minecraft_server.jar")
    @Name("Beta 1.8 Pre-release 2 ;)")
    @Type(Types.SNAPSHOT)
    BETA_1_8_PRE2(16, "b1.8-pre2"),
    @PrereleaseFor(BETA_1_8)
    @ClientJson({"https://archive.org/download/Minecraft-JSONs/b1.8-pre1-1.json", "https://archive.org/download/Minecraft-JSONs/b1.8-pre1-2.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Beta/Prereleases/b1.8-pre1-1/b1.8-pre1-1.jar", "https://assets.minecraft.net/1_8-pre/minecraft.jar"})
    @ServerJar("https://assets.minecraft.net/1_8-pre/minecraft_server.jar")
    @Name("Beta 1.8 Pre-release")
    @Type(Types.SNAPSHOT)
    BETA_1_8_PRE(15, "b1.8-pre"), // missing pre-reupload server
    @ClientJson("https://launchermeta.mojang.com/v1/packages/66cafaf8ea5a7b76547eb24c848832af44255ba1/b1.7.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/43db9b498cb67058d2e12d394e6507722e71bb45/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.7.3.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.7.3.exe")
    @Name("Beta 1.7.3")
    BETA_1_7_3(14, "b1.7.3"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/275d06ff3878db13a98150a7342e0f9d114a85e0/b1.7.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7dc50cc5e2ff204a7283f0c7d38cd0370b49875b/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.7.2.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.7.2.exe")
    @Name("Beta 1.7.2")
    BETA_1_7_2(14, "b1.7.2"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Beta/b1.7_01/b1.7_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Beta/b1.7_01/b1.7_01.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.7_01.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.7_01.exe")
    @Name("Beta 1.7_01")
    BETA_1_7_01(14, "b1.7_01"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/28db3739983fcdef4dee4cfd7ef8754ed890d491/b1.7.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ad7960853437bcab86bd72c4a1b95f6fe19f4258/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.7.jar")
    @Name("Beta 1.7")
    BETA_1_7(14, "b1.7"), // missing .exe file for server
    @PrereleaseFor(BETA_1_7)
    @Name("Beta 1.7 (Preview)")
    @Type(Types.SNAPSHOT)
    BETA_1_7_PREVIEW(14, "b1.7 (preview)"), // missing
    @ClientJson("https://launchermeta.mojang.com/v1/packages/2870d0b84a71ae38a9157a72a730d2075e80e02b/b1.6.6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f95fe05711d09553ca2a9089f981741c13d6b8c4/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.6.6.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.6.6.exe")
    @Name("Beta 1.6.6")
    BETA_1_6_6(13, "b1.6.6"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4053bd8447601f1d80f00d8c838bf14ebbe8ab51/b1.6.5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/90ed9854b43c4d031ed07381ea3ae3071a8bba6f/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.6.5.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.6.5.exe")
    @Name("Beta 1.6.5")
    BETA_1_6_5(13, "b1.6.5"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/74449d14511d02e5b754f241007fc3578059ac1b/b1.6.4.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b5d3bdb8a7b12d163651f4787ac6ca14689aab9e/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.6.4.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.6.4.exe")
    @Name("Beta 1.6.4")
    BETA_1_6_4(13, "b1.6.4"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/d51caee58632f1608887cc4ddbadf748387cd874/b1.6.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/924e36dbb7c64abb30a95fe35f5affb5176f6cbc/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.6.3.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.6.3.exe")
    @Name("Beta 1.6.3")
    BETA_1_6_3(13, "b1.6.3"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/873836b3204bca086ba8ce23c797a20a5d41afd0/b1.6.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e8aa50949b077b672be2e651ea3f7b1bbd9020e1/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.6.2.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.6.2.exe")
    @Name("Beta 1.6.2")
    BETA_1_6_2(13, "b1.6.2"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/47410d4b934f4ed9754d4b522f10cade63ff3d67/b1.6.1.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/63a66d6d145696296bdaaeaba0a42f738b87a362/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.6.1.jar")
    @Name("Beta 1.6.1")
    BETA_1_6_1(13, "b1.6.1"), // missing .exe file for server
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8a62339d69ede6781646dacff76ad09bc90cd918/b1.6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ecc0288d218fd7479027a17c150cbf283fa950a1/client.jar")
    @ServerJar({"https://betacraft.pl/server-archive/minecraft/b1.6-trailer.jar", "https://betacraft.pl/server-archive/minecraft/b1.6.jar"})
    @Name("Beta 1.6")
    BETA_1_6(13, "b1.6"), // missing .exe file for server
    @PrereleaseFor(BETA_1_6)
    @Name("Beta 1.6 (Preview)")
    @Type(Types.SNAPSHOT)
    BETA_1_6_PREVIEW(13, "b1.6 (preview)"), // missing
    @PrereleaseFor(BETA_1_6)
    @ClientJson("https://archive.org/download/Minecraft-JE-Beta/Prereleases/b1.6-tb3/b1.6-tb3.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Beta/Prereleases/b1.6-tb3/b1.6-tb3.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.6-test_build_3.jar")
    @Name("Beta 1.6 Test Build 3")
    @Type(Types.SNAPSHOT)
    BETA_1_6_TEST_BUILD_3(12, "b1.6-tb3"),
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.5_02.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.5_02.exe")
    @Name("Beta 1.5_02")
    BETA_1_5_02(11, "b1.5_02"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c4f1e66a96aeec6184f219394cedd4290f25a869/b1.5_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e2a692e5e8160c84b29c834ecbf398618db9749c/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.5_01.jar")
    @Name("Beta 1.5_01")
    BETA_1_5_01(11, "b1.5_01"), // missing .exe file for server
    @ClientJson("https://launchermeta.mojang.com/v1/packages/970c7f888d66a3a552c5a765892d4ebb90205206/b1.5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f5ce1699cd728213c21054fa2f1490d162b002b4/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.5.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.5.exe")
    @Name("Beta 1.5")
    BETA_1_5(11, "b1.5"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/793c5ef9f8d200508b136e9c328070426615f287/b1.4_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6f157f26955c35006c1afa8b0479e0ce785fb864/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.4_01.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.4_01.exe")
    @Name("Beta 1.4_01")
    BETA_1_4_01(10, "b1.4_01"),
    @ClientJson({"https://archive.org/download/Minecraft-JE-Beta/b1.4-1/b1.4-1.json", "https://launchermeta.mojang.com/v1/packages/5e4feaa9d732740383fcaa78226c1c00ade89031/b1.4.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Beta/b1.4-1/b1.4-1.jar", "https://launcher.mojang.com/v1/objects/f6dbca5223ea2a7e89806e93d0b18162b2d58c20/client.jar"})
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.4.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.4.exe")
    @Name("Beta 1.4")
    BETA_1_4(10, "b1.4"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/00aae99f814c6f010cc3c1500a490eab8feff739/b1.3_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/add3809d2c075e985d4b583632dac3d9c3872945/client.jar")
    @Name("Beta 1.3_01")
    BETA_1_3_01(9, "b1.3_01"), // missing server?
    @ClientJson({"https://archive.org/download/Minecraft-JE-Beta/b1.3-1/b1.3-1.json", "https://launchermeta.mojang.com/v1/packages/4bb25e224116e7e06e08f0edaea49320b5ecf591/b1.3b.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Beta/b1.3-1/b1.3-1.jar", "https://launcher.mojang.com/v1/objects/e19cfb3a2043f185c44237ef05eac80e8ad2d8e7/client.jar"})
    @SuppressWarnings("HttpUrlsUsage")
    @ServerJar({"https://web.archive.org/web/20200601064044/http://betacraft.pl/server-archive/minecraft/b1.3-1.jar", "https://web.archive.org/web/20200601064052/http://betacraft.pl/server-archive/minecraft/b1.3-2.jar"})
    @ServerExe("https://web.archive.org/web/20200318020055/https://betacraft.pl/server-archive/minecraft/b1.3-2.exe")
    @Name("Beta 1.3")
    BETA_1_3(9, "b1.3"), // missing reupload 1
    @ClientJson("https://launchermeta.mojang.com/v1/packages/9c72054ac75a87f30e285551afc09ffd712f5310/b1.2_02.json")
    @ClientJar({"https://archive.org/download/Minecraft-JE-Beta/b1.2_02/b1.2_02.jar", "https://launcher.mojang.com/v1/objects/093f371e1a05d89664cfb8068d607953687d5d94/client.jar"})
    @Name("Beta 1.2_02")
    BETA_1_2_02(8, "b1.2_02"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/50cee23732594092619661664c063e002ca11108/b1.2_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f71a5b58c9bd0e458878d78a34c9fb35e97d5222/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.2_01.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.2_01.exe")
    @Name("Beta 1.2_01")
    BETA_1_2_01(8, "b1.2_01"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/4778e577854ebcca605c803915b9d0711cb0d760/b1.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/ba05d7a97926c61c03cf956f7ae92f3bede9474e/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.2.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.2.exe")
    @Name("Beta 1.2")
    BETA_1_2(8, "b1.2"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/99e64986229cdb3f14ddfe131f807ae7850ceb10/b1.1_02.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e1c682219df45ebda589a557aadadd6ed093c86c/client.jar")
    @SuppressWarnings("HttpUrlsUsage") // false positive
    @ServerJar("https://web.archive.org/web/20101229164428/http://www.minecraft.net/download/minecraft_server.jar?v=1293558297827")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.1_02.exe")
    @Name("Beta 1.1_02")
    BETA_1_1_02(8, "b1.1_02"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/3fbfcb1886ecc2663d1f37b2d3a7dfd882e7428d/b1.1_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6d778940f48389a2741f03c9f17f3c57476fb208/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.1_01.jar")
    @Name("Beta 1.1_01")
    BETA_1_1_01(7, "b1.1_01"), // missing .exe file for server
    @ClientJson({"https://archive.org/download/Minecraft-JE-Beta/b1.1-1/b1.1-1.json", "https://archive.org/download/Minecraft-JE-Beta/b1.1-2/b1.1-2.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Beta/b1.1-1/b1.1-1.jar", "https://archive.org/download/Minecraft-JE-Beta/b1.1-2/b1.1-2.jar"})
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.1.jar")
    @Name("Beta 1.1")
    BETA_1_1(7, "b1.1"), // missing .exe file for server
    @ClientJson("https://launchermeta.mojang.com/v1/packages/68c712ad1fc203d5694d9955f711ddfad8c6224b/b1.0.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/76d35cb452e739bd4780e835d17faf0785d755f9/client.jar")
    @Name("Beta 1.0.2")
    BETA_1_0_2(7, "b1.0.2"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/a9b1317798938f5cefcb8f23701fd9eb364210f5/b1.0_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/4caf69885b64132e42d3ce49996dbdb1691d7111/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.0_01.jar")
    @Name("Beta 1.0_01")
    BETA_1_0_01(7, "b1.0_01"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/e96f34aaa1d24b976e9c0ca8a85086cf48bc16f2/b1.0.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/93faf3398ebf8008d59852dc3c2b22b909ca8a49/client.jar")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/b1.0.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/b1.0.exe")
    @Name("Beta 1.0")
    BETA_1_0(7, "b1.0"),

    // alpha versions (server)
    @CorrespondingVersion("ALPHA_1_2_6")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.8.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.8.exe")
    @Name("0.2.8")
    ALPHA_SERVER_0_2_8(6, "a0.2.8"),
    @CorrespondingVersion("ALPHA_1_2_5")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.7.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.7.exe")
    @Name("0.2.7")
    ALPHA_SERVER_0_2_7(6, "a0.2.7"),
    @CorrespondingVersion("ALPHA_1_2_4_01")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.6_02.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.6_02.exe")
    @Name("0.2.6_02")
    ALPHA_SERVER_0_2_6_02(6, "a0.2.6_02"),
    @CorrespondingVersion("ALPHA_1_2_3_05")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.6_01.jar")
    @Name("0.2.6_01")
    ALPHA_SERVER_0_2_6_01(6, "a0.2.6_01"), // missing .exe file
    @CorrespondingVersion("ALPHA_1_2_3_05")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.6.jar")
    @Name("0.2.6")
    ALPHA_SERVER_0_2_6(6, "a0.2.6"), // missing .exe file
    @CorrespondingVersion("ALPHA_1_2_3_02")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.5_02.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.5_02.exe")
    @Name("0.2.5_02")
    ALPHA_SERVER_0_2_5_02(5, "a0.2.5_02"),
    @CorrespondingVersion("ALPHA_1_2_3_02")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.5_01.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.5_01.exe")
    @Name("0.2.5_01")
    ALPHA_SERVER_0_2_5_01(5, "a0.2.5_01"),
    @CorrespondingVersion("ALPHA_1_2_3_01")
    @SuppressWarnings("HttpUrlsUsage") // false positive
    @ServerJar({"https://betacraft.pl/server-archive/minecraft/a0.2.5-1.jar", "https://web.archive.org/web/20101125091119/http://www.minecraft.net/download/minecraft_server.jar?v=1290567858573"})
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.5-2.exe")
    @Name("0.2.5")
    ALPHA_SERVER_0_2_5(5, "a0.2.5"), // missing pre-reupload .exe file
    @CorrespondingVersion("ALPHA_1_2_2")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.4.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.4.exe")
    @Name("0.2.4")
    ALPHA_SERVER_0_2_4(4, "a0.2.4"),
    @CorrespondingVersion("ALPHA_1_2_1_01")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.3.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.3.exe")
    @Name("0.2.3")
    ALPHA_SERVER_0_2_3(3, "a0.2.3"),
    @CorrespondingVersion("ALPHA_1_2_0_02")
    @ServerJar("https://web.archive.org/web/20101101174449/https://www.minecraft.net/download/minecraft_server.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.2_01.exe")
    @Name("0.2.2_01")
    ALPHA_SERVER_0_2_2_01(3, "a0.2.2_01"),
    @CorrespondingVersion("ALPHA_1_2_0")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.2.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.2.exe")
    @Name("0.2.2")
    ALPHA_SERVER_0_2_2(3, "a0.2.2"),
    @CorrespondingVersion("ALPHA_1_1_2_01")
    @SuppressWarnings("HttpUrlsUsage") // false positive
    @ServerJar("https://web.archive.org/web/20101009003034/http://www.minecraft.net/download/minecraft_server.jar?v=1286508187877")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.1.exe")
    @Name("0.2.1")
    ALPHA_SERVER_0_2_1(2, "a0.2.1"),
    @CorrespondingVersion("ALPHA_1_1_0")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.0_01.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.0_01.exe")
    @Name("0.2.0_01")
    ALPHA_SERVER_0_2_0_01(2, "a0.2.0_01"),
    @CorrespondingVersion("ALPHA_1_1_0")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.2.0.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.2.0.exe")
    @Name("0.2.0")
    ALPHA_SERVER_0_2_0(2, "a0.2.0"),
    @CorrespondingVersion("ALPHA_1_0_17_04")
    @SuppressWarnings("HttpUrlsUsage") // false positive
    @ServerJar("https://web.archive.org/web/20100831092001/http://www.minecraft.net/download/minecraft_server.jar?v=1283149033651")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.1.4.exe")
    @Name("0.1.4")
    ALPHA_SERVER_0_1_4(1, "a0.1.4"),
    @CorrespondingVersion("ALPHA_1_0_16_02")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.1.3.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.1.3.exe")
    @Name("0.1.3")
    ALPHA_SERVER_0_1_3(14, "a0.1.3"),
    @CorrespondingVersion("ALPHA_1_0_16_01")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.1.2_01.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.1.2_01.exe")
    @Name("0.1.2_01")
    ALPHA_SERVER_0_1_2_01(14, "a0.1.2_01"),
    @CorrespondingVersion("ALPHA_1_0_16_01")
    @Name("0.1.2")
    ALPHA_SERVER_0_1_2(14, "a0.1.2"), // missing
    @CorrespondingVersion("ALPHA_1_0_16")
    @Name("0.1.1")
    ALPHA_SERVER_0_1_1(14, "a0.1.1"), // missing
    @CorrespondingVersion("ALPHA_1_0_15")
    @ServerJar("https://betacraft.pl/server-archive/minecraft/a0.1.0.jar")
    @ServerExe("https://betacraft.pl/server-archive/minecraft/a0.1.0.exe")
    @Name("0.1.0")
    ALPHA_SERVER_0_1_0(13, "a0.1.0"),

    // alpha versions (client)
    @CorrespondingVersion("ALPHA_SERVER_0_2_8")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/b539c8b7baabb3ab8886fa634310de51aeea60fc/a1.2.6.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/a68c817afd6c05c253ba5462287c2c19bbb57935/client.jar")
    @Name("Alpha v1.2.6")
    ALPHA_1_2_6(6, "a1.2.6"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_7")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/332d9d9eabdf778e91952431c63d6583d7be7342/a1.2.5.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f48c7b6442ad8d01099ecee1c7c7332f1b1a80da/client.jar")
    @Name("Alpha v1.2.5")
    ALPHA_1_2_5(6, "a1.2.5"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_6_02")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/90ae8b6c468cf1ae6dcd81ec22060df16888d87e/a1.2.4_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7be6298b05d1b0832ab45467a87a425640bc6bf0/client.jar")
    @Name("Alpha v1.2.4_01")
    ALPHA_1_2_4_01(6, "a1.2.4_01"),
    // "When Notch released 1.2.4, he accidentally labeled it as 1.2.3_05 in game." - https://minecraft.fandom.com/wiki/Java_Edition_Alpha_v1.2.3_05#Trivia
    @CorrespondingVersion("ALPHA_SERVER_0_2_6_01")
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.2.3_05/a1.2.3_05.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.2.3_05/a1.2.3_05.jar")
    @Name("Alpha v1.2.3_05")
    ALPHA_1_2_3_05(6, "a1.2.3_05"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_5_02")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/561cd2611ab1d4463d86af181c07e43d364959c4/a1.2.3_04.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/7f60cb9d0d40af20001d15287b78aa26a217a910/client.jar")
    @Name("Alpha v1.2.3_04")
    ALPHA_1_2_3_04(5, "a1.2.3_04"),
    // "a1.2.3_03 has no credible evidence that it exists." - https://minecraft.fandom.com/wiki/Java_Edition_Alpha_v1.2.3_04
    @CorrespondingVersion("ALPHA_SERVER_0_2_5_02")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/58e7f651a1916dc088be1aa720fba45d0d3fce53/a1.2.3_02.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/dc61158e1df763f87483abb6ab540dc1c42e63c4/client.jar")
    @Name("Alpha v1.2.3_02")
    ALPHA_1_2_3_02(5, "a1.2.3_02"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_5_02")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/0a7c36551006ff6aadfbe7239ae0128d3a4d575e/a1.2.3_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/1d46e65022f3a7cf4b8ad30ee5a8d52b3b2b9486/client.jar")
    @Name("Alpha v1.2.3_01")
    ALPHA_1_2_3_01(5, "a1.2.3_01"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_5_02")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ccbea3f4157f75fdfcffd8573cc6e00e9b7229f5/a1.2.3.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f4be258122cb62208b350cd2068685ad859bb447/client.jar")
    @Name("Alpha v1.2.3")
    ALPHA_1_2_3(5, "a1.2.3"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_4")
    @ClientJson({"https://launchermeta.mojang.com/v1/packages/19c2157b33a61e0d327f5c7ca3571650233a1750/a1.2.2a.json", "https://launchermeta.mojang.com/v1/packages/99313782ccb819b69c87d94fe56bf9c2775eeff7/a1.2.2b.json"})
    @ClientJar({"https://launcher.mojang.com/v1/objects/7d9d85eaca9627d3a40e6d122182f2d22d39dbf9/client.jar", "https://launcher.mojang.com/v1/objects/1c28c8431392641045b59e98a81877d7c94ff0ca/client.jar"})
    @Name("Alpha v1.2.2")
    ALPHA_1_2_2(4, "a1.2.2"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_3")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/dbe66f4427a61218f3fe4c92feec8f684cbf9f4a/a1.2.1_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/e4226f9ba622634e3101681bc641eec7ee9e72fd/client.jar")
    @Name("Alpha v1.2.1_01")
    ALPHA_1_2_1_01(3, "a1.2.1_01"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_3")
    @Name("Alpha v1.2.1")
    ALPHA_1_2_1(3, "a1.2.1"), // missing
    @CorrespondingVersion("ALPHA_SERVER_0_2_2_01")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/ca94dd898097c752e39c8dde617ebe6f2e3c9def/a1.2.0_02.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b99da0a683e6dc1ade4df1bf159e021ad07d4fca/client.jar")
    @Name("Alpha v1.2.0_02")
    ALPHA_1_2_0_02(3, "a1.2.0_02"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_2_01")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/58c796ad40add21b4eda8b88bbadf6eeeb92bd22/a1.2.0_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/332bfe7bf26f6a5cc93ee85e6759ce33784409d0/client.jar")
    @Name("Alpha v1.2.0_01")
    ALPHA_1_2_0_01(3, "a1.2.0_01"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_2")
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.2.0/a1.2.0.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.2.0/a1.2.0.jar")
    @Name("Alpha v1.2.0")
    ALPHA_1_2_0(3, "a1.2.0"),
    @PrereleaseFor(ALPHA_1_2_0)
    @Name("Alpha v1.2.0 (Preview)")
    @Type(Types.SNAPSHOT)
    ALPHA_1_2_0_PREVIEW(3, "a1.2.0 (Preview)"), // missing; unreleased; corresponding server unknown
    @CorrespondingVersion("ALPHA_SERVER_0_2_1")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/cd8b97e8d3bab2a32675edfea566bd51c4f29ec1/a1.1.2_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/daa4b9f192d2c260837d3b98c39432324da28e86/client.jar")
    @Name("Alpha v1.2.2_01")
    ALPHA_1_1_2_01(2, "a1.1.2_01"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_1")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/c1d9c991421de18ad411ddc2921ce45b25af8dcd/a1.1.2.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/f9b4b66f9c18bf4800d80f1c8865a837f92c6105/client.jar")
    @Name("Alpha v1.1.2")
    ALPHA_1_1_2(2, "a1.1.2"),
    @CorrespondingVersion("ALPHA_SERVER_0_2_1")
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.1.1/a1.1.1%20%28Moresteck%27s%20grey%20screen%20fix%29.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.1.1/a1.1.1.jar")
    @Name("Alpha v1.1.1")
    ALPHA_1_1_1(2, "a1.1.1"), // https://kotaku.com/minecraft-alpha-1-1-1-an-extremely-rare-version-was-f-1847179654
    @CorrespondingVersion("ALPHA_SERVER_0_2_0_01")
    @ClientJson({"https://archive.org/download/Minecraft-JE-Alpha/a1.1.0-1/a1.1.0-1.json", "https://archive.org/download/Minecraft-JE-Alpha/a1.1.0-2/a1.1.0-2.json", "https://launchermeta.mojang.com/v1/packages/513b9734343b9c26c375b9f2a0eb79808e4040dd/a1.1.0.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Alpha/a1.1.0-1/a1.1.0-1.jar", "https://archive.org/download/Minecraft-JE-Alpha/a1.1.0-2/a1.1.0-2.jar", "https://launcher.mojang.com/v1/objects/d58d1db929994ff383bdbe6fed31887e04b965c3/client.jar"})
    @Name("Alpha v1.1.0")
    ALPHA_1_1_0(2, "a1.1.0"),
    @CorrespondingVersion("ALPHA_SERVER_0_1_4")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8662234a983f57aa29f3c518433a2a608642dd12/a1.0.17_04.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/61cb4c717981f34bf90e8502d2eb8cf2aa6db0cd/client.jar")
    @Name("Alpha v1.0.17_04")
    ALPHA_1_0_17_04(1, "a1.0.17_04"),
    @CorrespondingVersion("ALPHA_SERVER_0_1_4")
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.17_03/a1.0.17_03.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.17_03/a1.0.17_03.jar")
    @Name("Alpha v1.0.17_03")
    ALPHA_1_0_17_03(1, "a1.0.17_03"),
    @CorrespondingVersion("ALPHA_SERVER_0_1_4")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/eec2fb8ca9641381c3db4497d33c5dcd315357ff/a1.0.17_02.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/39f20ee472a40322e034643a8d1668836f5052bd/client.jar")
    @Name("Alpha v1.0.17_02")
    ALPHA_1_0_17_02(1, "a1.0.17_02"),
    @CorrespondingVersion("ALPHA_SERVER_0_1_4")
    @Name("Alpha v1.0.17_01")
    ALPHA_1_0_17_01(-1, "a1.0.17_01"), // missing; unknown protocol version
    @CorrespondingVersion("ALPHA_SERVER_0_1_4")
    @Name("Alpha v1.0.17")
    ALPHA_1_0_17(-1, "a1.0.17"), // missing; unknown protocol version
    @CorrespondingVersion("ALPHA_SERVER_0_1_3")
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.16_02/a1.0.16_02.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.16_02/a1.0.16_02.jar")
    @Name("Alpha v1.0.16_02")
    ALPHA_1_0_16_02(14, "a1.0.16_02"),
    @CorrespondingVersion("ALPHA_SERVER_0_1_2_01")
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.16_01/a1.0.16_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.16_01/a1.0.16_01.jar")
    @Name("Alpha v1.0.16_01")
    ALPHA_1_0_16_01(14, "a1.0.16_01"),
    @CorrespondingVersion("ALPHA_SERVER_0_1_1")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/edfc04847f7f7cecb62b19b63c515ee0ad62ff0b/a1.0.16.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/98ce80c7630ccb3bb38687ff98bfd18935d49a57/client.jar")
    @Name("Alpha v1.0.16")
    ALPHA_1_0_16(14, "a1.0.16"),
    @CorrespondingVersion("ALPHA_SERVER_0_1_0")
    @ClientJson("https://launchermeta.mojang.com/v1/packages/79c282e2f3e0d1149d0d332d26a1b6a5feed8e68/a1.0.15.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/03edaff812bedd4157a90877e779d7b7ecf78e97/client.jar")
    @Name("Alpha v1.0.15")
    ALPHA_1_0_15(13, "a1.0.15"),
    @ClientJson({"https://archive.org/download/Minecraft-JE-Alpha/a1.0.14-1/a1.0.14-1.json", "https://archive.org/download/Minecraft-JE-Alpha/a1.0.14-2/a1.0.14-2.json", "https://launchermeta.mojang.com/v1/packages/309d8288ed9fb822563d48cda30f7e57025f0299/a1.0.14.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Alpha/a1.0.14-1/a1.0.14-1.jar", "https://archive.org/download/Minecraft-JE-Alpha/a1.0.14-2/a1.0.14-2.jar", "https://launcher.mojang.com/v1/objects/9b4b90d8def2a680b7c9eca40dd03e2266c8977a/client.jar"})
    @Name("Alpha v1.0.14")
    ALPHA_1_0_14(12, "a1.0.14"),
    @ClientJson({"https://archive.org/download/Minecraft-JE-Alpha/a1.0.13_01-1/a1.0.13_01-1.json", "https://archive.org/download/Minecraft-JE-Alpha/a1.0.13_01-2/a1.0.13_01-2.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Alpha/a1.0.13_01-1/a1.0.13_01-1.jar", "https://archive.org/download/Minecraft-JE-Alpha/a1.0.13_01-2/a1.0.13_01-2.jar"})
    @Name("Alpha v1.0.13_01")
    ALPHA_1_0_13_01(12, "a1.0.13_01"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.13/a1.0.13.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.13/a1.0.13.jar")
    @Name("Alpha v1.0.13")
    ALPHA_1_0_13(12, "a1.0.13"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.12/a1.0.12.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.12/a1.0.12.jar")
    @Name("Alpha v1.0.12")
    ALPHA_1_0_12(11, "a1.0.12"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/1a472c2eaa0bae82c536b7071dda9082312ec10e/a1.0.11.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/d7ceb02909d0e1031a99ff4d8053d3f4abfbb2da/client.jar")
    @Name("Alpha v1.0.11")
    ALPHA_1_0_11(10, "a1.0.11"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.10/a1.0.10.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.10/a1.0.10.jar")
    @Name("Alpha v1.0.10")
    ALPHA_1_0_10(10, "a1.0.10"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.9/a1.0.9.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.9/a1.0.9.jar")
    @Name("Alpha v1.0.9")
    ALPHA_1_0_9(10, "a1.0.9"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.8_01/a1.0.8_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.8_01/a1.0.8_01.jar")
    @Name("Alpha v1.0.8_01")
    ALPHA_1_0_8_01(10, "a1.0.8_01"),
    @Name("Alpha v1.0.8")
    ALPHA_1_0_8(10, "a1.0.8"), // missing
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.7/a1.0.7.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.7/a1.0.7.jar")
    @Name("Alpha v1.0.7")
    ALPHA_1_0_7(10, "a1.0.7"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.6_03/a1.0.6_03.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.6_03/a1.0.6_03.jar")
    @Name("Alpha v1.0.6_03")
    ALPHA_1_0_6_03(10, "a1.0.6_03"),
    @Name("Alpha v1.0.6_02")
    ALPHA_1_0_6_02(10, "a1.0.6_02"), // missing; changelog unknown
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.6_01/a1.0.6_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.6_01/a1.0.6_01.jar")
    @Name("Alpha v1.0.6_01")
    ALPHA_1_0_6_01(10, "a1.0.6_01"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.6/a1.0.6.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.6/a1.0.6.jar")
    @Name("Alpha v1.0.6")
    ALPHA_1_0_6(10, "a1.0.6"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/6b010534bd297043ecf210a9d4c445f35b4a8160/a1.0.5_01.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/73f569bf5556580979606049204835ae1a54f04d/client.jar")
    @Name("Alpha v1.0.5_01")
    ALPHA_1_0_5_01(10, "a1.0.5_01"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.5/a1.0.5.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.5/a1.0.5.jar")
    @Name("Alpha v1.0.5")
    ALPHA_1_0_5(10, "a1.0.5"), // missing pre-reupload
    @ClientJson({"https://archive.org/download/Minecraft-JE-Alpha/a1.0.4/a1.0.4.json", "https://launchermeta.mojang.com/v1/packages/f9c108b4f4167dacbb1af000b9c94e132e7b9d50/a1.0.4.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Alpha/a1.0.4/a1.0.4.jar", "https://launcher.mojang.com/v1/objects/e5838277b3bb193e58408713f1fc6e005c5f3c0c/client.jar"})
    @Name("Alpha v1.0.4")
    ALPHA_1_0_4("a1.0.4"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.3/a1.0.3.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.3/a1.0.3.jar")
    @Name("Alpha v1.0.3")
    ALPHA_1_0_3("a1.0.3"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.2_02/a1.0.2_02.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.2_02/a1.0.2_02.jar")
    @Name("Alpha v1.0.2_02")
    ALPHA_1_0_2_02("a1.0.2_02"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.2_01/a1.0.2_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.2_01/a1.0.2_01.jar")
    @Name("ALpha v1.0.2_01")
    ALPHA_1_0_2_01("a1.0.2_01"),
    @Name("Alpha v1.0.2")
    ALPHA_1_0_2("a1.0.2"), // missing; changelog unknown
    @ClientJson("https://archive.org/download/Minecraft-JE-Alpha/a1.0.1_01/a1.0.1_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Alpha/a1.0.1_01/a1.0.1_01.jar")
    @Name("Alpha v1.0.1_01")
    ALPHA_1_0_1_01("a1.0.1_01"),
    @Name("Alpha v1.0.1")
    ALPHA_1_0_1("a1.0.1"), // missing
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100630-2/inf-20100630-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100630-2/inf-20100630-2.jar")
    @Name("Alpha v1.0.0")
    ALPHA_1_0_0("a1.0.0"),

    // Infdev (They just says "Infdev" in-game)
    @AlVersion(1.138)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100630-1/inf-20100630-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100630-1/inf-20100630-1.jar")
    @Name("Infdev 20100630")
    INFDEV_20100630("inf-20100630"),
    @AlVersion(1.137)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100629/inf-20100629.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100629/inf-20100629.jar")
    @Name("Infdev 20100629")
    INFDEV_20100629("inf-20100629"),
    @AlVersion(1.136)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100627/inf-20100627.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100627/inf-20100627.jar")
    @Name("Infdev 20100627")
    INFDEV_20100627("inf-20100627"),
    @AlVersion(1.135)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100625-2/inf-20100625-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100625-2/inf-20100625-2.jar")
    @Name("Infdev 20100625-2")
    INFDEV_20100625_2("inf-20100625-2"),
    @AlVersion(1.134)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100625-1/inf-20100625-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100625-1/inf-20100625-1.jar")
    @Name("Infdev 20100625-1")
    INFDEV_20100625_1("inf-20100625-1"),
    @AlVersion(1.133)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100624/inf-20100624.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100624/inf-20100624.jar")
    @Name("Infdev 20100624")
    INFDEV_20100624("inf-20100624"),
    @AlVersion(1.132)
    @ClientJson("https://launchermeta.mojang.com/v1/packages/17456a662179425cc46c71189c27f81bc14aaf07/inf-20100618.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/89eab2c1a353707cc00f074dffba9cb7a4f5e304/client.jar")
    @Name("Infdev 20100618")
    INFDEV_20100618("inf-20100618"),
    @AlVersion(1.131)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100617-3/inf-20100617-3.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100617-3/inf-20100617-3.jar")
    @Name("Infdev 20100617-2")
    INFDEV_20100617_2("inf-20100617-2"),
    @AlVersion(1.13)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100617-2/inf-20100617-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100617-2/inf-20100617-2.jar")
    @Name("Infdev 20100617-1")
    INFDEV_20100617_1("inf-20100617-1"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100616/inf-20100616.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100616/inf-20100616.jar")
    @Name("Infdev 20100616")
    INFDEV_20100616("inf-20100616"), // unknown al_version
    @AlVersion(1.129)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100615/inf-20100615.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100615/inf-20100615.jar")
    @Name("Infdev 20100615")
    INFDEV_20100615("inf-20100615"),
    @AlVersion(1.128)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100611/inf-20100611.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100611/inf-20100611.jar")
    @Name("Infdev 20100611")
    INFDEV_20100611("inf-20100611"),
    @AlVersion(1.127)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100608/inf-20100608.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100608/inf-20100608.jar")
    @Name("Infdev 20100608")
    INFDEV_20100608("inf-20100608"),
    @AlVersion(1.126)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100607/inf-20100607.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100607/inf-20100607.jar")
    @Name("Infdev 20100607")
    INFDEV_20100607("inf-20100607"),
    @AlVersion(1.125)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100420/inf-20100420.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100420/inf-20100420.jar")
    @Name("Infdev 20100420")
    INFDEV_20100420("inf-20100420"),
    @AlVersion(1.124)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100415/inf-20100415.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100415/inf-20100415.jar")
    @Name("Infdev 20100415")
    INFDEV_20100415("inf-20100415"),
    @AlVersion(1.123)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100414/inf-20100414.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100414/inf-20100414.jar")
    @Name("Infdev 20100414")
    INFDEV_20100414("inf-20100414"),
    @AlVersion(1.122)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100413/inf-20100413.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100413/inf-20100413.jar")
    @Name("Infdev 20100413")
    INFDEV_20100413("inf-20100413"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100330/inf-20100330.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100330/inf-20100330.jar")
    @Name("Infdev 20100330")
    INFDEV_20100330("inf-20100330"), // unknown al_version; missing unedited copy; may be split into -1 and -2
    @AlVersion(1.118)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100327/inf-20100327.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100327/inf-20100327.jar")
    @Name("Infdev 20100327")
    INFDEV_20100327("inf-20100327"),
    @AlVersion(1.116)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100325/inf-20100325.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100325/inf-20100325.jar")
    @Name("Infdev 20100325")
    INFDEV_20100325("inf-20100325"), // may be split into -1 and -2
    @AlVersion(1.114)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100321/inf-20100321.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100321/inf-20100321.jar")
    @Name("Infdev 20100321")
    INFDEV_20100321("inf-20100321"),
    @AlVersion(1.112)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100320/inf-20100320.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100320/inf-20100320.jar")
    @Name("Infdev 20100320")
    INFDEV_20100320("inf-20100320"),
    @AlVersion(1.111)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100316/inf-20100316.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100316/inf-20100316.jar")
    @Name("Infdev 20100316")
    INFDEV_20100316("inf-20100316"),
    @AlVersion(1.109)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100313/inf-20100313.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100313/inf-20100313.jar")
    @Name("Infdev 20100313")
    INFDEV_20100313("inf-20100313"),
    @AlVersion(1.108)
    @ClientJson("https://archive.org/download/Minecraft-JE-Infdev/inf-20100227/inf-20100227.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Infdev/inf-20100227/inf-20100227.jar")
    @Name("Infdev 20100227-2")
    INFDEV_20100227_2("inf-20100227-2"),
    @Name("Infdev 20100227-1")
    INFDEV_20100227_1("inf-20100227-1"), // missing; unknown al_version

    // Indev
    @AlVersion(1.107)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100223/in-20100223.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100223/in-20100223.jar")
    @Name("Indev 20100223")
    INDEV_20100223("in-20100223"),
    @AlVersion(1.106)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100219/in-20100219.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100219/in-20100219.jar")
    @Name("Indev 20100219")
    INDEV_20100219("in-20100219"),
    @AlVersion(1.105)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100218/in-20100218.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100218/in-20100218.jar")
    @Name("Indev 20100218")
    INDEV_20100218("in-20100218"),
    @AlVersion(1.103)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100214-2/in-20100214-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100214-2/in-20100214-2.jar")
    @Name("Indev 20100214")
    INDEV_20100214("in-20100214"),
    @AlVersion(1.102)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100214-1/in-20100214-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100214-1/in-20100214-1.jar")
    @Name("Indev 20100213")
    INDEV_20100213("in-20100213"),
    @AlVersion({1.100, 1.101})
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100212-2/in-20100212-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100212-2/in-20100212-2.jar")
    @Name("Indev 20100212-2")
    INDEV_20100212_2("in-20100212-2"),
    @AlVersion(1.099)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100212-1/in-20100212-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100212-1/in-20100212-1.jar")
    @Name("Indev 20100212-1")
    INDEV_20100212_1("in-20100212-1"),
    @Name("Indev 20100211")
    INDEV_20100211("in-20100211"), // missing; unknown al_version
    @AlVersion(1.086)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100207-2/in-20100207-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100207-2/in-20100207-2.jar")
    @Name("Indev 20100207_2")
    INDEV_20100207_2("in-20100207_2"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100207-1/in-20100207-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100207-1/in-20100207-1.jar")
    @Name("Indev 20100207_1")
    INDEV_20100207_1("in-20100207_1"), // unknown al_version
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100206-2103/in-20100206-2103.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100206-2103/in-20100206-2103.jar")
    @Name("Indev 20100206")
    INDEV_20100206("in-20100206"), // missing pre-reupload; unknown al_version
    @Name("Indev 20100205")
    INDEV_20100205("in-20100205"), // missing; unknown al_version
    @Name("Indev 20100204-2")
    INDEV_20100204_2("in-20100204-2"), // missing; unknown al_version
    @Name("Indev 20100204-1")
    INDEV_20100204_1("in-20100204-1"), // missing; unknown al_version
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100203/in-20100203.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100203/in-20100203.jar")
    @Name("Indev 20100202")
    INDEV_20100202("in-20100202"), // unknown al_version
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100201-3/in-20100201-3.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100201-3/in-20100201-3.jar")
    @Name("Indev 20100201-2")
    INDEV_20100201_2("in-20100201-2"), // unknown al_version
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100201-2/in-20100201-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100201-2/in-20100201-2.jar")
    @Name("Indev 20100201-1")
    INDEV_20100201_1("in-20100201-1"), // unknown al_version
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100201-1/in-20100201-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100201-1/in-20100201-1.jar")
    @Name("Indev 20100131")
    INDEV_20100131("in-20100131"), // unknown al_version
    @AlVersion(1.059)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100130/in-20100130.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100130/in-20100130.jar")
    @Name("Indev 20100130")
    INDEV_20100130("in-20100130"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100129/in-20100129.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100129/in-20100129.jar")
    @Name("Indev 20100129")
    INDEV_20100129("in-20100129"), // unknown al_version
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100128-2304/in-20100128-2304.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100128-2304/in-20100128-2304.jar")
    @Name("Indev 20100128")
    INDEV_20100128("in-20100128"), // unknown al_version
    @AlVersion(1.047)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100125-2/in-20100125-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100125-2/in-20100125-2.jar")
    @Name("Indev 20100125")
    INDEV_20100125("in-20100125"),
    @AlVersion(1.046)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100125-1/in-20100125-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100125-1/in-20100125-1.jar")
    @Name("Indev 20100124-2")
    INDEV_20100124_2("in-20100124-2"),
    @Name("Indev 20100124-1")
    INDEV_20100124_1("in-20100124-1"), // missing; unknown al_version
    @Name("Indev 20100122")
    INDEV_20100122("in-20100122"), // missing; unknown al_version
    @Name("Indev 20100114")
    INDEV_20100114("in-20100114"), // missing; unknown al_version
    @Name("Indev 20100113")
    INDEV_20100113("in-20100113"), // missing; unknown al_version
    @Name("Indev 20100111")
    INDEV_20100111("in-20100111"), // missing; unknown al_version
    @AlVersion(1.033)
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100111-1/in-20100111-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100111-1/in-20100111-1.jar")
    @Name("Indev 20100110")
    INDEV_20100110("in-20100110"),
    @Name("Indev 20100109")
    INDEV_20100109("in-20100109"), // missing; unknown al_version
    @Name("Indev 20100107")
    INDEV_20100107("in-20100107"), // missing; unknown al_version
    @Name("Indev 20100106")
    INDEV_20100106("in-20100106"), // missing; unknown al_version
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20100105/in-20100105.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20100105/in-20100105.jar")
    @Name("Indev 20100104")
    INDEV_20100104("in-20100104"),
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20091231-2/in-20091231-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20091231-2/in-20091231-2.jar")
    @Name("Indev 20091231-2")
    INDEV_20091231_2("in-20091231-2"), // unknown al_version
    @Name("Indev 20091231-1")
    INDEV_20091231_1("in-20091231-1"), // missing; unknown al_version
    @ClientJson("https://archive.org/download/Minecraft-JE-Indev/in-20091223-2/in-20091223-2.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Indev/in-20091223-2/in-20091223-2.jar")
    @Name("Indev 20091223-2")
    INDEV_20091223_2("in-20091223-2"), // missing pre-reupload; unknown al_version
    @Name("Indev 20091223-1")
    INDEV_20091223_1("in-20091223-1"), // missing; unknown al_version

    // Private indev versions (missing; unknown al_version)
    @Name("Indev 20091222")
    INDEV_20091222("in-20091222"),
    @Name("Indev 20091219-4")
    INDEV_20091219_4("in-20091219-4"),
    @Name("Indev 20091219-3")
    INDEV_20091219_3("in-20091219-3"),
    @Name("Indev 20091219-2")
    INDEV_20091219_2("in-20091219-2"),
    @Name("Indev 20091219-1")
    INDEV_20091219_1("in-20091219-1"),
    @Name("Indev 20091208")
    INDEV_20091208("in-20091208"),

    // Classic versions (server)
    @CorrespondingVersion("CLASSIC_0_30")
    @SuppressWarnings("HttpUrlsUsage") // false positive
    @ServerZip("https://web.archive.org/web/20100611210644/http://minecraft.net/minecraft-server.zip")
    @Name("c1.10.1")
    CLASSIC_SERVER_1_10_1(7, "c1.10.1"),
    @CorrespondingVersion("CLASSIC_0_30")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.10.zip")
    @Name("c1.10")
    CLASSIC_SERVER_1_10(7, "c1.10"),
    @CorrespondingVersion("CLASSIC_0_29_02")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.9.1.zip")
    @Name("c1.9.1")
    CLASSIC_SERVER_1_9_1(7, "c1.9.1"),
    @CorrespondingVersion("CLASSIC_0_28_01")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.8.3.zip")
    @Name("c1.8.3")
    CLASSIC_SERVER_1_9(7, "c1.9"),
    @CorrespondingVersion("CLASSIC_0_0_23a_01")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.8.2.zip")
    @Name("c1.8.2")
    CLASSIC_SERVER_1_8_2(6, "c1.8.2"),
    @CorrespondingVersion("CLASSIC_0_0_20a")
    @Name("c1.8.1")
    CLASSIC_SERVER_1_8_1(6, "c1.8.1"), // missing
    @CorrespondingVersion("CLASSIC_0_0_20a")
    @Name("c1.8")
    CLASSIC_SERVER_1_8(6, "c1.8"), // missing
    @CorrespondingVersion("CLASSIC_0_0_19a_06")
    @Name("c1.7")
    CLASSIC_SERVER_1_7(5, "c1.7"), // missing
    @CorrespondingVersion("CLASSIC_0_0_19a_05")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.6.zip")
    @Name("c1.6")
    CLASSIC_SERVER_1_6(5, "c1.6"),
    @CorrespondingVersion("CLASSIC_0_0_19a_03")
    @Name("c1.5")
    CLASSIC_SERVER_1_5(5, "c1.5"), // missing
    @CorrespondingVersion("CLASSIC_0_0_18a_02")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.4.1.zip")
    @Name("c1.4.1")
    CLASSIC_SERVER_1_4_1(4, "c1.4.1"),
    @CorrespondingVersion("CLASSIC_0_0_18a_01")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.4-1.zip")
    @Name("c1.4")
    CLASSIC_SERVER_1_4(4, "c1.4"), // missing reupload
    @CorrespondingVersion("CLASSIC_0_0_17a")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.3.zip")
    @Name("c1.3")
    CLASSIC_SERVER_1_3(4, "c1.3"),
    @CorrespondingVersion("CLASSIC_0_0_16a_02")
    @ServerZip("https://betacraft.pl/server-archive/minecraft/c1.2.zip")
    @Name("c1.2")
    CLASSIC_SERVER_1_2(3, "c1.2"),
    @CorrespondingVersion("CLASSIC_0_0_16a_01")
    @Name("c1.1")
    CLASSIC_SERVER_1_1(-1, "c1.1"), // missing; unknown protocol version
    @CorrespondingVersion("CLASSIC_0_0_16a")
    @Name("c1.0")
    CLASSIC_SERVER_1_0(-1, "c1.0"), // missing; unknown protocol version

    // Classic versions (client)
    @AlVersion(7.21)
    @CorrespondingVersion("CLASSIC_SERVER_1_10_1")
    @ClientJson({"https://archive.org/download/Minecraft-JE-Classic/c0.30-2/c0.30-2.json", "https://launchermeta.mojang.com/v1/packages/397c549a479b202ff899345465ecab885635cf85/c0.30_01c.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Classic/c0.30-2/c0.30-2.jar", "https://launcher.mojang.com/v1/objects/54622801f5ef1bcc1549a842c5b04cb5d5583005/client.jar"})
    @Name("c0.30c")
    CLASSIC_0_30_CREATIVE(7, "c0.30c"),
    @AlVersion(6.8)
    @CorrespondingVersion("CLASSIC_SERVER_1_10_1")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.30-1/c0.30-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.30-1/c0.30-1.jar")
    @Name("c0.30")
    CLASSIC_0_30(7, "c0.30"),
    @AlVersion(7.15)
    @CorrespondingVersion("CLASSIC_SERVER_1_9_1")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.29_02/c0.29_02.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.29_02/c0.29_02.jar")
    @Name("c0.29_02")
    CLASSIC_0_29_02(7, "c0.29_02"),
    @AlVersion(7.14)
    @CorrespondingVersion("CLASSIC_SERVER_1_9_1")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.29_01/c0.29_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.29_01/c0.29_01.jar")
    @Name("c0.29_01")
    CLASSIC_0_29_01(7, "c0.29_01"),
    @AlVersion(7.13)
    @CorrespondingVersion("CLASSIC_SERVER_1_9_1")
    @Name("c0.29")
    CLASSIC_0_29(7, "c0.29"), // missing
    @AlVersion(7.12)
    @CorrespondingVersion("CLASSIC_SERVER_1_9")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.28_01/c0.28_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.28_01/c0.28_01.jar")
    @Name("c0.28_01")
    CLASSIC_0_28_01(7, "c0.28_01"),
    @CorrespondingVersion("CLASSIC_SERVER_1_9")
    @Name("c0.28")
    CLASSIC_0_28(-1, "c0.28"), // missing; unknown al_version; unknown protocol version
    @AlVersion(6.56)
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.27_st/c0.27_st.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.27_st/c0.27_st.jar")
    @Name("c0.27 SURVIVAL TEST")
    CLASSIC_0_27(6, "c0.27_st"),
    @Name("c0.26 SURVIVAL TEST")
    CLASSIC_0_26(6, "c0.26_st"), // missing; unknown al_version
    @AlVersion(6.52)
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.25_05_st/c0.25_05_st.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.25_05_st/c0.25_05_st.jar")
    @Name("c0.25_05 SURVIVAL TEST")
    CLASSIC_0_25_05(6, "c0.25_05_st"),
    // "0.25_04 SURVIVAL TEST does not exist" - https://minecraft.fandom.com/wiki/Java_Edition_Classic_0.25_05_SURVIVAL_TEST#Trivia
    @Name("c0.25_03 SURVIVAL TEST")
    CLASSIC_0_25_03(6, "c0.25_03_st"), // missing; unknown al_version
    @Name("c0.25_02 SURVIVAL TEST")
    CLASSIC_0_25_02(6, "c0.25_02_st"), // missing; unknown al_version
    @Name("c0.25_01 SURVIVAL TEST")
    CLASSIC_0_25_01(6, "c0.25_01_st"), // missing; unknown al_version
    @Name("c0.25 SURVIVAL TEST")
    CLASSIC_0_25(6, "c0.25_st"), // missing; unknown al_version
    @AlVersion(6.47)
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.24_st_03/c0.24_st_03.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.24_st_03/c0.24_st_03.jar")
    @Name("c0.24_SURVIVAL_TEST_03")
    CLASSIC_0_24_SURVIVAL_TEST_03(6, "c0.24_st_03"),
    @Name("c0.24_SURVIVAL_TEST_02")
    CLASSIC_0_24_SURVIVAL_TEST_02(6, "c0.24_st_02"), // missing; unknown al_version
    @Name("c0.24_SURVIVAL_TEST_01")
    CLASSIC_0_24_SURVIVAL_TEST_01(6, "c0.24_st_01"), // missing; unknown al_version
    @Name("c0.24_SURVIVAL_TEST")
    CLASSIC_0_24_SURVIVAL_TEST(6, "c0.24_st"), // missing; unknown al_version
    @AlVersion({6.38, 6.5})
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.23a_01/c0.0.23a_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.23a_01/c0.0.23a_01.jar")
    @Name("c0.0.23a_01")
    CLASSIC_0_0_23a_01(6, "c0.0.23a_01"),
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @Name("c0.0.23a")
    CLASSIC_0_0_23a(6, "c0.0.23a"), // missing; unknown al_version
    @AlVersion(6.36)
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.22a_05/c0.0.22a_05.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.22a_05/c0.0.22a_05.jar")
    @Name("c0.0.22a_05")
    CLASSIC_0_0_22a_05(6, "c0.0.22a_05"),
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @Name("c0.0.22a_04")
    CLASSIC_0_0_22a_04(6, "c0.0.22a_04"), // missing; unknown al_version
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @Name("c0.0.22a_03")
    CLASSIC_0_0_22a_03(6, "c0.0.22a_03"), // missing; unknown al_version
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @Name("c0.0.22a_02")
    CLASSIC_0_0_22a_02(6, "c0.0.22a_02"), // missing; unknown al_version
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @Name("c0.0.22a_01")
    CLASSIC_0_0_22a_01(6, "c0.0.22a_01"), // missing; unknown al_version
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @Name("c0.0.22a")
    CLASSIC_0_0_22a(6, "c0.0.22a"), // missing; unknown al_version
    @AlVersion(6.27)
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @Name("c0.0.21a_01")
    CLASSIC_0_0_21a_01(6, "c0.0.21a_01"), // missing
    @AlVersion(6.26)
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.21a/c0.0.21a.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.21a/c0.0.21a.jar")
    @Name("c0.0.21a")
    CLASSIC_0_0_21a(6, "c0.0.21a"), // missing pre-reupload
    @AlVersion(6.23)
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @Name("c0.0.20a_02")
    CLASSIC_0_0_20a_02(6, "c0.0.20a_02"), // missing
    @CorrespondingVersion("CLASSIC_SERVER_1_8_2")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.20a_01/c0.0.20a_01.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.20a_01/c0.0.20a_01.jar")
    @Name("c0.0.20a_01")
    CLASSIC_0_0_20a_01(6, "c0.0.20a_01"), // unknown al_version
    @CorrespondingVersion("CLASSIC_SERVER_1_8_1")
    @Name("c0.0.20a")
    CLASSIC_0_0_20a(-1, "c0.0.20a"), // missing; unknown al_version; unknown protocol version
    @CorrespondingVersion("CLASSIC_SERVER_1_7")
    @Name("c0.0.19a_06")
    CLASSIC_0_0_19a_06(-1, "c0.0.19a_06"), // missing pre-reupload; unknown al_version; unknown protocol version
    @CorrespondingVersion("CLASSIC_SERVER_1_6")
    @Name("c0.0.19a_05")
    CLASSIC_0_0_19a_05(-1, "c0.0.19a_05"), // missing; unknown al_version; unknown protocol version
    @CorrespondingVersion("CLASSIC_SERVER_1_6")
    @Name("c0.0.19a_04")
    CLASSIC_0_0_19a_04(-1, "c0.0.19a_04"), // missing; unknown al_version; unknown protocol version
    @CorrespondingVersion("CLASSIC_SERVER_1_5")
    @Name("c0.0.19a_03")
    CLASSIC_0_0_19a_03(-1, "c0.0.19a_03"), // missing; unknown al_version; unknown protocol version
    @CorrespondingVersion("CLASSIC_SERVER_1_5")
    @Name("c0.0.19a_02")
    CLASSIC_0_0_19a_02(-1, "c0.0.19a_02"), // missing; unknown al_version; unknown protocol version
    @CorrespondingVersion("CLASSIC_SERVER_1_5")
    @Name("c0.0.19a_01")
    CLASSIC_0_0_19a_01(-1, "c0.0.19a_01"), // missing; unknown al_version; unknown protocol version
    @CorrespondingVersion("CLASSIC_SERVER_1_5")
    @Name("c0.0.19a")
    CLASSIC_0_0_19a(-1, "c0.0.19a"), // missing; unknown al_version; unknown protocol version
    @AlVersion(6.08)
    @CorrespondingVersion("CLASSIC_SERVER_1_4_1")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.18a_02/c0.0.18a_02.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.18a_02/c0.0.18a_02.jar")
    @Name("c0.0.18a_02")
    CLASSIC_0_0_18a_02(4, "c0.0.18a_02"),
    @AlVersion(6.07)
    @CorrespondingVersion("CLASSIC_SERVER_1_4_1")
    @Name("c0.0.18a_01")
    CLASSIC_0_0_18a_01(-1, "c0.0.18a_01"), // missing; unknown protocol version
    @AlVersion(6.06)
    @CorrespondingVersion("CLASSIC_SERVER_1_4")
    @Name("c0.0.18a")
    CLASSIC_0_0_18a(-1, "c0.0.18a"), // missing; unknown protocol version
    @AlVersion(6.05)
    @CorrespondingVersion("CLASSIC_SERVER_1_3")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.17a/c0.0.17a.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.17a/c0.0.17a.jar")
    @Name("c0.0.17a")
    CLASSIC_0_0_17a(4, "c0.0.17a"),
    @AlVersion(5.51)
    @CorrespondingVersion("CLASSIC_SERVER_1_2")
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.16a_02/c0.0.16a_02.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.16a_02/c0.0.16a_02.jar")
    @Name("c0.0.16a_02")
    CLASSIC_0_0_16a_02(3, "c0.0.16a_02"), // missing pre-reupload and reupload 1-2
    @CorrespondingVersion("CLASSIC_SERVER_1_1")
    @Name("c0.0.16a_01")
    CLASSIC_0_0_16a_01(-1, "c0.0.16a_01"), // missing; unknown al_version; unknown protocol version
    @CorrespondingVersion("CLASSIC_SERVER_1_0")
    @Name("c0.0.16a")
    CLASSIC_0_0_16a(-1, "c0.0.16a"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a_03")
    CLASSIC_0_0_15a_03(-1, "c0.0.15a_03"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a_02")
    CLASSIC_0_0_15a_02(-1, "c0.0.15a_02"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a (Multiplayer Test 8)")
    CLASSIC_0_0_15a_MULTIPLAYER_TEST_8(-1, "c0.0.15a_mt8"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a (Multiplayer Test 7)")
    CLASSIC_0_0_15a_MULTIPLAYER_TEST_7(-1, "c0.0.15a_mt7"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a (Multiplayer Test 6)")
    CLASSIC_0_0_15a_MULTIPLAYER_TEST_6(-1, "c0.0.15a_mt6"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a (Multiplayer Test 5)")
    CLASSIC_0_0_15a_MULTIPLAYER_TEST_5(-1, "c0.0.15a_mt5"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a (Multiplayer Test 4)")
    CLASSIC_0_0_15a_MULTIPLAYER_TEST_4(-1, "c0.0.15a_mt4"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a (Multiplayer Test 3)")
    CLASSIC_0_0_15a_MULTIPLAYER_TEST_3(-1, "c0.0.15a_mt3"), // missing; unknown al_version; unknown protocol version
    @Name("c0.0.15a (Multiplayer Test 2)")
    CLASSIC_0_0_15a_MULTIPLAYER_TEST_2(-1, "c0.0.15a_mt2"), // missing; unknown al_version; unknown protocol version
    @ClientJson("https://archive.org/download/Minecraft-JSONs/c0.0.15a-1.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.15a-1/c0.0.15a-1.jar")
    @Name("c0.0.15a (Multiplayer Test 1)")
    CLASSIC_0_0_15a_MULTIPLAYER_TEST_1("c0.0.15a_mt1"), // unknown al_version
    @AlVersion({5.36, 5.39})
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.14a_08/c0.0.14a_08.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.14a_08/c0.0.14a_08.jar")
    @Name("c0.0.14a_08")
    CLASSIC_0_0_14a_08("c0.0.14a_08"),
    @Name("c0.0.14a_07")
    CLASSIC_0_0_14a_07("c0.0.14a_07"), // missing; unknown al_version
    @Name("c0.0.14a_06")
    CLASSIC_0_0_14a_06("c0.0.14a_06"), // missing; unknown al_version
    @Name("c0.0.14a_05")
    CLASSIC_0_0_14a_05("c0.0.14a_05"), // missing; unknown al_version
    @Name("c0.0.14a_04")
    CLASSIC_0_0_14a_04("c0.0.14a_04"), // missing; unknown al_version
    @AlVersion(5.27)
    @Name("c0.0.14a_03")
    CLASSIC_0_0_14a_03("c0.0.14a_03"), // missing
    @Name("c0.0.14a_01")
    CLASSIC_0_0_14a_01("c0.0.14a_01"), // missing; unknown al_version
    @Name("c0.0.14a")
    CLASSIC_0_0_14a("c0.0.14a"), // missing; unknown al_version
    @AlVersion(5.17)
    @ClientJson({"https://archive.org/download/Minecraft-JE-Classic/c0.0.13a_03/c0.0.13a_03.json", "https://launchermeta.mojang.com/v1/packages/6acc567327d839965034870250f77a5b4bba0916/c0.0.13a_03.json"})
    @ClientJar({"https://archive.org/download/Minecraft-JE-Classic/c0.0.13a_03/c0.0.13a_03.jar", "https://launcher.mojang.com/v1/objects/7ba9e63aec8a15a99ecd47900c848cdce8a51a03/client.jar"})
    @Name("c0.0.13a_03")
    CLASSIC_0_0_13a_03("c0.0.13a_03"),
    @ClientJson("https://launchermeta.mojang.com/v1/packages/7677a2d81caba8719dc797851828032ddf45d622/c0.0.13a.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/936d575b1ab1a04a341ad43d76e441e88d2cd987/client.jar")
    @Name("c0.0.13a World size test 1")
    CLASSIC_0_0_13a_WORLD_SIZE_TEST_1("c0.0.13a_wst1"), // in-game version says just "0.0.13a"
    @Name("c0.0.13a")
    CLASSIC_0_0_13a("c0.0.13a"), // missing; unknown al_version
    @AlVersion(3.14)
    @ClientJson("https://archive.org/download/Minecraft-JE-Classic/c0.0.12a_03/c0.0.12a_03.json")
    @ClientJar("https://archive.org/download/Minecraft-JE-Classic/c0.0.12a_03/c0.0.12a_03.jar")
    @Name("c0.0.12a_03")
    CLASSIC_0_0_12a_03("c0.0.12a_03"), // missing pre-reupload
    @Name("c0.0.12a_02")
    CLASSIC_0_0_12a_02("c0.0.12a_02"), // missing; unknown al_version
    @Name("c0.0.12a_01")
    CLASSIC_0_0_12a_01("c0.0.12a_01"), // missing; unknown al_version
    @Name("c0.0.12a")
    CLASSIC_0_0_12a("c0.0.12a"), // missing; unknown al_version
    @Name("c0.0.11a")
    CLASSIC_0_0_11a("c0.0.11a"), // missing; unknown al_version
    @Name("c0.0.10a")
    CLASSIC_0_0_10a("c0.0.10a"), // missing; unknown al_version
    @AlVersion(0.9)
    @Name("c0.0.9a")
    CLASSIC_0_0_9a("c0.0.9a"), // missing
    // "Notch did not release versions 0.0.4a through 0.0.8a, assuming they existed to begin with." - https://minecraft.fandom.com/wiki/Java_Edition_Classic_0.0.9a
    @Name("c0.0.3a")
    CLASSIC_0_0_3a("c0.0.3a"), // missing; unknown al_version
    @Name("c0.0.2a")
    CLASSIC_0_0_2a("c0.0.2a"), // missing; unknown al_version

    // pre-Classic
    PRE_CLASSIC_MC_161648("mc-161648"), // missing; unofficial name
    PRE_CLASSIC_MC_161625("mc-161625"), // missing; unofficial name
    PRE_CLASSIC_MC_161616("mc-161616"), // missing; unofficial name
    PRE_CLASSIC_MC_161607("mc-161607"), // missing; unofficial name
    @ClientJson("https://launchermeta.mojang.com/v1/packages/757cb41649206f6209673a987ce550fd2218f2a8/rd-161348.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/6323bd14ed7f83852e17ebc8ec418e55c97ddfe4/client.jar")
    PRE_CLASSIC_RD_161348("rd-161348"), // missing unedited copy
    @ClientJson("https://launchermeta.mojang.com/v1/packages/58c0d55cd4e7a5d631f498e4bab5ee0a609a3e0c/rd-160052.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/b100be8097195b6c9112046dc6a80d326c8df839/client.jar")
    PRE_CLASSIC_RD_160052("rd-160052"), // missing unedited copy
    PRE_CLASSIC_RD_20090515("rd-20090515"), // missing
    @ClientJson("https://launchermeta.mojang.com/v1/packages/75ae3d2cf1615ed2e42e7e1ad8147db49357e029/rd-132328.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/12dace5a458617d3f90337a7ebde86c0593a6899/client.jar")
    PRE_CLASSIC_RD_132328("rd-132328"), // missing unedited copy
    @ClientJson("https://launchermeta.mojang.com/v1/packages/8b6e0c4f183ffb61b6a0c818787b0499b315123e/rd-132211.json")
    @ClientJar("https://launcher.mojang.com/v1/objects/393e8d4b4d708587e2accd7c5221db65365e1075/client.jar")
    PRE_CLASSIC_RD_132211("rd-132211"), // missing unedited copy
    PRE_CLASSIC_RD_131655("rd-131655"), // missing
    ;

    private static final ICollectionList<MCVersion> VALUES = ICollectionList.asList(values());
    private final int protocolVersion;
    private final int dataVersion;
    private final String id;

    MCVersion(@NotNull String id) {
        this(-1, id);
    }

    MCVersion(int protocolVersion, @NotNull String id) {
        this(protocolVersion, -1, id);
    }

    MCVersion(int protocolVersion, int dataVersion, @NotNull String id) {
        this.protocolVersion = protocolVersion;
        this.dataVersion = dataVersion;
        this.id = id;
    }

    private static final double[] EMPTY_DOUBLE_ARRAY = new double[0];

    // AppletLoader version; see https://minecraft.fandom.com/wiki/Al_version for more details
    public double[] getAlVersions() {
        return this.<double[]>getResultOf(AlVersion.class).orElse(EMPTY_DOUBLE_ARRAY);
    }

    /**
     * @return protocol version for this version.
     */
    public int getProtocolVersion() {
        return protocolVersion;
    }

    /**
     * Returns if it's pre-release or not
     * @return true if it's pre-release version
     */
    public boolean isPrerelease() {
        return getPrereleaseFor() != null;
    }

    @Nullable
    public MCVersion getPrereleaseFor() {
        return getValueOf(PrereleaseFor.class);
    }

    public boolean hasServer() {
        return /*name().toLowerCase().contains("server") || */getServerJar() != null || getServerMapping() != null || getValueOf(ValueTypes.SERVER_EXE) != null;
    }

    public boolean hasClient() {
        return getClientJar() != null || getClientMapping() != null;
    }

    /**
     * Returns if it's release candidate version or not
     * @return true if it's release candidate
     */
    public boolean isReleaseCandidate() {
        return getReleaseCandidateFor() != null;
    }

    @Nullable
    public MCVersion getReleaseCandidateFor() {
        return getValueOf(ReleaseCandidateFor.class);
    }

    /**
     * Returns if it's modern version(it means 1.13+ in common) or not
     * @return true if this version is modern
     */
    public boolean isModern() {
        return this.ordinal() <= SNAPSHOT_17W47A.ordinal();
    }

    /**
     * Returns if it's snapshot or not
     * @return true if this version is snapshot
     */
    public boolean isSnapshot() {
        return getSnapshotFor() != null;
    }

    @Nullable
    public MCVersion getSnapshotFor() {
        return getValueOf(SnapshotFor.class);
    }

    public boolean isCombatTest() {
        return name().toLowerCase().contains("combat_test");
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    /**
     * @return the version name
     */
    @NotNull
    public String getName() {
        String name = getValueOf(ValueTypes.NAME);
        if (name == null) return this.id;
        return name;
    }

    /**
     * Available only on some versions of alpha and classic versions (server/client).
     * @return Returns a corresponding client/server for the single client/server version. null if not applicable.
     */
    @Nullable
    @Contract
    public MCVersion getCorrespondingVersion() {
        String correspondingVersion = this.getValueOf(CorrespondingVersion.class);
        return correspondingVersion != null ? MCVersion.valueOf(correspondingVersion) : null;
    }

    /**
     * Returns a data version, also known as a world version,
     * is a positive integer used in world save data
     * to denote a specific version.<br />
     * It returns -1 if the version does not have data version.
     * @return data version, -1 if the version does not support data version
     */
    public int getDataVersion() {
        return dataVersion;
    }

    /**
     * @return true if this version is april fools
     */
    public boolean isAprilFools() {
        return getField().isAnnotationPresent(AprilFoolsVersion.class);
    }

    /**
     * @return true if this version is beta
     */
    public boolean isBeta() {
        return name().contains("BETA");
    }

    /**
     * Checks whether the release is full release (not snapshot, not beta, not release candidate, not classic, not index, not infdev)
     * @return true if this versions is full release
     */
    public boolean isRelease() {
        return !isSnapshot() && !isBeta() && !isPrerelease() && !isReleaseCandidate() && ordinal() <= v1_0_0.ordinal() && getVersionType() == Types.RELEASE;
    }

    @NotNull
    public Types getVersionType() {
        Types type = getValueOf(ValueTypes.TYPE);
        if (type == null) return Types.RELEASE;
        return type;
    }

    @NotNull
    private Field getField() {
        try {
            return MCVersion.class.getField(name());
        } catch (NoSuchFieldException e) {
            // impossible
            throw new AssertionError(e);
        }
    }

    @SuppressWarnings("unchecked")
    @NotNull
    public <T> Optional<T> getResultOf(Class<? extends Annotation> clazz) {
        Annotation annotation = getField().getAnnotation(clazz);
        if (annotation == null) return Optional.empty();
        try {
            return Optional.of((T) annotation.annotationType().getMethod("value").invoke(annotation));
        } catch (ReflectiveOperationException | RuntimeException e) {
            return Optional.empty();
        }
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public <T> T getValueOf(@NotNull Class<? extends Annotation> clazz) {
        return this.<T>getResultOf(clazz).orElse(null);
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public <T> T getValueOf(@NotNull ValueTypes<T> valueTypes) {
        return this.getValueOf(valueTypes.getAnnotationClass());
    }

    // returns the last entry
    @Nullable
    public String getClientJson() {
        return getLastEntry(getClientJsons());
    }

    // returns the last entry
    @Nullable
    public String getClientJar() {
        return getLastEntry(getClientJars());
    }

    // returns the last entry
    @Nullable
    public String getServerJar() {
        return getLastEntry(getServerJars());
    }

    @Nullable
    public String getClientMapping() {
        return getLastEntry(getClientMappings());
    }

    @Nullable
    public String getServerMapping() {
        return getLastEntry(getServerMappings());
    }

    // last element = latest version
    // first element = oldest (original) version

    @Nullable
    public String[] getClientJsons() {
        return getValueOf(ClientJson.class);
    }

    @Nullable
    public String[] getClientJars() {
        return getValueOf(ClientJar.class);
    }

    @Nullable
    public String[] getServerJars() {
        return getValueOf(ServerJar.class);
    }

    @Nullable
    public String[] getClientMappings() {
        return getValueOf(ClientMapping.class);
    }

    @Nullable
    public String[] getServerMappings() {
        return getValueOf(ServerMapping.class);
    }

    @Contract(value = "null -> null", pure = true)
    @Nullable
    private <T> T getLastEntry(@Nullable T[] array) {
        if (array == null || array.length == 0) return null;
        return array[array.length - 1];
    }

    @NotNull
    public static ICollectionList<MCVersion> getValues() {
        return VALUES;
    }

    private static final Map<Integer, List<MCVersion>> cachedProtocolVersions = new HashMap<>();
    private static final Map<Integer, List<MCVersion>> cachedDataVersions = new HashMap<>();

    @NotNull
    public static List<MCVersion> getByProtocolVersion(int protocolVersion) {
        if (cachedProtocolVersions.containsKey(protocolVersion)) return cachedProtocolVersions.get(protocolVersion);
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.protocolVersion == protocolVersion) list.add(version);
        }
        if (list.size() == 0) list.add(UNKNOWN);
        cachedProtocolVersions.put(protocolVersion, list);
        return list;
    }

    @Nullable
    public static MCVersion getLatestReleaseVersionByProtocolVersion(int protocolVersion) {
        return getByProtocolVersion(protocolVersion).stream().filter(v -> v != UNKNOWN && v.isRelease()).findFirst().orElse(null);
    }

    @Nullable
    public static MCVersion getLatestVersionByProtocolVersion(int protocolVersion) {
        return getByProtocolVersion(protocolVersion).stream().filter(v -> v != UNKNOWN).findFirst().orElse(null);
    }

    @Nullable
    public static MCVersion getReleaseOrLatestByProtocolVersion(int protocolVersion) {
        MCVersion release = getLatestReleaseVersionByProtocolVersion(protocolVersion);
        if (release != null) return release;
        return getLatestVersionByProtocolVersion(protocolVersion);
    }

    @NotNull
    public static List<MCVersion> getByDataVersion(int dataVersion) {
        if (cachedDataVersions.containsKey(dataVersion)) return cachedDataVersions.get(dataVersion);
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.dataVersion == dataVersion) list.add(version);
        }
        if (list.size() == 0) list.add(UNKNOWN);
        cachedDataVersions.put(dataVersion, list);
        return list;
    }

    @Nullable
    public static MCVersion getLatestVersionByDataVersion(int dataVersion) {
        return ICollectionList.asList(getByDataVersion(dataVersion)).filter(v -> v != UNKNOWN && v.isRelease()).first();
    }

    @Nullable
    public static MCVersion getLatestReleaseVersionByDataVersion(int dataVersion) {
        return ICollectionList.asList(getByDataVersion(dataVersion)).filter(v -> v != UNKNOWN).first();
    }

    @Nullable
    public static MCVersion getLatestOrReleaseByDataVersion(int dataVersion) {
        MCVersion release = getLatestReleaseVersionByDataVersion(dataVersion);
        if (release != null) return release;
        return getLatestVersionByDataVersion(dataVersion);
    }

    @Nullable
    public static MCVersion getByAlVersion(double alVersion) {
        return VALUES.filter(v -> Arrays.stream(v.getAlVersions()).anyMatch(d -> d == alVersion)).last();
    }

    @NotNull
    public static List<MCVersion> getAprilFoolsVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.isAprilFools()) list.add(version);
        }
        return list;
    }

    @NotNull
    public static List<MCVersion> getPrereleaseVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.isPrerelease()) list.add(version);
        }
        return list;
    }

    @NotNull
    public static List<MCVersion> getModernVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.isModern()) list.add(version);
        }
        return list;
    }

    // name() -> getId() -> getName() -> null
    @Nullable
    public static MCVersion findVersion(@NotNull String s) {
        for (MCVersion version : MCVersion.values()) {
            if (version.name().equalsIgnoreCase(s)) return version;
            if (version.getId().equalsIgnoreCase(s)) return version;
            if (version.getName().equalsIgnoreCase(s)) return version;
        }
        return null;
    }

    @Override
    public String toString() {
        return "MCVersion{" + "protocolVersion=" + protocolVersion +
                ", dataVersion=" + dataVersion +
                ", modern=" + isModern() +
                ", releaseCandidateFor=" + getReleaseCandidateFor() +
                ", prereleaseFor=" + getPrereleaseFor() +
                ", snapshotFor=" + getSnapshotFor() +
                ", aprilFools=" + isAprilFools() +
                ", beta=" + isBeta() +
                ", name='" + getName() + '\'' +
                ", id='" + getId() + '\'' +
                '}';
    }

    @NotNull
    public static JSONArray getAllVersionsAsJSON() {
        JSONArray array = new JSONArray();
        for (MCVersion version : values()) {
            array.put(version.toJSONObject());
        }
        return array;
    }

    @NotNull
    public JSONObject toJSONObject() {
        return toJSONObject(false);
    }

    @NotNull
    private JSONObject toJSONObject(boolean recursive) {
        JSONObject o = new JSONObject();
        o.put("_name", name());
        o.put("_ordinal", ordinal());
        o.put("id", getId());
        o.put("name", getName());
        o.put("type", getVersionType().name().toLowerCase());
        o.put("protocol_version", getProtocolVersion());
        o.put("data_version", getDataVersion());
        o.put("has_client", hasClient());
        o.put("has_server", hasServer());
        o.put("is_modern", isModern());
        o.put("is_release", isRelease());
        o.put("is_release_candidate", isReleaseCandidate());
        o.put("is_prerelease", isPrerelease());
        o.put("is_snapshot", isSnapshot());
        o.put("is_aprilfools", isAprilFools());
        if (!recursive) o.put("release_candidate_for", toJSONOrNull(getReleaseCandidateFor()));
        if (!recursive) o.put("prerelease_for", toJSONOrNull(getPrereleaseFor()));
        if (!recursive) o.put("snapshot_for", toJSONOrNull(getSnapshotFor()));
        o.put("caves_and_cliffs_datapack", valueOrNull(getValueOf(CavesAndCliffsDataPack.class)));
        o.put("client_json", valueOrNull(getClientJson()));
        o.put("client_jsons", valueOrNull(getClientJsons()));
        o.put("client_jar", valueOrNull(getClientJar()));
        o.put("client_jars", valueOrNull(getClientJars()));
        o.put("server_jar", valueOrNull(getServerJar()));
        o.put("server_jars", valueOrNull(getServerJars()));
        o.put("client_mapping", valueOrNull(getClientMapping()));
        o.put("client_mappings", valueOrNull(getClientMappings()));
        o.put("server_mapping", valueOrNull(getServerMapping()));
        o.put("server_mappings", valueOrNull(getServerMappings()));
        o.put("server_exe", valueOrNull(getLastEntry(getValueOf(ServerExe.class))));
        o.put("server_exes", valueOrNull(getValueOf(ServerExe.class)));
        o.put("server_zip", valueOrNull(getLastEntry(getValueOf(ServerZip.class))));
        o.put("server_zips", valueOrNull(getValueOf(ServerZip.class)));
        o.put("al_version", getAlVersions());
        if (!recursive) o.put("corresponding_version", toJSONOrNull(getCorrespondingVersion()));
        o.put("release_candidates", VALUES.filter(v -> v.getReleaseCandidateFor() == this).map(MCVersion::toJSONOrNull));
        o.put("prereleases", VALUES.filter(v -> v.getPrereleaseFor() == this).map(MCVersion::toJSONOrNull));
        o.put("snapshots", VALUES.filter(v -> v.getSnapshotFor() == this).map(MCVersion::toJSONOrNull));
        return o;
    }

    @NotNull
    private static Object toJSONOrNull(@Nullable MCVersion version) {
        return Optional.ofNullable(version).<Object>map(v -> v.toJSONObject(true)).orElse(JSONObject.NULL);
    }

    @Contract(value = "!null -> param1", pure = true)
    private Object valueOrNull(Object o) {
        return o != null ? o : JSONObject.NULL;
    }
}
