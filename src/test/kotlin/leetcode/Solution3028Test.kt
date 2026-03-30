package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3028Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution3028().returnToBoundaryCount(nums = intArrayOf(2, 3, -5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution3028().returnToBoundaryCount(nums = intArrayOf(3, 2, -3, -4))

        // Then
        assertEquals(expected, actual)
    }
}
