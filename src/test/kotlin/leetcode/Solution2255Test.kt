package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2255Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution2255().countPrefixes(words = arrayOf("a", "b", "c", "ab", "bc", "abc"), s = "abc")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution2255().countPrefixes(words = arrayOf("a", "a"), s = "aa")

        // Then
        assertEquals(expected, actual)
    }
}
