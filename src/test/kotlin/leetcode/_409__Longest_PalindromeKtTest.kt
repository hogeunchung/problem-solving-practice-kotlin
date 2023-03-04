package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _409__Longest_PalindromeKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 7

        // Act
        val actual = leetcode.longestPalindrome("abccccdd")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 1

        // Act
        val actual = leetcode.longestPalindrome("a")

        // Assert
        assertEquals(expected, actual)
    }
}
