package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3190Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution3190().minimumOperations(nums = intArrayOf(1, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution3190().minimumOperations(nums = intArrayOf(3, 6, 9))

        // Then
        assertEquals(expected, actual)
    }
}
