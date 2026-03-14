package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3264Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(8, 4, 6, 5, 6)

        // When
        val actual = Solution3264().getFinalState(nums = intArrayOf(2, 1, 3, 5, 6), k = 5, multiplier = 2)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(16, 8)

        // When
        val actual = Solution3264().getFinalState(nums = intArrayOf(1, 2), k = 3, multiplier = 4)

        // Then
        assertArrayEquals(expected, actual)
    }
}
