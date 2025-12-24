package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1652Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(12, 10, 16, 13)

        // When
        val actual = Solution1652().decrypt(code = intArrayOf(5, 7, 1, 4), k = 3)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(0, 0, 0, 0)

        // When
        val actual = Solution1652().decrypt(code = intArrayOf(1, 2, 3, 4), k = 0)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(12, 5, 6, 13)

        // When
        val actual = Solution1652().decrypt(code = intArrayOf(2, 4, 9, 3), k = -2)

        // Then
        assertArrayEquals(expected, actual)
    }
}
