package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _697__Degree_of_an_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = findShortestSubArray(nums = intArrayOf(1, 2, 2, 3, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 6

        // When
        val actual = findShortestSubArray(nums = intArrayOf(1, 2, 2, 3, 1, 4, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = findShortestSubArray(nums = intArrayOf(1))

        // Then
        assertEquals(expected, actual)
    }
}
