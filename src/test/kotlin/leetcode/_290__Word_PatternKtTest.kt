package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _290__Word_PatternKtTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = wordPattern(pattern = "abba", s = "dog cat cat dog")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = wordPattern(pattern = "abba", s = "dog cat cat fish")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = wordPattern(pattern = "aaaa", s = "dog cat cat dog")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = false

        // When
        val actual = wordPattern(pattern = "abba", s = "dog dog dog dog")

        // Then
        assertEquals(expected, actual)
    }
}
