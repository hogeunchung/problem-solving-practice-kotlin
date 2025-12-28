package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2824Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution2824().countPairs(nums = listOf(-1, 1, 2, 3, 1), target = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 10

        // When
        val actual = Solution2824().countPairs(nums = listOf(-6, 2, 5, -2, -7, -1, 3), target = -2)

        // Then
        assertEquals(expected, actual)
    }
}
