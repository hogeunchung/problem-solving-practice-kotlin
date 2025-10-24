package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1351Test {

    @Test
    fun test1() {
        // Given
        val expected = 8

        // When
        val actual = Solution1351().countNegatives(
            grid = arrayOf(
                intArrayOf(4, 3, 2, -1),
                intArrayOf(3, 2, 1, -1),
                intArrayOf(1, 1, -1, -2),
                intArrayOf(-1, -1, -2, -3),
            )
        )
        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution1351().countNegatives(
            grid = arrayOf(
                intArrayOf(3, 2),
                intArrayOf(1, 0),
            )
        )
        // Then
        assertEquals(expected, actual)
    }
}
