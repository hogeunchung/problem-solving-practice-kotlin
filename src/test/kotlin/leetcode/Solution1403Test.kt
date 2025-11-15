package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1403Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(10, 9)

        // When
        val actual = Solution1403().minSubsequence(nums = intArrayOf(4, 3, 10, 9, 8))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(7, 7, 6)

        // When
        val actual = Solution1403().minSubsequence(nums = intArrayOf(4, 4, 7, 6, 7))

        // Then
        assertEquals(expected, actual)
    }
}
