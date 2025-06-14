package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1005__Maximize_Sum_Of_Array_After_K_NegationsTest {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = largestSumAfterKNegations(nums = intArrayOf(4, 2, 3), k = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 6

        // When
        val actual = largestSumAfterKNegations(nums = intArrayOf(3, -1, 0, 2), k = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 13

        // When
        val actual = largestSumAfterKNegations(nums = intArrayOf(2, -3, -1, 5, -4), k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
