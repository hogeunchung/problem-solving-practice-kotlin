package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _139__Word_BreakTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = wordBreak(s = "leetcode", wordDict = listOf("leet", "code"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = wordBreak(s = "applepenapple", wordDict = listOf("apple", "pen"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = wordBreak(s = "catsandog", wordDict = listOf("cats", "dog", "sand", "and", "cat"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = false

        // When
        val actual = wordBreak(s = "aaaaaaa", wordDict = listOf("aaaa", "aa"))

        // Then
        assertEquals(expected, actual)
    }
}
