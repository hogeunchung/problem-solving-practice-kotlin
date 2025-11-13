package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2190Test {

    @Test
    fun test1() {
        // Given
        val expected = 100

        // When
        val actual = Solution2190().mostFrequent(nums = intArrayOf(1, 100, 200, 1, 100), key = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution2190().mostFrequent(nums = intArrayOf(2, 2, 2, 2, 3), key = 2)

        // Then
        assertEquals(expected, actual)
    }
}
