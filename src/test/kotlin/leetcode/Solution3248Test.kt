package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3248Test {

    @Test
    fun test1() {
        // Given
        val expected = 3
        // When
        val actual = Solution3248().finalPositionOfSnake(n = 2, commands = listOf("RIGHT", "DOWN"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1
        // When
        val actual = Solution3248().finalPositionOfSnake(n = 3, commands = listOf("DOWN", "RIGHT", "UP"))

        // Then
        assertEquals(expected, actual)
    }
}
