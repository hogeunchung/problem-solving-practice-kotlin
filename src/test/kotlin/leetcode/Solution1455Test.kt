package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1455Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution1455().isPrefixOfWord(sentence = "i love eating burger", searchWord = "burg")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution1455().isPrefixOfWord(sentence = "this problem is an easy problem", searchWord = "pro")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -1

        // When
        val actual = Solution1455().isPrefixOfWord(sentence = "i am tired", searchWord = "you")

        // Then
        assertEquals(expected, actual)
    }
}
