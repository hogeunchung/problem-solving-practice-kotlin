package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution496Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(-1, 3, -1)

        // When
        val actual = Solution496().nextGreaterElement(nums1 = intArrayOf(4, 1, 2), nums2 = intArrayOf(1, 3, 4, 2))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(3, -1)

        // When
        val actual = Solution496().nextGreaterElement(nums1 = intArrayOf(2, 4), nums2 = intArrayOf(1, 2, 3, 4))

        // Then
        assertArrayEquals(expected, actual)
    }
}
