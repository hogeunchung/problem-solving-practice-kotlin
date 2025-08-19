package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class `_274__H-IndexTest` {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = hIndex(citations = intArrayOf(3, 0, 6, 1, 5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = hIndex(citations = intArrayOf(1, 3, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = hIndex(citations = intArrayOf(100))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = 1

        // When
        val actual = hIndex(citations = intArrayOf(0, 0, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = 2

        // When
        val actual = hIndex(citations = intArrayOf(11, 15))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test6() {
        // Given
        val expected = 3

        // When
        val actual = hIndex(citations = intArrayOf(1, 7, 9, 4))

        // Then
        assertEquals(expected, actual)
    }
}
