package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _409__Longest_PalindromeKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 7

        // When
        val actual = leetcode.longestPalindrome("abccccdd")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = leetcode.longestPalindrome("a")

        // Then
        assertEquals(expected, actual)
    }
}
