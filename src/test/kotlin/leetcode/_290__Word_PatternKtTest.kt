package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _290__Word_PatternKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = wordPattern(pattern = "abba", s = "dog cat cat dog")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = false

        // Act
        val actual = wordPattern(pattern = "abba", s = "dog cat cat fish")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = false

        // Act
        val actual = wordPattern(pattern = "aaaa", s = "dog cat cat dog")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = false

        // Act
        val actual = wordPattern(pattern = "abba", s = "dog dog dog dog")

        // Assert
        assertEquals(expected, actual)
    }
}
