package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3427Test {

    @Test
    fun test1() {
        // Given
        val expected = 11

        // When
        val actual = Solution3427().subarraySum(nums = intArrayOf(2, 3, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 13

        // When
        val actual = Solution3427().subarraySum(nums = intArrayOf(3, 1, 1, 2))

        // Then
        assertEquals(expected, actual)
    }
}
