package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _868__Binary_GapTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = binaryGap(n = 22)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = binaryGap(n = 8)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 2

        // When
        val actual = binaryGap(n = 5)

        // Then
        assertEquals(expected, actual)
    }
}
