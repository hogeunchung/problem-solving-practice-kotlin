package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1636Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(3, 1, 1, 2, 2, 2)

        // When
        val actual = Solution1636().frequencySort(nums = intArrayOf(1, 1, 2, 2, 2, 3))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 3, 3, 2, 2)

        // When
        val actual = Solution1636().frequencySort(nums = intArrayOf(2, 3, 1, 3, 2))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(5, -1, 4, 4, -6, -6, 1, 1, 1)

        // When
        val actual = Solution1636().frequencySort(nums = intArrayOf(-1, 1, -6, 4, 5, -6, 1, 4, 1))

        // Then
        assertArrayEquals(expected, actual)
    }
}
