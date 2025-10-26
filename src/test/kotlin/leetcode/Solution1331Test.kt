package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1331Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(4, 1, 2, 3)

        // When
        val actual = Solution1331().arrayRankTransform(arr = intArrayOf(40, 10, 20, 30))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 1, 1)

        // When
        val actual = Solution1331().arrayRankTransform(arr = intArrayOf(100, 100, 100))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(5, 3, 4, 2, 8, 6, 7, 1, 3)

        // When
        val actual = Solution1331().arrayRankTransform(arr = intArrayOf(37, 12, 28, 9, 100, 56, 80, 5, 12))

        // Then
        assertArrayEquals(expected, actual)
    }
}
