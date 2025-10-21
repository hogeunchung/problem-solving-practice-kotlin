package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution766Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution766().isToeplitzMatrix(
            matrix = arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 1, 2, 3),
                intArrayOf(9, 5, 1, 2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution766().isToeplitzMatrix(
            matrix = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }
}
