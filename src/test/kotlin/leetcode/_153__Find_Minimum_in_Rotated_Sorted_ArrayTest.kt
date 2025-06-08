package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _153__Find_Minimum_in_Rotated_Sorted_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = findMin(nums = intArrayOf(3, 4, 5, 1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = findMin(nums = intArrayOf(4, 5, 6, 7, 0, 1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 11

        // When
        val actual = findMin(nums = intArrayOf(11, 13, 15, 17))

        // Then
        assertEquals(expected, actual)
    }
}
