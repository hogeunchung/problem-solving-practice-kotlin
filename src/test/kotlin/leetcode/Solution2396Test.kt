package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2396Test {

    @Test
    fun test1() {
        // Given
        val expected = false

        // When
        val actual = Solution2396().isStrictlyPalindromic(n = 9)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution2396().isStrictlyPalindromic(n = 4)

        // Then
        assertEquals(expected, actual)
    }
}
