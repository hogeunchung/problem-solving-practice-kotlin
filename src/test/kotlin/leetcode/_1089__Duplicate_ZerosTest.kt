package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1089__Duplicate_ZerosTest {

    @Test
    fun test1() {
        // given
        val arr = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
        val expected = intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)

        // when
        duplicateZeros(arr = arr)

        // then
        assertArrayEquals(expected, arr)
    }

    @Test
    fun test2() {
        // given
        val arr = intArrayOf(1, 2, 3)
        val expected = intArrayOf(1, 2, 3)

        // when
        duplicateZeros(arr = arr)

        // then
        assertArrayEquals(expected, arr)
    }
}
