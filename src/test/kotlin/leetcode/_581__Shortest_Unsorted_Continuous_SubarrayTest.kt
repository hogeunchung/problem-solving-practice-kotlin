package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _581__Shortest_Unsorted_Continuous_SubarrayTest {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = findUnsortedSubarray(nums = intArrayOf(2, 6, 4, 8, 10, 9, 15))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = findUnsortedSubarray(nums = intArrayOf(1, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = findUnsortedSubarray(nums = intArrayOf(1))

        // Then
        assertEquals(expected, actual)
    }
}
