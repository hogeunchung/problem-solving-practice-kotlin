package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2367Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution2367().arithmeticTriplets(nums = intArrayOf(0, 1, 4, 6, 7, 10), diff = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution2367().arithmeticTriplets(nums = intArrayOf(4, 5, 6, 7, 8, 9), diff = 2)

        // Then
        assertEquals(expected, actual)
    }
}
