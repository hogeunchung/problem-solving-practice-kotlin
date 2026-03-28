package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2553Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(1, 3, 2, 5, 8, 3, 7, 7)

        // When
        val actual = Solution2553().separateDigits(nums = intArrayOf(13, 25, 83, 77))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(7, 1, 3, 9)

        // When
        val actual = Solution2553().separateDigits(nums = intArrayOf(7, 1, 3, 9))

        // Then
        assertArrayEquals(expected, actual)
    }
}
