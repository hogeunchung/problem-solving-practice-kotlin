package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _917__Reverse_Only_LettersKtTest {

    @Test
    fun test1() {
        // Given
        val expected = "dc-ba"

        // When
        val actual = reverseOnlyLetters(s = "ab-cd")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "j-Ih-gfE-dCba"

        // When
        val actual = reverseOnlyLetters(s = "a-bC-dEf-ghIj")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "Qedo1ct-eeLg=ntse-T!"

        // When
        val actual = reverseOnlyLetters(s = "Test1ng-Leet=code-Q!")

        // Then
        assertEquals(expected, actual)
    }
}
