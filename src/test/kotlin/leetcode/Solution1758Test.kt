package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1758Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1758().minOperations(s = "0100")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution1758().minOperations(s = "0")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 2

        // When
        val actual = Solution1758().minOperations(s = "1111")

        // Then
        assertEquals(expected, actual)
    }
}
