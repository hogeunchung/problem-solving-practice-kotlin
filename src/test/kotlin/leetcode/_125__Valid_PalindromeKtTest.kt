package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _125__Valid_PalindromeKtTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isPalindrome(s = "A man, a plan, a canal: Panama")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = isPalindrome(s = "race a car")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = isPalindrome(s = " ")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = false

        // When
        val actual = isPalindrome(s = "0P")

        // Then
        assertEquals(expected, actual)
    }
}
