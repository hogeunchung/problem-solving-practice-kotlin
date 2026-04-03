package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2057Test {

    @Test
    fun test1() {
        // Given
        val expected = 0

        // When
        val actual = Solution2057().smallestEqual(nums = intArrayOf(0, 1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution2057().smallestEqual(nums = intArrayOf(4, 3, 2, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -1

        // When
        val actual = Solution2057().smallestEqual(nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0))

        // Then
        assertEquals(expected, actual)
    }
}
