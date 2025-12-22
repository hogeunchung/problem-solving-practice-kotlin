package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1464Test {

    @Test
    fun test1() {
        // Given
        val expected = 12

        // When
        val actual = Solution1464().maxProduct(nums = intArrayOf(3, 4, 5, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 16

        // When
        val actual = Solution1464().maxProduct(nums = intArrayOf(1, 5, 4, 5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 12

        // When
        val actual = Solution1464().maxProduct(nums = intArrayOf(3, 7))

        // Then
        assertEquals(expected, actual)
    }
}
