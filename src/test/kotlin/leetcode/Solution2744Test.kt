package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2744Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution2744().maximumNumberOfStringPairs(words = arrayOf("cd", "ac", "dc", "ca", "zz"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution2744().maximumNumberOfStringPairs(words = arrayOf("ab", "ba", "cc"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution2744().maximumNumberOfStringPairs(words = arrayOf("aa", "ab"))

        // Then
        assertEquals(expected, actual)
    }
}
