package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2161Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(9, 5, 3, 10, 10, 12, 14)

        // When
        val actual = Solution2161().pivotArray(nums = intArrayOf(9, 12, 5, 10, 14, 3, 10), pivot = 10)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(-3, 2, 4, 3)

        // When
        val actual = Solution2161().pivotArray(nums = intArrayOf(-3, 4, 3, 2), pivot = 2)

        // Then
        assertArrayEquals(expected, actual)
    }
}
