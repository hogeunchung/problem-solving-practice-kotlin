package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2215Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(listOf(1, 3), listOf(4, 6))

        // When
        val actual = Solution2215().findDifference(nums1 = intArrayOf(1, 2, 3), nums2 = intArrayOf(2, 4, 6))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(listOf(3), listOf())

        // When
        val actual = Solution2215().findDifference(nums1 = intArrayOf(1, 2, 3, 3), nums2 = intArrayOf(1, 1, 2, 2))

        // Then
        assertEquals(expected, actual)
    }
}
