package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1637Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1637().maxWidthOfVerticalArea(
            points = arrayOf(
                intArrayOf(8, 7),
                intArrayOf(9, 9),
                intArrayOf(7, 4),
                intArrayOf(9, 7),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution1637().maxWidthOfVerticalArea(
            points = arrayOf(
                intArrayOf(3, 1),
                intArrayOf(9, 0),
                intArrayOf(1, 0),
                intArrayOf(1, 4),
                intArrayOf(5, 3),
                intArrayOf(8, 8),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
