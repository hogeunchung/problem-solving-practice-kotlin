package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1266Test {

    @Test
    fun test1() {
        // Given
        val expected = 7

        // When
        val actual = Solution1266().minTimeToVisitAllPoints(
            points = arrayOf(
                intArrayOf(1, 1),
                intArrayOf(3, 4),
                intArrayOf(-1, 0),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
    @Test
    fun test2() {
        // Given
        val expected = 5

        // When
        val actual = Solution1266().minTimeToVisitAllPoints(
            points = arrayOf(
                intArrayOf(3, 2),
                intArrayOf(-2, 2),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
