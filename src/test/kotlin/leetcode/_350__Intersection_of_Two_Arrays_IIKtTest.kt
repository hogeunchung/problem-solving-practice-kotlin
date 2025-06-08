package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _350__Intersection_of_Two_Arrays_IIKtTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2, 2)

        // When
        val actual = intersect(nums1 = intArrayOf(1, 2, 2, 1), nums2 = intArrayOf(2, 2))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(4, 9)

        // When
        val actual = intersect(nums1 = intArrayOf(4, 9, 5), nums2 = intArrayOf(9, 4, 9, 8, 4))

        // Then
        assertArrayEquals(expected, actual)
    }
}
