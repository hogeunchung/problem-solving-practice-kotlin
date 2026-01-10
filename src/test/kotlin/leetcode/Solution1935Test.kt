package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1935Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1935().canBeTypedWords(text = "hello world", brokenLetters = "ad")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution1935().canBeTypedWords(text = "leet code", brokenLetters = "lt")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution1935().canBeTypedWords(text = "leet code", brokenLetters = "e")

        // Then
        assertEquals(expected, actual)
    }
}
