package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _917__Reverse_Only_LettersKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = "dc-ba"

        // Act
        val actual = reverseOnlyLetters(s = "ab-cd")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = "j-Ih-gfE-dCba"

        // Act
        val actual = reverseOnlyLetters(s = "a-bC-dEf-ghIj")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = "Qedo1ct-eeLg=ntse-T!"

        // Act
        val actual = reverseOnlyLetters(s = "Test1ng-Leet=code-Q!")

        // Assert
        assertEquals(expected, actual)
    }
}
