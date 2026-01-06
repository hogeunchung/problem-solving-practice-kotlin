package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3502Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(5, 3, 3, 1, 1, 1)

        // When
        val actual = Solution3502().minCosts(cost = intArrayOf(5, 3, 4, 1, 3, 2))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 1, 1, 1, 1)

        // When
        val actual = Solution3502().minCosts(cost = intArrayOf(1, 2, 4, 6, 7))

        // Then
        assertArrayEquals(expected, actual)
    }
}
