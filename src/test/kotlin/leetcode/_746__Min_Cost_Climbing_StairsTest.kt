package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _746__Min_Cost_Climbing_StairsTest {

    @Test
    fun test1() {
        // given
        val expected = 15

        // when
        val actual = minCostClimbingStairs(cost = intArrayOf(10, 15, 20))

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test2() {
        // given
        val expected = 6

        // when
        val actual = minCostClimbingStairs(cost = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1))

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }
}
