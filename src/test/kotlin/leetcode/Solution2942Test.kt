package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution2942Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(0, 1)

        // When
        val actual = Solution2942().findWordsContaining(words = arrayOf("leet", "code"), x = 'e')

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(0, 2)

        // When
        val actual = Solution2942().findWordsContaining(words = arrayOf("abc", "bcd", "aaaa", "cbc"), x = 'a')

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = emptyList<Int>()

        // When
        val actual = Solution2942().findWordsContaining(words = arrayOf("abc", "bcd", "aaaa", "cbc"), x = 'z')

        // Then
        assertEquals(expected, actual)
    }
}
