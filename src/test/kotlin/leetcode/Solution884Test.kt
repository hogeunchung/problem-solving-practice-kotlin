package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution884Test {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf("sweet", "sour")

        // When
        val actual = Solution884().uncommonFromSentences(s1 = "this apple is sweet", s2 = "this apple is sour")

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf("banana")

        // When
        val actual = Solution884().uncommonFromSentences(s1 = "apple apple", s2 = "banana")

        // Then
        assertArrayEquals(expected, actual)
    }
}
