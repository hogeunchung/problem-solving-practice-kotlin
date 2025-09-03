package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _674__Longest_Continuous_Increasing_SubsequenceTest {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = findLengthOfLCIS(nums = intArrayOf(1, 3, 5, 4, 7))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = findLengthOfLCIS(nums = intArrayOf(2, 2, 2, 2, 2))

        // Then
        assertEquals(expected, actual)
    }
}
