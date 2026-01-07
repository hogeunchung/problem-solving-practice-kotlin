package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1827Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution1827().minOperations(nums = intArrayOf(1, 1, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 14

        // When
        val actual = Solution1827().minOperations(nums = intArrayOf(1, 5, 2, 4, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution1827().minOperations(nums = intArrayOf(8))

        // Then
        assertEquals(expected, actual)
    }
}
