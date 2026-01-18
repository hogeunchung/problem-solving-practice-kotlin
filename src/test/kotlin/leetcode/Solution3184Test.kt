package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3184Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution3184().countCompleteDayPairs(hours = intArrayOf(12, 12, 30, 24, 24))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution3184().countCompleteDayPairs(hours = intArrayOf(72, 48, 24, 3))

        // Then
        assertEquals(expected, actual)
    }
}
