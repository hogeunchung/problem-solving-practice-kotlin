package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _804__Unique_Morse_Code_WordsKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = uniqueMorseRepresentations(words = arrayOf("gin", "zen", "gig", "msg"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = uniqueMorseRepresentations(words = arrayOf("a"))

        // Then
        assertEquals(expected, actual)
    }
}
