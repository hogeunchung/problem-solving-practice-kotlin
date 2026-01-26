package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3065Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution3065().minOperations(nums = intArrayOf(2, 11, 10, 1, 3), k = 10)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution3065().minOperations(nums = intArrayOf(1, 1, 2, 4, 9), k = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 4

        // When
        val actual = Solution3065().minOperations(nums = intArrayOf(1, 1, 2, 4, 9), k = 9)

        // Then
        assertEquals(expected, actual)
    }
}
