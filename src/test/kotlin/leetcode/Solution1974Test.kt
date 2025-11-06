package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1974Test {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = Solution1974().minTimeToType(word = "abc")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 7

        // When
        val actual = Solution1974().minTimeToType(word = "bza")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 34

        // When
        val actual = Solution1974().minTimeToType(word = "zjpc")

        // Then
        assertEquals(expected, actual)
    }
}
