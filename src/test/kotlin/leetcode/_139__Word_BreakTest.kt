package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _139__Word_BreakTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = wordBreak(s = "leetcode", wordDict = listOf("leet", "code"))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = true

        // Act
        val actual = wordBreak(s = "applepenapple", wordDict = listOf("apple", "pen"))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = false

        // Act
        val actual = wordBreak(s = "catsandog", wordDict = listOf("cats", "dog", "sand", "and", "cat"))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = false

        // Act
        val actual = wordBreak(s = "aaaaaaa", wordDict = listOf("aaaa", "aa"))

        // Assert
        assertEquals(expected, actual)
    }
}
