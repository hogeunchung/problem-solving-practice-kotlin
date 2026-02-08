package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3432Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution3432().countPartitions(nums = intArrayOf(10, 10, 3, 7, 6))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution3432().countPartitions(nums = intArrayOf(1, 2, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = Solution3432().countPartitions(nums = intArrayOf(2, 4, 6, 8))

        // Then
        assertEquals(expected, actual)
    }
}
