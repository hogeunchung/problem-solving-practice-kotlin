package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution807Test {

    @Test
    fun test1() {
        // Given
        val expected = 35

        // When
        val actual = Solution807().maxIncreaseKeepingSkyline(
            grid = arrayOf(
                intArrayOf(3, 0, 8, 4),
                intArrayOf(2, 4, 5, 7),
                intArrayOf(9, 2, 6, 3),
                intArrayOf(0, 3, 1, 0),
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
        val actual = Solution807().maxIncreaseKeepingSkyline(
            grid = arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
