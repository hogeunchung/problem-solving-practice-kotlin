package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _58__Length_of_Last_WordKtTest {
    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = lengthOfLastWord(s = "Hello World")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = lengthOfLastWord(s = "   fly me   to   the moon  ")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 6

        // When
        val actual = lengthOfLastWord(s = "luffy is still joyboy")

        // Then
        assertEquals(expected, actual)
    }
}
