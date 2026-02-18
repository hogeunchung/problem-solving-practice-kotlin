package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2293Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution2293().minMaxGame(nums = intArrayOf(1, 3, 5, 2, 4, 8, 2, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution2293().minMaxGame(nums = intArrayOf(3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 40

        // When
        val actual = Solution2293().minMaxGame(nums = intArrayOf(93, 40))

        // Then
        assertEquals(expected, actual)
    }
}
