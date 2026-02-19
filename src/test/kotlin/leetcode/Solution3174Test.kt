package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3174Test {

    @Test
    fun test1() {
        // Given
        val expected = "abc"

        // When
        val actual = Solution3174().clearDigits(s = "abc")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = ""

        // When
        val actual = Solution3174().clearDigits(s = "cb34")

        // Then
        assertEquals(expected, actual)
    }
}
