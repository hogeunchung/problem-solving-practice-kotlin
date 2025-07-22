package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _977__Squares_of_a_Sorted_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 1, 9, 16, 100)

        // When
        val actual = sortedSquares(nums = intArrayOf(-4, -1, 0, 3, 10))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(4, 9, 9, 49, 121)

        // When
        val actual = sortedSquares(nums = intArrayOf(-7, -3, 2, 3, 11))

        // Then
        assertArrayEquals(expected, actual)
    }
}
