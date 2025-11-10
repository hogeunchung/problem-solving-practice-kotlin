package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1534Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution1534().countGoodTriplets(arr = intArrayOf(3, 0, 1, 1, 9, 7), a = 7, b = 2, c = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution1534().countGoodTriplets(arr = intArrayOf(1, 1, 2, 2, 3), a = 0, b = 0, c = 1)

        // Then
        assertEquals(expected, actual)
    }
}
