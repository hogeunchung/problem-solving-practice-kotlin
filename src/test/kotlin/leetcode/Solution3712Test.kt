package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3712Test {

    @Test
    fun test1() {
        // Given
        val expected = 16

        // When
        val actual = Solution3712().sumDivisibleByK(nums = intArrayOf(1, 2, 2, 3, 3, 3, 3, 4), k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution3712().sumDivisibleByK(nums = intArrayOf(1, 2, 3, 4, 5), k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 12

        // When
        val actual = Solution3712().sumDivisibleByK(nums = intArrayOf(4, 4, 4, 1, 2, 3), k = 3)

        // Then
        assertEquals(expected, actual)
    }
}
