package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _9__Palindrome_NumberTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = isPalindrome(x = 121)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = false

        // Act
        val actual = isPalindrome(x = -121)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = false

        // Act
        val actual = isPalindrome(x = 10)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = false

        // Act
        val actual = isPalindrome(x = 123)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Arrange
        val expected = true

        // Act
        val actual = isPalindrome(x = 11)

        // Assert
        assertEquals(expected, actual)
    }
}
