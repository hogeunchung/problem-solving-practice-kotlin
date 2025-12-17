package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1572Test {

    @Test
    fun test1() {
        // Given
        val expected = 25

        // When
        val actual = Solution1572().diagonalSum(
            mat = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 8

        // When
        val actual = Solution1572().diagonalSum(
            mat = arrayOf(
                intArrayOf(1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 5

        // When
        val actual = Solution1572().diagonalSum(
            mat = arrayOf(
                intArrayOf(5),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
