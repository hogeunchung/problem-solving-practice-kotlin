package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _796__Rotate_StringTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = rotateString(s = "abcde", goal = "cdeab")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = rotateString(s = "abcde", goal = "abced")

        // Then
        assertEquals(expected, actual)
    }
}
