package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _349__Intersection_of_Two_ArraysTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2)

        // When
        val actual = intersection(nums1 = intArrayOf(1, 2, 2, 1), nums2 = intArrayOf(2, 2))

        // Then
        assertArrayEquals(expected.sorted().toIntArray(), actual.sorted().toIntArray())
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(9, 4)

        // When
        val actual = intersection(nums1 = intArrayOf(4, 9, 5), nums2 = intArrayOf(9, 4, 9, 8, 4))

        // Then
        assertArrayEquals(expected.sorted().toIntArray(), actual.sorted().toIntArray())
    }
}
