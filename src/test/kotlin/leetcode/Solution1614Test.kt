package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1614Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution1614().maxDepth(s = "(1+(2*3)+((8)/4))+1")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution1614().maxDepth(s = "(1)+((2))+(((3)))")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = Solution1614().maxDepth(s = "()(())((()()))")

        // Then
        assertEquals(expected, actual)
    }
}
