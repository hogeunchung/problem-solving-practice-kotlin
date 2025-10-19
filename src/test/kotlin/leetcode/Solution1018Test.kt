package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution1018Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(true, false, false)

        // When
        val actual = Solution1018().prefixesDivBy5(nums = intArrayOf(0, 1, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(false, false, false)

        // When
        val actual = Solution1018().prefixesDivBy5(nums = intArrayOf(1, 1, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(false, false, false, false, false, false, false, false, false)

        // When
        val actual = Solution1018().prefixesDivBy5(nums = intArrayOf(1, 1, 0, 0, 0, 1, 0, 0, 1))

        // Then
        assertEquals(expected, actual)
    }
}
