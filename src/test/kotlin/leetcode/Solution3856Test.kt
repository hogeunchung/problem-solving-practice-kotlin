package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3856Test {

    @Test
    fun test1() {
        // Given
        val expected = "id"

        // When
        val actual = Solution3856().trimTrailingVowels(s = "idea")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "day"

        // When
        val actual = Solution3856().trimTrailingVowels(s = "day")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = ""

        // When
        val actual = Solution3856().trimTrailingVowels(s = "aeiou")

        // Then
        assertEquals(expected, actual)
    }
}
