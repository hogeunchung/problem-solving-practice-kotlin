package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1002__Find_Common_CharactersTest {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf("e", "l", "l")

        // When
        val actual = commonChars(words = arrayOf("bella", "label", "roller"))

        // Then
        assertEquals(expected.size, actual.size)
        (0 until expected.size).forEach { expected[it] == actual[it] }
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf("c", "o")

        // When
        val actual = commonChars(words = arrayOf("cool", "lock", "cook"))

        // Then
        assertEquals(expected.size, actual.size)
        (0 until expected.size).forEach { expected[it] == actual[it] }
    }
}
