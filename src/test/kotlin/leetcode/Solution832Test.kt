package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution832Test {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1),
        )

        // When
        val actual = Solution832().flipAndInvertImage(
            image = arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0),
            )
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 0, 1),
            intArrayOf(1, 0, 1, 0),
        )

        // When
        val actual = Solution832().flipAndInvertImage(
            image = arrayOf(
                intArrayOf(1, 1, 0, 0),
                intArrayOf(1, 0, 0, 1),
                intArrayOf(0, 1, 1, 1),
                intArrayOf(1, 0, 1, 0),
            )
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
