package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution914Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution914().hasGroupsSizeX(deck = intArrayOf(1, 2, 3, 4, 4, 3, 2, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution914().hasGroupsSizeX(deck = intArrayOf(1, 1, 1, 2, 2, 2, 3, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = Solution914().hasGroupsSizeX(deck = intArrayOf(0, 0, 0, 1, 1, 1, 2, 2, 2))

        // Then
        assertEquals(expected, actual)
    }
}
