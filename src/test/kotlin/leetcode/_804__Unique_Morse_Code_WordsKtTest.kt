package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _804__Unique_Morse_Code_WordsKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 2

        // Act
        val actual = uniqueMorseRepresentations(words = arrayOf("gin", "zen", "gig", "msg"))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 1

        // Act
        val actual = uniqueMorseRepresentations(words = arrayOf("a"))

        // Assert
        assertEquals(expected, actual)
    }
}
