package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3658Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution3658().gcdOfOddEvenSums(n = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 5

        // When
        val actual = Solution3658().gcdOfOddEvenSums(n = 5)

        // Then
        assertEquals(expected, actual)
    }
}
