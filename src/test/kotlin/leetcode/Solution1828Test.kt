package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1828Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(3, 2, 2)

        // When
        val actual = Solution1828().countPoints(
            points = arrayOf(
                intArrayOf(1, 3),
                intArrayOf(3, 3),
                intArrayOf(5, 3),
                intArrayOf(2, 2),
            ),
            queries = arrayOf(
                intArrayOf(2, 3, 1),
                intArrayOf(4, 3, 1),
                intArrayOf(1, 1, 2),
            )
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(2, 3, 2, 4)

        // When
        val actual = Solution1828().countPoints(
            points = arrayOf(
                intArrayOf(1, 1),
                intArrayOf(2, 2),
                intArrayOf(3, 3),
                intArrayOf(4, 4),
                intArrayOf(5, 5),
            ),
            queries = arrayOf(
                intArrayOf(1, 2, 2),
                intArrayOf(2, 2, 2),
                intArrayOf(4, 3, 2),
                intArrayOf(4, 3, 3),
            )
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
