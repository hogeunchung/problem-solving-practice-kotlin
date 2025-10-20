package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution1021Test {

    @Test
    fun test1() {
        // Given
        val expected = "()()()"

        // When
        val actual = Solution1021().removeOuterParentheses(s = "(()())(())")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "()()()()(())"

        // When
        val actual = Solution1021().removeOuterParentheses(s = "(()())(())(()(()))")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = ""

        // When
        val actual = Solution1021().removeOuterParentheses(s = "()()")

        // Then
        assertEquals(expected, actual)
    }
}
