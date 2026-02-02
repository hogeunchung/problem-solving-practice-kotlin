package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2006Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution2006().countKDifference(nums = intArrayOf(1, 2, 2, 1), k = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2006().countKDifference(nums = intArrayOf(1, 3), k = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = Solution2006().countKDifference(nums = intArrayOf(3, 2, 1, 5, 4), k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
