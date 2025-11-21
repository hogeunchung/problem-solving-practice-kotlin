package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1979Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution1979().findGCD(nums = intArrayOf(2, 5, 6, 9, 10))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution1979().findGCD(nums = intArrayOf(7, 5, 6, 8, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = Solution1979().findGCD(nums = intArrayOf(3, 3))

        // Then
        assertEquals(expected, actual)
    }
}
