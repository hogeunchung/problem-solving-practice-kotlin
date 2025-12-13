package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2974Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(3, 2, 5, 4)

        // When
        val actual = Solution2974().numberGame(nums = intArrayOf(5, 4, 2, 3))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(5, 2)

        // When
        val actual = Solution2974().numberGame(nums = intArrayOf(2, 5))

        // Then
        assertArrayEquals(expected, actual)
    }
}
