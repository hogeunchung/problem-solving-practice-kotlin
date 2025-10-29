package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1332Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1332().removePalindromeSub(s = "ababa")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution1332().removePalindromeSub(s = "abb")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 2

        // When
        val actual = Solution1332().removePalindromeSub(s = "baabb")

        // Then
        assertEquals(expected, actual)
    }
}
