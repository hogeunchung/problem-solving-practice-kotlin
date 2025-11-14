package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2124Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution2124().checkString(s = "aaabbb")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution2124().checkString(s = "abab")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = Solution2124().checkString(s = "bbb")

        // Then
        assertEquals(expected, actual)
    }
}
