package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1844__Replace_All_Digits_with_CharactersTest {

    @Test
    fun test1() {
        // Given
        val expected = "abcdef"

        // When
        val actual = replaceDigits(s = "a1c1e1")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "abbdcfdhe"

        // When
        val actual = replaceDigits(s = "a1b2c3d4e")

        // Then
        assertEquals(expected, actual)
    }
}
