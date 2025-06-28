package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _2099__Find_Subsequence_of_Length_K_With_the_Largest_SumTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(3, 3)

        // When
        val actual = maxSubsequence(nums = intArrayOf(2, 1, 3, 3), k = 2)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(-1, 3, 4)

        // When
        val actual = maxSubsequence(nums = intArrayOf(-1, -2, 3, 4), k = 3)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(3, 4)

        // When
        val actual = maxSubsequence(nums = intArrayOf(3, 4, 3, 3), k = 2)

        // Then
        assertArrayEquals(expected, actual)
    }
}
