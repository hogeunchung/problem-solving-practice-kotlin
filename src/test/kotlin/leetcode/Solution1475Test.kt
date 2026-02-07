package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1475Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(4, 2, 4, 2, 3)

        // When
        val actual = Solution1475().finalPrices(prices = intArrayOf(8, 4, 6, 2, 3))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 2, 3, 4, 5)

        // When
        val actual = Solution1475().finalPrices(prices = intArrayOf(1, 2, 3, 4, 5))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(9, 0, 1, 6)

        // When
        val actual = Solution1475().finalPrices(prices = intArrayOf(10, 1, 1, 6))

        // Then
        assertArrayEquals(expected, actual)
    }
}
