package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _322__Coin_ChangeTest {

    @Test
    fun test1() {
        // given
        val expected = 3

        // when
        val actual = coinChange(coins = intArrayOf(1, 2, 5), amount = 11)

        // then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // given
        val expected = -1

        // when
        val actual = coinChange(coins = intArrayOf(2), amount = 3)

        // then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // given
        val expected = 0

        // when
        val actual = coinChange(coins = intArrayOf(1), amount = 0)

        // then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // given
        val expected = 2

        // when
        val actual = coinChange(coins = intArrayOf(1, 2147483647), amount = 2)

        // then
        assertEquals(expected, actual)
    }
}
