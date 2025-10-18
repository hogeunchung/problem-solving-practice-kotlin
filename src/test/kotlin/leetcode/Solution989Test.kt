package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution989Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(1, 2, 3, 4)

        // When
        val actual = Solution989().addToArrayForm(num = intArrayOf(1, 2, 0, 0), k = 34)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(4, 5, 5)

        // When
        val actual = Solution989().addToArrayForm(num = intArrayOf(2, 7, 4), k = 181)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(1, 0, 2, 1)

        // When
        val actual = Solution989().addToArrayForm(num = intArrayOf(2, 1, 5), k = 806)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = listOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        // When
        val actual = Solution989().addToArrayForm(num = intArrayOf(9, 9, 9, 9, 9, 9, 9, 9, 9, 9), k = 1)

        // Then
        assertEquals(expected, actual)
    }
}
