package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2176Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution2176().countPairs(nums = intArrayOf(3, 1, 2, 2, 2, 1, 3), k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2176().countPairs(nums = intArrayOf(1, 2, 3, 4), k = 1)

        // Then
        assertEquals(expected, actual)
    }
}
