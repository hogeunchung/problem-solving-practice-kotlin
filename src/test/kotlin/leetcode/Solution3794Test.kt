package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3794Test {

    @Test
    fun test1() {
        // Given
        val expected = "bacd"

        // When
        val actual = Solution3794().reversePrefix(s = "abcd", k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "zyx"

        // When
        val actual = Solution3794().reversePrefix(s = "xyz", k = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "hey"

        // When
        val actual = Solution3794().reversePrefix(s = "hey", k = 1)

        // Then
        assertEquals(expected, actual)
    }
}
