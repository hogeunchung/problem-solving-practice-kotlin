package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3467Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 0, 1, 1)

        // When
        val actual = Solution3467().transformArray(nums = intArrayOf(4, 3, 2, 1))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(0, 0, 1, 1, 1)

        // When
        val actual = Solution3467().transformArray(nums = intArrayOf(1, 5, 1, 4, 2))

        // Then
        assertArrayEquals(expected, actual)
    }
}
