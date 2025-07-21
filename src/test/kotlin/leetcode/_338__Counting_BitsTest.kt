package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _338__Counting_BitsTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 1, 1)

        // When
        val actual = countBits(n = 2)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(0, 1, 1, 2, 1, 2)

        // When
        val actual = countBits(n = 5)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(0, 1, 1, 2, 1, 2, 2, 3, 1)

        // When
        val actual = countBits(n = 8)

        // Then
        assertArrayEquals(expected, actual)
    }
}
