package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2341Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(3, 1)

        // When
        val actual = Solution2341().numberOfPairs(nums = intArrayOf(1, 3, 2, 1, 3, 2, 2))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 0)

        // When
        val actual = Solution2341().numberOfPairs(nums = intArrayOf(1, 1))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(0, 1)

        // When
        val actual = Solution2341().numberOfPairs(nums = intArrayOf(0))

        // Then
        assertArrayEquals(expected, actual)
    }
}
