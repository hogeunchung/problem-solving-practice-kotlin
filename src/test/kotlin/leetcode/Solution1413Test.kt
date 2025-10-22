package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution1413Test {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = Solution1413().minStartValue(nums = intArrayOf(-3, 2, -3, 4, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution1413().minStartValue(nums = intArrayOf(1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 5

        // When
        val actual = Solution1413().minStartValue(nums = intArrayOf(1, -2, -3))

        // Then
        assertEquals(expected, actual)
    }
}
