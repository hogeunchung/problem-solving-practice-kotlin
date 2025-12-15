package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2108Test {

    @Test
    fun test1() {
        // Given
        val expected = "ada"

        // When
        val actual = Solution2108().firstPalindrome(words = arrayOf("abc", "car", "ada", "racecar", "cool"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "racecar"

        // When
        val actual = Solution2108().firstPalindrome(words = arrayOf("notapalindrome", "racecar"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = ""

        // When
        val actual = Solution2108().firstPalindrome(words = arrayOf("def", "ghi"))

        // Then
        assertEquals(expected, actual)
    }
}
