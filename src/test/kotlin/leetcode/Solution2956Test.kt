package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2956Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2, 1)

        // When
        val actual = Solution2956().findIntersectionValues(
            nums1 = intArrayOf(2, 3, 2),
            nums2 = intArrayOf(1, 2),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(3, 4)

        // When
        val actual = Solution2956().findIntersectionValues(
            nums1 = intArrayOf(4, 3, 2, 3, 1),
            nums2 = intArrayOf(2, 2, 5, 2, 3, 6),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(0, 0)

        // When
        val actual = Solution2956().findIntersectionValues(
            nums1 = intArrayOf(3, 4, 2, 3),
            nums2 = intArrayOf(1, 5),
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
