package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1863Test {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = Solution1863().subsetXORSum(nums = intArrayOf(1, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 28

        // When
        val actual = Solution1863().subsetXORSum(nums = intArrayOf(5, 1, 6))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 480

        // When
        val actual = Solution1863().subsetXORSum(nums = intArrayOf(3, 4, 5, 6, 7, 8))

        // Then
        assertEquals(expected, actual)
    }
}
