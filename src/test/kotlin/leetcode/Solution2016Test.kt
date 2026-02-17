package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2016Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution2016().maximumDifference(nums = intArrayOf(7, 1, 5, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = -1

        // When
        val actual = Solution2016().maximumDifference(nums = intArrayOf(9, 4, 3, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 9

        // When
        val actual = Solution2016().maximumDifference(nums = intArrayOf(1, 5, 2, 10))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = 1706

        // When
        val actual = Solution2016().maximumDifference(
            nums = intArrayOf(
                1687,
                116,
                204,
                1518,
                120,
                1569,
                1306,
                1217,
                1729,
                694,
                1091,
                1088,
                987,
                1693,
                424,
                594,
                810,
                27,
                42,
                1419,
                1283,
                983,
                167,
                1109,
                1490,
                1146,
                1265,
                1284,
                716,
                1194,
                1391,
                1568,
                297,
                250,
                579,
                177,
                474,
                38,
                1646,
                868,
                1733,
                1474,
                1645,
                1579,
                133,
                768,
                598,
                1242,
                642,
                397,
                784,
                1329,
                1082,
                1243,
                1608,
                1574,
                1241,
                158,
                1428,
                1393,
                755,
                263,
                1171,
                1726,
                266,
                1097,
                422,
                320,
                909,
                1242,
                403,
                186,
                653,
                180,
                1571,
                840,
                1206,
                701,
                1002,
                738,
                519,
                1039,
                6,
                1295,
                109,
                126,
                1139,
                192,
                48,
                816,
                391,
                421,
                611,
                439,
                1305,
                1137,
                1495,
                650,
                1338,
                1003,
                1293,
                171,
                1313,
                1670,
                354,
                814,
                756,
                1064,
                968,
                1325,
                1374,
                357,
                1271,
                726,
                1072,
                643,
                1001,
                1147,
                829,
                323,
                930,
                817,
                1613,
                650,
                1021,
                501,
                1385,
                791,
                329,
                336,
                724,
                381,
                573,
                1542,
                731,
                690,
                1526,
                1279,
                1299,
                1002,
                362,
                1469,
                1292,
                41,
                349,
                69,
                1343,
                105,
                822,
                1621,
                31,
                1346,
                41,
                1469,
                414,
                642,
                518,
                580,
                1575,
                1666,
                395,
                678,
                460,
                728,
                1584,
                1100,
                1427,
                286,
                186,
                1119,
                470,
                934,
                1484,
                679
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = -1

        // When
        val actual = Solution2016().maximumDifference(
            nums = intArrayOf(
                999,
                997,
                980,
                976,
                948,
                940,
                938,
                928,
                924,
                917,
                907,
                907,
                881,
                878,
                864,
                862,
                859,
                857,
                848,
                840,
                824,
                824,
                824,
                805,
                802,
                798,
                788,
                777,
                775,
                766,
                755,
                748,
                735,
                732,
                727,
                705,
                700,
                697,
                693,
                679,
                676,
                644,
                634,
                624,
                599,
                596,
                588,
                583,
                562,
                558,
                553,
                539,
                537,
                536,
                509,
                491,
                485,
                483,
                454,
                449,
                438,
                425,
                403,
                368,
                345,
                327,
                287,
                285,
                270,
                263,
                255,
                248,
                235,
                234,
                224,
                221,
                201,
                189,
                187,
                183,
                179,
                168,
                155,
                153,
                150,
                144,
                107,
                102,
                102,
                87,
                80,
                57,
                55,
                49,
                48,
                45,
                26,
                26,
                23,
                15
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
