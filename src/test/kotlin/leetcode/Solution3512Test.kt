package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution3512Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution3512().minOperations(nums = intArrayOf(3, 9, 7), k = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution3512().minOperations(nums = intArrayOf(4, 1, 3), k = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 5

        // When
        val actual = Solution3512().minOperations(nums = intArrayOf(3, 2), k = 6)

        // Then
        assertEquals(expected, actual)
    }
}
