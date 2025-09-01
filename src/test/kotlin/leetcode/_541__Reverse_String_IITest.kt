package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _541__Reverse_String_IITest {

    @Test
    fun test1() {
        // Given
        val expected = "bacdfeg"

        // When
        val actual = reverseStr(s = "abcdefg", k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "bacd"

        // When
        val actual = reverseStr(s = "abcd", k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
