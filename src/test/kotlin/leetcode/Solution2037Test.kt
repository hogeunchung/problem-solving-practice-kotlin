package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2037Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution2037().minMovesToSeat(
            seats = intArrayOf(3, 1, 5),
            students = intArrayOf(2, 7, 4),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 7

        // When
        val actual = Solution2037().minMovesToSeat(
            seats = intArrayOf(4, 1, 5, 9),
            students = intArrayOf(1, 3, 2, 6),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 4

        // When
        val actual = Solution2037().minMovesToSeat(
            seats = intArrayOf(2, 2, 6, 6),
            students = intArrayOf(1, 3, 2, 6),
        )

        // Then
        assertEquals(expected, actual)
    }
}
