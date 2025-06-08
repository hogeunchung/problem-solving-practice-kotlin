package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _9__Palindrome_NumberTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isPalindrome(x = 121)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = isPalindrome(x = -121)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = isPalindrome(x = 10)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = false

        // When
        val actual = isPalindrome(x = 123)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = true

        // When
        val actual = isPalindrome(x = 11)

        // Then
        assertEquals(expected, actual)
    }
}
