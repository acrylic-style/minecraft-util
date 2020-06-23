package xyz.acrylicstyle.mcutil.lang;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public enum MCVersion {
    v1_16(735, 2566, true),
    v1_16_RC1(734, 2565, true, v1_16),
    v1_16_PRE8(733, 2564, true, v1_16),
    v1_16_PRE7(732, 2563, true, v1_16),
    v1_16_PRE6(730, 2562, true, v1_16),
    v1_16_PRE5(749, 2561, true, v1_16),
    v1_16_PRE4(727, 2560, true, v1_16),
    v1_16_PRE3(725, 2559, true, v1_16),
    v1_16_PRE2(722, 2557, true, v1_16),
    v1_16_PRE1(721, 2556, true, v1_16),
    SNAPSHOT_20W22A(719, 2555, true, v1_16),
    SNAPSHOT_20W21A(718, 2554, true, v1_16),
    SNAPSHOT_20W20B(717, 2537, true, v1_16),
    SNAPSHOT_20W20A(716, 2536, true, v1_16),
    SNAPSHOT_20W19A(715, 2534, true, v1_16),
    SNAPSHOT_20W18A(714, 2532, true, v1_16),
    SNAPSHOT_20W17A(713, 2529, true, v1_16),
    SNAPSHOT_20W16A(712, 2526, true, v1_16),
    SNAPSHOT_20W15A(711, 2525, true, v1_16),
    SNAPSHOT_20W14A(710, 2524, true, v1_16),
    SNAPSHOT_20W14(709, 2522, true, null, true), // april fool
    SNAPSHOT_20W13B(709, 2521, true, v1_16),
    SNAPSHOT_20W13A(708, 2520, true, v1_16),
    SNAPSHOT_20W12A(707, 2515, true, v1_16),
    SNAPSHOT_20W11A(706, 2513, true, v1_16),
    SNAPSHOT_20W10A(705, 2512, true, v1_16),
    SNAPSHOT_20W09A(704, 2510, true, v1_16),
    SNAPSHOT_20W08A(703, 2507, true, v1_16),
    SNAPSHOT_20W07A(702, 2506, true, v1_16),
    SNAPSHOT_20W06A(701, 2504, true, v1_16),
    v1_15_2(578, 2230, true),
    v1_15_2_PRE2(577, 2229, true, v1_15_2),
    v1_15_2_PRE1(576, 2228, true, v1_15_2),
    v1_15_1(575, 2227, true),
    v1_15_1_PRE1(574, 2226, true, v1_15_1),
    v1_15(573, 2225, true),
    v1_15_PRE7(572, 2224, true, v1_15),
    v1_15_PRE6(571, 2223, true, v1_15),
    v1_15_PRE5(570, 2222, true, v1_15),
    v1_15_PRE4(569, 2221, true, v1_15),
    v1_15_PRE3(567, 2220, true, v1_15),
    v1_15_PRE2(566, 2219, true, v1_15),
    v1_15_PRE1(565, 2218, true, v1_15),
    SNAPSHOT_19W46B(564, 2217, true, v1_15),
    SNAPSHOT_19W46A(563, 2216, true, v1_15),
    SNAPSHOT_19W45B(562, 2215, true, v1_15),
    SNAPSHOT_19W45A(561, 2214, true, v1_15),
    SNAPSHOT_19W44A(560, 2213, true, v1_15),
    SNAPSHOT_19W42A(559, 2212, true, v1_15),
    SNAPSHOT_19W41A(558, 2210, true, v1_15),
    SNAPSHOT_19W40A(557, 2208, true, v1_15),
    SNAPSHOT_19W39A(556, 2207, true, v1_15),
    SNAPSHOT_19W38B(555, 2206, true, v1_15),
    SNAPSHOT_19W38A(554, 2205, true, v1_15),
    SNAPSHOT_19W37A(553, 2204, true, v1_15),
    SNAPSHOT_19W36A(552, 2203, true, v1_15),
    SNAPSHOT_19W35A(551, 2201, true, v1_15),
    SNAPSHOT_19W34A(550, 2200, true, v1_15),
    v1_14_4(498, 1976, true),
    v1_14_4_PRE7(497, 1975, true, v1_14_4),
    v1_14_4_PRE6(496, 1974, true, v1_14_4),
    v1_14_4_PRE5(495, 1973, true, v1_14_4),
    v1_14_4_PRE4(494, 1972, true, v1_14_4),
    v1_14_4_PRE3(493, 1971, true, v1_14_4),
    v1_14_4_PRE2(492, 1970, true, v1_14_4),
    v1_14_4_PRE1(491, 1969, true, v1_14_4),
    v1_14_3(490, 1968, true),
    v1_14_3_PRE4(489, 1967, true, v1_14_3),
    v1_14_3_PRE3(488, 1966, true, v1_14_3),
    v1_14_3_PRE2(487, 1965, true, v1_14_3),
    v1_14_3_PRE1(486, 1964, true, v1_14_3),
    v1_14_2(485, 1963, true),
    v1_14_2_PRE4(484, 1962, true, v1_14_2),
    v1_14_2_PRE3(483, 1960, true, v1_14_2),
    v1_14_2_PRE2(482, 1959, true, v1_14_2),
    v1_14_2_PRE1(481, 1958, true, v1_14_2),
    v1_14_1(480, 1957, true),
    v1_14_1_PRE2(479, 1956, true, v1_14_1),
    v1_14_1_PRE1(478, 1955, true, v1_14_1),
    v1_14(477, 1952, true),
    v1_14_PRE5(476, 1951, true, v1_14),
    v1_14_PRE4(475, 1950, true, v1_14),
    v1_14_PRE3(474, 1949, true, v1_14),
    v1_14_PRE2(473, 1948, true, v1_14),
    v1_14_PRE1(472, 1947, true, v1_14),
    SNAPSHOT_19W14B(471, 1945, true, v1_14),
    SNAPSHOT_19W14A(470, 1944, true, v1_14),
    MC_3D_SHAREWARE_v1_34(1, 1943, true, null, true), // april fools
    SNAPSHOT_19W13B(469, 1943, true, v1_14),
    SNAPSHOT_19W13A(468, 1942, true, v1_14),
    SNAPSHOT_19W12B(467, 1941, true, v1_14),
    SNAPSHOT_19W12A(466, 1940, true, v1_14),
    SNAPSHOT_19W11B(465, 1938, true, v1_14),
    SNAPSHOT_19W11A(464, 1937, true, v1_14),
    SNAPSHOT_19W09A(463, 1935, true, v1_14),
    SNAPSHOT_19W08B(462, 1934, true, v1_14),
    SNAPSHOT_19W08A(461, 1933, true, v1_14),
    SNAPSHOT_19W07A(460, 1932, true, v1_14),
    SNAPSHOT_19W06A(459, 1931, true, v1_14),
    SNAPSHOT_19W05A(458, 1930, true, v1_14),
    SNAPSHOT_19W04B(457, 1927, true, v1_14),
    SNAPSHOT_19W04A(456, 1926, true, v1_14),
    SNAPSHOT_19W03C(455, 1924, true, v1_14),
    SNAPSHOT_19W03B(454, 1923, true, v1_14),
    SNAPSHOT_19W03A(453, 1922, true, v1_14),
    SNAPSHOT_19W02A(452, 1921, true, v1_14),
    SNAPSHOT_18W50A(451, 1919, true, v1_14),
    SNAPSHOT_18W49A(450, 1916, true, v1_14),
    SNAPSHOT_18W48B(449, 1915, true, v1_14),
    SNAPSHOT_18W48A(448, 1914, true, v1_14),
    SNAPSHOT_18W47B(447, 1913, true, v1_14),
    SNAPSHOT_18W47A(446, 1912, true, v1_14),
    SNAPSHOT_18W46A(445, 1910, true, v1_14),
    SNAPSHOT_18W45A(444, 1908, true, v1_14),
    SNAPSHOT_18W44A(443, 1907, true, v1_14),
    SNAPSHOT_18W43C(442, 1903, true, v1_14),
    SNAPSHOT_18W43B(441, 1902, true, v1_14),
    SNAPSHOT_18W43A(440, 1901, true, v1_14),
    v1_13_2(404, 1631, true),
    v1_13_2_PRE2(403, 1630, true, v1_13_2),
    v1_13_2_PRE1(402, 1629, true, v1_13_2),
    v1_13_1(401, 1628, true),
    v1_13_1_PRE2(400, 1627, true, v1_13_1),
    v1_13_1_PRE1(399, 1626, true, v1_13_1),
    SNAPSHOT_18W33A(398, 1625, true, v1_13_1),
    SNAPSHOT_18W32A(397, 1623, true, v1_13_1),
    SNAPSHOT_18W31A(396, 1622, true, v1_13_1),
    SNAPSHOT_18W30B(395, 1621, true, v1_13_1),
    SNAPSHOT_18W30A(394, 1620, true, v1_13_1),
    v1_13(393, 1519, true),
    v1_13_PRE10(392, 1518, true, v1_13),
    v1_13_PRE9(391, 1517, true, v1_13),
    v1_13_PRE8(390, 1516, true, v1_13),
    v1_13_PRE7(389, 1513, true, v1_13),
    v1_13_PRE6(388, 1512, true, v1_13),
    v1_13_PRE5(387, 1511, true, v1_13),
    v1_13_PRE4(386, 1504, true, v1_13),
    v1_13_PRE3(385, 1503, true, v1_13),
    v1_13_PRE2(384, 1502, true, v1_13),
    v1_13_PRE1(383, 1501, true, v1_13),
    SNAPSHOT_18W22C(382, 1499, true, v1_13),
    SNAPSHOT_18W22B(381, 1498, true, v1_13),
    SNAPSHOT_18W22A(380, 1497, true, v1_13),
    SNAPSHOT_18W21B(379, 1496, true, v1_13),
    SNAPSHOT_18W21A(379, 1495, true, v1_13),
    SNAPSHOT_18W20C(377, 1493, true, v1_13),
    SNAPSHOT_18W20B(376, 1491, true, v1_13),
    SNAPSHOT_18W20A(375, 1489, true, v1_13),
    SNAPSHOT_18W19B(374, 1485, true, v1_13),
    SNAPSHOT_18W19A(373, 1484, true, v1_13),
    SNAPSHOT_18W16A(372, 1483, true, v1_13),
    SNAPSHOT_18W15A(371, 1482, true, v1_13),
    SNAPSHOT_18W14B(370, 1481, true, v1_13),
    SNAPSHOT_18W14A(369, 1479, true, v1_13),
    SNAPSHOT_18W11A(368, 1478, true, v1_13),
    SNAPSHOT_18W10D(367, 1477, true, v1_13),
    SNAPSHOT_18W10C(366, 1476, true, v1_13),
    SNAPSHOT_18W10B(365, 1474, true, v1_13),
    SNAPSHOT_18W10A(364, 1473, true, v1_13),
    SNAPSHOT_18W09A(363, 1472, true, v1_13),
    SNAPSHOT_18W08B(362, 1471, true, v1_13),
    SNAPSHOT_18W08A(361, 1470, true, v1_13),
    SNAPSHOT_18W07C(360, 1469, true, v1_13),
    SNAPSHOT_18W07B(359, 1468, true, v1_13),
    SNAPSHOT_18W07A(358, 1467, true, v1_13),
    SNAPSHOT_18W06A(357, 1466, true, v1_13),
    SNAPSHOT_18W05A(356, 1464, true, v1_13),
    SNAPSHOT_18W03B(355, 1463, true, v1_13),
    SNAPSHOT_18W03A(354, 1462, true, v1_13),
    SNAPSHOT_18W02A(353, 1461, true, v1_13), // flattened entity IDs (https://pokechu22.github.io/Burger/diff_18w01a_18w02a.html#entities)
    SNAPSHOT_18W01A(352, 1459, true, v1_13),
    SNAPSHOT_17W50A(351, 1457, true, v1_13),
    SNAPSHOT_17W49B(350, 1455, true, v1_13),
    SNAPSHOT_17W49A(349, 1454, true, v1_13),
    SNAPSHOT_17W48A(348, 1453, true, v1_13),
    SNAPSHOT_17W47B(347, 1452, true, v1_13),
    SNAPSHOT_17W47A(346, 1451, true, v1_13), // flattening update!
    SNAPSHOT_17W46A(345, 1449, v1_13),
    SNAPSHOT_17W45B(344, 1448, v1_13),
    SNAPSHOT_17W45A(343, 1447, v1_13),
    SNAPSHOT_17W43B(342, 1445, v1_13),
    SNAPSHOT_17W43A(341, 1444, v1_13),
    v1_12_2(340, 1343, null),
    v1_12_2_PRE2(339, 1342, v1_12_2),
    v1_12_2_PRE1(339, 1341, v1_12_2),
    v1_12_1(338, 1241, null),
    v1_12_1_PRE1(337, 1240, v1_12_1),
    SNAPSHOT_17W31A(336, 1239, v1_12_1),
    v1_12(335, 1139, null),
    v1_12_PRE7(334, 1138, v1_12),
    v1_12_PRE6(333, 1137, v1_12),
    v1_12_PRE5(332, 1136, v1_12),
    v1_12_PRE4(331, 1135, v1_12),
    v1_12_PRE3(330, 1134, v1_12),
    v1_12_PRE2(329, 1133, v1_12),
    v1_12_PRE1(328, 1132, v1_12),
    SNAPSHOT_17W18B(327, 1131, v1_12),
    SNAPSHOT_17W18A(326, 1130, v1_12),
    SNAPSHOT_17W17B(325, 1129, v1_12),
    SNAPSHOT_17W17A(324, 1128, v1_12),
    SNAPSHOT_17W16B(323, 1127, v1_12),
    SNAPSHOT_17W16A(322, 1126, v1_12),
    SNAPSHOT_17W15A(321, 1125, v1_12),
    SNAPSHOT_17W14A(320, 1124, v1_12),
    SNAPSHOT_17W13B(319, 1123, v1_12),
    SNAPSHOT_17W13A(318, 1122, v1_12),
    SNAPSHOT_17W06A(317, 1022, v1_12),
    v1_11_2(316, 922, null),
    v1_11_1(316, 921, null),
    SNAPSHOT_16W50A(316, 920, v1_11_1),
    v1_11(315, 819, null),
    v1_11_PRE1(314, 818, v1_11),
    SNAPSHOT_16W44A(313, 817, v1_11),
    SNAPSHOT_16W43A(313, 816, v1_11),
    SNAPSHOT_16W42A(312, 815, v1_11),
    SNAPSHOT_16W41A(311, 814, v1_11),
    SNAPSHOT_16W40A(310, 813, v1_11),
    SNAPSHOT_16W39C(309, 812, v1_11),
    SNAPSHOT_16W39B(308, 811, v1_11),
    SNAPSHOT_16W39A(307, 809, v1_11),
    SNAPSHOT_16W38A(306, 807, v1_11),
    SNAPSHOT_16W36A(305, 805, v1_11),
    SNAPSHOT_16W35A(304, 803, v1_11),
    SNAPSHOT_16W33A(303, 803, v1_11),
    SNAPSHOT_16W32B(302, 801, v1_11),
    SNAPSHOT_16W32A(301, 800, v1_11),
    v1_10_2(210, 512, null),
    v1_10_1(210, 511, null),
    v1_10(210, 510, null),
    v1_10_PRE2(205, 507, v1_10),
    v1_10_PRE1(204, 506, v1_10),
    SNAPSHOT_16W21B(203, 504, v1_10),
    SNAPSHOT_16W21A(202, 503, v1_10),
    SNAPSHOT_16W20A(201, 501, v1_10),
    v1_9_4(110, 184, null),
    v1_9_3(110, 183, null),
    v1_9_3_PRE3(110, 182, v1_9_3),
    v1_9_3_PRE2(110, 181, v1_9_3),
    v1_9_3_PRE1(109, 180, v1_9_3),
    SNAPSHOT_16W15B(109, 179, v1_9_3),
    SNAPSHOT_16W15A(109, 178, v1_9_3),
    SNAPSHOT_16W14A(109, 177, v1_9_3),
    v1_9_2(109, 176, null),
    v1_RV_PRE1(108, 173, false, null, true), // april fool
    v1_9_1(108, 175, null),
    v1_9_1_PRE3(108, 172, v1_9_1),
    v1_9_1_PRE2(108, 171, v1_9_1),
    v1_9_1_PRE1(107, 170, v1_9_1),
    v1_9(107, 169, null),
    v1_9_PRE4(106, 168, v1_9),
    v1_9_PRE3(105, 167, v1_9),
    v1_9_PRE2(104, 165, v1_9),
    v1_9_PRE1(103, 164, v1_9),
    SNAPSHOT_16W07B(102, 163, v1_9),
    SNAPSHOT_16W07A(101, 162, v1_9),
    SNAPSHOT_16W06A(100, 161, v1_9),
    SNAPSHOT_16W05B(99, 160, v1_9),
    SNAPSHOT_16W05A(98, 159, v1_9),
    SNAPSHOT_16W04A(97, 158, v1_9),
    SNAPSHOT_16W03A(96, 157, v1_9),
    SNAPSHOT_16W02A(95, 156, v1_9),
    SNAPSHOT_15W51B(94, 155, v1_9),
    SNAPSHOT_15W51A(93, 154, v1_9),
    SNAPSHOT_15W50A(92, 153, v1_9),
    SNAPSHOT_15W49B(91, 152, v1_9),
    SNAPSHOT_15W49A(90, 151, v1_9),
    SNAPSHOT_15W47C(89, 150, v1_9),
    SNAPSHOT_15W47B(88, 149, v1_9),
    SNAPSHOT_15W47A(87, 148, v1_9),
    SNAPSHOT_15W46A(86, 146, v1_9),
    SNAPSHOT_15W45A(85, 145, v1_9),
    SNAPSHOT_15W44B(84, 143, v1_9),
    SNAPSHOT_15244A(83, 142, v1_9),
    SNAPSHOT_15W43C(82, 141, v1_9),
    SNAPSHOT_15W43B(81, 140, v1_9),
    SNAPSHOT_15W43A(80, 139, v1_9),
    SNAPSHOT_15W42A(79, 138, v1_9),
    SNAPSHOT_15W41B(78, 137, v1_9),
    SNAPSHOT_15W41A(77, 136, v1_9),
    SNAPSHOT_15W40B(76, 134, v1_9),
    SNAPSHOT_15W40A(75, 133, v1_9),
    SNAPSHOT_15W39C(74, 132, v1_9),
    SNAPSHOT_15W39B(74, 131, v1_9),
    SNAPSHOT_15W39A(74, 130, v1_9),
    SNAPSHOT_15W38B(73, 129, v1_9),
    SNAPSHOT_15W38A(72, 128, v1_9),
    SNAPSHOT_15W37A(71, 127, v1_9),
    SNAPSHOT_15W36D(70, 126, v1_9),
    SNAPSHOT_15W36C(69, 125, v1_9),
    SNAPSHOT_15W36B(68, 124, v1_9),
    SNAPSHOT_15W36A(67, 123, v1_9),
    SNAPSHOT_15W35E(66, 122, v1_9),
    SNAPSHOT_15W35D(65, 121, v1_9),
    SNAPSHOT_15W35C(64, 120, v1_9),
    SNAPSHOT_15W35B(63, 119, v1_9),
    SNAPSHOT_15W35A(62, 118, v1_9),
    SNAPSHOT_15W34D(61, 117, v1_9),
    SNAPSHOT_15W34C(60, 116, v1_9),
    SNAPSHOT_15W34B(59, 115, v1_9),
    SNAPSHOT_15W34A(58, 114, v1_9),
    SNAPSHOT_15W33C(57, 112, v1_9),
    SNAPSHOT_15W33B(56, 111, v1_9),
    SNAPSHOT_15W33A(55, 111, v1_9),
    SNAPSHOT_15W32C(54, 104, v1_9),
    SNAPSHOT_15W32B(53, 103, v1_9),
    SNAPSHOT_15W32A(52, 100, v1_9),
    SNAPSHOT_15W31C(51, v1_9),
    SNAPSHOT_15W31B(50, v1_9),
    SNAPSHOT_15W31A(49, v1_9),
    SNAPSHOT_15W14A(48, -1, false, null, true), // april fools
    v1_8_9(47),
    v1_8_8(47),
    v1_8_7(47),
    v1_8_6(47),
    v1_8_5(47),
    v1_8_4(47),
    v1_8_3(47),
    v1_8_2(47),
    v1_8_2_PRE7(47, v1_8_2),
    v1_8_2_PRE6(47, v1_8_2),
    v1_8_2_PRE5(47, v1_8_2),
    v1_8_2_PRE4(47, v1_8_2),
    v1_8_2_PRE3(47, v1_8_2),
    v1_8_2_PRE2(47, v1_8_2),
    v1_8_2_PRE1(47, v1_8_2),
    v1_8_1(47),
    v1_8_1_PRE5(47, v1_8_1),
    v1_8_1_PRE4(47, v1_8_1),
    v1_8_1_PRE3(47, v1_8_1),
    v1_8_1_PRE2(47, v1_8_1),
    v1_8_1_PRE1(47, v1_8_1),
    v1_8(47),
    v1_8_PRE3(46, v1_8),
    v1_8_PRE2(45, v1_8),
    v1_8_PRE1(44, v1_8),
    SNAPSHOT_14W34D(43, v1_8),
    SNAPSHOT_14W34C(42, v1_8),
    SNAPSHOT_14W34B(41, v1_8),
    SNAPSHOT_14W34A(40, v1_8),
    SNAPSHOT_14W33C(39, v1_8),
    SNAPSHOT_14W33B(38, v1_8),
    SNAPSHOT_14W33A(37, v1_8),
    SNAPSHOT_14W32D(36, v1_8),
    SNAPSHOT_14W32C(35, v1_8),
    SNAPSHOT_14W32B(34, v1_8),
    SNAPSHOT_14W32A(33, v1_8),
    SNAPSHOT_14W31A(32, v1_8),
    SNAPSHOT_14W30C(31, v1_8),
    SNAPSHOT_14W30B(30, v1_8),
    SNAPSHOT_14W30A(30, v1_8),
    SNAPSHOT_14W29B(29, v1_8),
    SNAPSHOT_14W29A(29, v1_8),
    SNAPSHOT_14W28B(28, v1_8),
    SNAPSHOT_14W28A(27, v1_8),
    SNAPSHOT_14W27B(26, v1_8),
    SNAPSHOT_14W27A(26, v1_8),
    SNAPSHOT_14W26C(25, v1_8),
    SNAPSHOT_14W26B(24, v1_8),
    SNAPSHOT_14W26A(23, v1_8),
    SNAPSHOT_14W25B(22, v1_8),
    SNAPSHOT_14W25A(21, v1_8),
    SNAPSHOT_14W21B(20, v1_8),
    SNAPSHOT_14W21A(19, v1_8),
    SNAPSHOT_14W20B(18, v1_8),
    SNAPSHOT_14W20A(18, v1_8),
    SNAPSHOT_14W19A(17, v1_8),
    SNAPSHOT_14W18B(16, v1_8),
    SNAPSHOT_14W18A(16, v1_8),
    SNAPSHOT_14W17A(15, v1_8),
    SNAPSHOT_14W11A(14, v1_8),
    SNAPSHOT_14W10C(13, v1_8),
    SNAPSHOT_14W10B(13, v1_8),
    SNAPSHOT_14W10A(13, v1_8),
    SNAPSHOT_14W08A(12, v1_8),
    SNAPSHOT_14W07A(11, v1_8),
    SNAPSHOT_14W06B(10, v1_8),
    SNAPSHOT_14W06A(10, v1_8),
    SNAPSHOT_14W05B(9, v1_8),
    SNAPSHOT_14W05A(9, v1_8),
    SNAPSHOT_14W04B(8, v1_8),
    SNAPSHOT_14W04A(7, v1_8),
    SNAPSHOT_14W03B(6, v1_8),
    SNAPSHOT_14W03A(6, v1_8),
    SNAPSHOT_14W02C(5, v1_8),
    SNAPSHOT_14W02B(5, v1_8),
    SNAPSHOT_14W02A(5, v1_8),
    v1_7_10(5),
    v1_7_10_PRE4(5, v1_7_10),
    v1_7_10_PRE3(5, v1_7_10),
    v1_7_10_PRE2(5, v1_7_10),
    v1_7_10_PRE1(5, v1_7_10),
    v1_7_9(5),
    v1_7_8(5),
    v1_7_7(5),
    v1_7_6(5),
    v1_7_6_PRE2(5),
    v1_7_6_PRE1(5),
    v1_7_5(4),
    v1_7_4(4),
    v1_7_3(4),
    SNAPSHOT_13W49A(4, v1_7_3),
    SNAPSHOT_13W48B(4, v1_7_3),
    SNAPSHOT_13W48A(4, v1_7_3),
    SNAPSHOT_13W47E(4, v1_7_3),
    SNAPSHOT_13W47D(4, v1_7_3),
    SNAPSHOT_13W47C(4, v1_7_3),
    SNAPSHOT_13W47B(4, v1_7_3),
    SNAPSHOT_13W47A(4, v1_7_3),
    v1_7_2(4),
    v1_7_1(3),
    v1_7(3),
    SNAPSHOT_13W43A(2, v1_7),
    SNAPSHOT_13W42B(1, v1_7),
    SNAPSHOT_13W42A(1, v1_7),
    SNAPSHOT_13W41B(0, v1_7),
    SNAPSHOT_13W41A(0, v1_7),

    /* pre-netty rewrite */
    SNAPSHOT_13W39B(80, v1_7),
    SNAPSHOT_13W39A(80, v1_7),
    SNAPSHOT_13W38C(79, v1_7),
    SNAPSHOT_13W38B(79, v1_7),
    SNAPSHOT_13W38A(79, v1_7),
    v1_6_4(78),
    v1_6_3(77),
    SNAPSHOT_13W37B(76, v1_6_3),
    SNAPSHOT_13W37A(76, v1_6_3),
    SNAPSHOT_13W36B(75, v1_6_3),
    SNAPSHOT_13W36A(75, v1_6_3),
    v1_6_2(74),
    v1_6_1(73),
    v1_6(72),
    SNAPSHOT_13W26A(72, v1_6),
    SNAPSHOT_13W25C(71, v1_6),
    SNAPSHOT_13W25B(71, v1_6),
    SNAPSHOT_13W25A(71, v1_6),
    SNAPSHOT_13W24B(70, v1_6),
    SNAPSHOT_13W24A(69, v1_6),
    SNAPSHOT_13W23B(68, v1_6),
    SNAPSHOT_13W23A(67, v1_6),
    SNAPSHOT_13W22A(67, v1_6),
    SNAPSHOT_13W21B(67, v1_6),
    SNAPSHOT_13W21A(67, v1_6),
    SNAPSHOT_13W19A(66, v1_6),
    SNAPSHOT_13W18C(65, v1_6),
    SNAPSHOT_13W18B(65, v1_6),
    SNAPSHOT_13W18A(65, v1_6),
    SNAPSHOT_13W17A(64, v1_6),
    SNAPSHOT_13W16B(63, v1_6),
    SNAPSHOT_13W16A(62, v1_6),
    v1_5_2(61),
    v2_0_BLUE(90, -1, false, null, true), // april fools
    v2_0_RED(91, -1, false, null, true), // april fools
    v2_0_PURPLE(92, -1, false, null, true), // april fools
    v1_5_1(60),
    SNAPSHOT_13W12(60, v1_5_1),
    SNAPSHOT_13W11A(60, v1_5_1),
    v1_5(60),
    SNAPSHOT_13W10B(60, v1_5),
    SNAPSHOT_13W10A(60, v1_5),
    SNAPSHOT_13W09C(60, v1_5),
    SNAPSHOT_13W09B(59, v1_5),
    SNAPSHOT_13W09A(59, v1_5),
    SNAPSHOT_13W07A(58, v1_5),
    SNAPSHOT_13W06A(58, v1_5),
    SNAPSHOT_13W05B(57, v1_5),
    SNAPSHOT_13W05A(56, v1_5),
    SNAPSHOT_13W04A(55, v1_5),
    SNAPSHOT_13W03A(54, v1_5),
    SNAPSHOT_13W02B(53, v1_5),
    SNAPSHOT_13W02A(53, v1_5),
    SNAPSHOT_13W01B(52, v1_5),
    SNAPSHOT_13W01A(52, v1_5),
    v1_4_7(51),
    v1_4_6(51),
    SNAPSHOT_12W50B(51, v1_4_6),
    SNAPSHOT_12W50A(51, v1_4_6),
    SNAPSHOT_12W49A(50, v1_4_6),
    v1_4_5(49),
    v1_4_4(49),
    v1_4_3(48),
    v1_4_2(47),
    v1_4_1(-1), // unknown
    v1_4(-1), // unknown
    SNAPSHOT_12W42B(46, v1_4),
    SNAPSHOT_12W42A(46, v1_4),
    SNAPSHOT_12W41B(46, v1_4),
    SNAPSHOT_12W41A(46, v1_4),
    SNAPSHOT_12W40B(45, v1_4),
    SNAPSHOT_12W40A(44, v1_4),
    SNAPSHOT_12W39B(43, v1_4),
    SNAPSHOT_12W39A(43, v1_4),
    SNAPSHOT_12W38B(43, v1_4),
    SNAPSHOT_12W38A(43, v1_4),
    SNAPSHOT_12W37A(42, v1_4),
    SNAPSHOT_12W36A(42, v1_4),
    SNAPSHOT_12W34B(42, v1_4),
    SNAPSHOT_12W34A(41, v1_4),
    SNAPSHOT_23W32A(40, v1_4),
    v1_3_2(39),
    v1_3_1(39),
    v1_3(39),
    SNAPSHOT_12W30E(39, v1_3),
    SNAPSHOT_12W30D(39, v1_3),
    SNAPSHOT_12W30C(39, v1_3),
    SNAPSHOT_12W30B(38, v1_3),
    SNAPSHOT_12W30A(38, v1_3),
    SNAPSHOT_12W27A(38, v1_3),
    SNAPSHOT_12W26A(37, v1_3),
    SNAPSHOT_12W25A(37, v1_3),
    SNAPSHOT_12W24A(36, v1_3),
    SNAPSHOT_12W23B(35, v1_3),
    SNAPSHOT_12W23A(35, v1_3),
    SNAPSHOT_12W22A(34, v1_3),
    SNAPSHOT_12W21B(33, v1_3),
    SNAPSHOT_12W21A(33, v1_3),
    SNAPSHOT_12W19A(32, v1_3),
    SNAPSHOT_12W18A(32, v1_3),
    SNAPSHOT_12W17A(31, v1_3),
    SNAPSHOT_12W16A(30, v1_3),
    SNAPSHOT_12W15A(29, v1_3),
    v1_2_5(29),
    v1_2_4(29),
    v1_2_3(28),
    v1_2_2(28),
    v1_2_1(28),
    v1_2(28),
    SNAPSHOT_12W08A(28, v1_2),
    SNAPSHOT_12W07B(27, v1_2),
    SNAPSHOT_12W07A(27, v1_2),
    SNAPSHOT_12W06A(25, v1_2),
    SNAPSHOT_12W05B(24, v1_2),
    SNAPSHOT_12W05A(24, v1_2),
    SNAPSHOT_12W04A(24, v1_2),
    SNAPSHOT_12W03A(24, v1_2),
    v1_1(23),
    SNAPSHOT_12W01A(23),
    SNAPSHOT_11W50A(22),
    SNAPSHOT_11W49A(22),
    SNAPSHOT_11W48A(22),
    SNAPSHOT_11W47A(22),
    v1_0_1(22),
    v1_0_0(22),
    RC2(22, v1_0_0),
    RC1(22, v1_0_0),
    BETA_1_9_PRE6(22, v1_0_0),
    BETA_1_9_PRE5(21, v1_0_0),
    BETA_1_9_PRE4(20, v1_0_0),
    BETA_1_9_PRE3(19, v1_0_0),
    BETA_1_9_PRE2(19, v1_0_0),
    BETA_1_9_PRE(18, v1_0_0),
    BETA_1_8_1(17),
    BETA_1_8(17),
    BETA_1_8_PRE2(16, BETA_1_8),
    BETA_1_8_PRE(15, BETA_1_8),
    BETA_1_7_3(14),
    BETA_1_7_2(14),
    BETA_1_7_01(14),
    BETA_1_7(14),
    BETA_1_6_6(13),
    BETA_1_6_5(13),
    BETA_1_6_4(13),
    BETA_1_6_3(13),
    BETA_1_6_2(13),
    BETA_1_6_1(13),
    BETA_1_6(13),
    BETA_1_6_TEST_BUILD_3(12, BETA_1_6),
    BETA_1_5_02(11),
    BETA_1_5_01(11),
    BETA_1_5(11),
    BETA_1_4_01(10),
    BETA_1_4(10),
    BETA_1_3_01(9),
    BETA_1_3(9),
    BETA_1_2_02(8),
    BETA_1_2_01(8),
    BETA_1_2(8),
    BETA_1_1_02(8),
    BETA_1_1_01(7),
    BETA_1_1(7),
    BETA_1_0_2(7),
    BETA_1_0_01(7),
    BETA_1_0(7),
    ;

    private final int protocolVersion;
    private final int dataVersion;
    private final boolean modern;
    private final boolean releaseCandidate;
    private final boolean prerelease;
    private final boolean snapshot;
    private final MCVersion snapshotFor;
    private final boolean aprilFools;
    private final boolean beta;

    MCVersion(int protocolVersion) {
        this(protocolVersion, -1, false);
    }

    MCVersion(int protocolVersion, int dataVersion, @Nullable MCVersion snapshotFor) {
        this(protocolVersion, dataVersion, false, snapshotFor);
    }

    MCVersion(int protocolVersion, int dataVersion, boolean modern) {
        this(protocolVersion, dataVersion, modern, null);
    }

    MCVersion(int protocolVersion, int dataVersion, boolean modern, @Nullable MCVersion snapshotFor) {
        this(protocolVersion, dataVersion, modern, snapshotFor, false);
    }

    MCVersion(int protocolVersion, int dataVersion, boolean modern, @Nullable MCVersion snapshotFor, boolean aprilFools) {
        this.protocolVersion = protocolVersion;
        this.dataVersion = dataVersion;
        this.modern = modern;
        this.releaseCandidate = name().contains("RC");
        this.prerelease = name().contains("PRE");
        this.snapshot = name().startsWith("SNAPSHOT_");
        this.aprilFools = aprilFools;
        this.beta = name().contains("BETA");
        if (snapshotFor != null && !snapshot && !prerelease && !releaseCandidate) throw new IllegalArgumentException("Cannot set snapshotFor parameter to non-snapshot version");
        this.snapshotFor = snapshotFor;
    }

    MCVersion(int protocolVersion, @Nullable MCVersion snapshotFor) {
        this(protocolVersion, -1, snapshotFor);
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
        return prerelease;
    }

    /**
     * Returns if it's release candidate version or not
     * @return true if it's release candidate
     */
    public boolean isReleaseCandidate() {
        return releaseCandidate;
    }

    /**
     * Returns if it's modern version(it means 1.13+ in common) or not
     * @return true if this version is modern
     */
    public boolean isModern() { return modern; }

    /**
     * Returns if it's snapshot or not
     * @return true if this version is snapshot
     */
    public boolean isSnapshot() { return snapshot; }

    /**
     * Returns what this snapshot(pre-release) was made for
     * @return MCVersion if this version is snapshot or pre-release and snapshotFor was defined, null otherwise
     */
    @Nullable
    public MCVersion getSnapshotFor() {
        return snapshotFor;
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
        return aprilFools;
    }

    /**
     * @return true if this version is beta
     */
    public boolean isBeta() {
        return beta;
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
        cachedProtocolVersions.put(protocolVersion, list);
        return list;
    }

    @NotNull
    public static List<MCVersion> getByDataVersion(int dataVersion) {
        if (cachedDataVersions.containsKey(dataVersion)) return cachedDataVersions.get(dataVersion);
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.dataVersion == dataVersion) list.add(version);
        }
        cachedDataVersions.put(dataVersion, list);
        return list;
    }

    @NotNull
    public static List<MCVersion> getAprilFoolsVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.aprilFools) list.add(version);
        }
        return list;
    }

    @NotNull
    public static List<MCVersion> getPrereleaseVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.prerelease) list.add(version);
        }
        return list;
    }

    @NotNull
    public static List<MCVersion> getModernVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.modern) list.add(version);
        }
        return list;
    }
}
