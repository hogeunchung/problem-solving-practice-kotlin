package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1252Test {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = Solution1252().oddCells(m = 2, n = 3, indices = arrayOf(intArrayOf(0, 1), intArrayOf(1, 1)))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution1252().oddCells(m = 2, n = 2, indices = arrayOf(intArrayOf(1, 1), intArrayOf(0, 0)))

        // Then
        assertEquals(expected, actual)
    }
}
