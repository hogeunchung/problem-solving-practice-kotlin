package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1984__Minimum_Difference_Between_Highest_and_Lowest_of_K_ScoresTest {

    @Test
    fun test1() {
        // Given
        val expected = 0

        // When
        val actual = minimumDifference(nums = intArrayOf(90), k = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = minimumDifference(nums = intArrayOf(9, 4, 1, 7), k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
