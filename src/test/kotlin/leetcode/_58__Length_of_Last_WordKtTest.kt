package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _58__Length_of_Last_WordKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = 5

        // Act
        val actual = lengthOfLastWord(s = "Hello World")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 4

        // Act
        val actual = lengthOfLastWord(s = "   fly me   to   the moon  ")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 6

        // Act
        val actual = lengthOfLastWord(s = "luffy is still joyboy")

        // Assert
        assertEquals(expected, actual)
    }
}
