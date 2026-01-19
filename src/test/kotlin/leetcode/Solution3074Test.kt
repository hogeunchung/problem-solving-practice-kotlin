package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3074Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution3074().minimumBoxes(apple = intArrayOf(1, 3, 2), capacity = intArrayOf(4, 3, 1, 5, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = Solution3074().minimumBoxes(apple = intArrayOf(5, 5, 5), capacity = intArrayOf(2, 4, 2, 7))

        // Then
        assertEquals(expected, actual)
    }
}
