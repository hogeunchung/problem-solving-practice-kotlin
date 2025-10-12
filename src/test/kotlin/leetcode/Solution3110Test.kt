package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution3110Test {

    @Test
    fun test1() {
        // Given
        val expected = 13

        // When
        val actual = Solution3110().scoreOfString(s = "hello")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 50

        // When
        val actual = Solution3110().scoreOfString(s = "zaz")

        // Then
        assertEquals(expected, actual)
    }
}
