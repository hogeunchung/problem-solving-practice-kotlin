package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _125__Valid_PalindromeKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = isPalindrome(s = "A man, a plan, a canal: Panama")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = false

        // Act
        val actual = isPalindrome(s = "race a car")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = true

        // Act
        val actual = isPalindrome(s = " ")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = false

        // Act
        val actual = isPalindrome(s = "0P")

        // Assert
        assertEquals(expected, actual)
    }
}
