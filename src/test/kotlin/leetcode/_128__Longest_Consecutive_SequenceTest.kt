package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _128__Longest_Consecutive_SequenceTest {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = longestConsecutive(nums = intArrayOf(100, 4, 200, 1, 3, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 9

        // When
        val actual = longestConsecutive(nums = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = longestConsecutive(nums = intArrayOf(1, 0, 1, 2))

        // Then
        assertEquals(expected, actual)
    }
}
