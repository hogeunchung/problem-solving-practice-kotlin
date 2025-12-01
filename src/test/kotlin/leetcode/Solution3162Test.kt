package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3162Test {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = Solution3162().numberOfPairs(nums1 = intArrayOf(1, 3, 4), nums2 = intArrayOf(1, 3, 4), k = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution3162().numberOfPairs(nums1 = intArrayOf(1, 2, 4, 12), nums2 = intArrayOf(2, 4), k = 3)

        // Then
        assertEquals(expected, actual)
    }
}
