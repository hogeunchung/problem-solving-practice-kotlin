package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3131Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution3131().addedInteger(nums1 = intArrayOf(2, 6, 4), nums2 = intArrayOf(9, 7, 5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = -5

        // When
        val actual = Solution3131().addedInteger(nums1 = intArrayOf(10), nums2 = intArrayOf(5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution3131().addedInteger(nums1 = intArrayOf(1, 1, 1, 1), nums2 = intArrayOf(1, 1, 1, 1))

        // Then
        assertEquals(expected, actual)
    }
}
