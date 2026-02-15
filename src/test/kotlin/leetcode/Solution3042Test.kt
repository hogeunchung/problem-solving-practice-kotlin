package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3042Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution3042().countPrefixSuffixPairs(arrayOf("a", "aba", "ababa", "aa"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution3042().countPrefixSuffixPairs(arrayOf("pa", "papa", "ma", "mama"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution3042().countPrefixSuffixPairs(arrayOf("abab", "ab"))

        // Then
        assertEquals(expected, actual)
    }
}
