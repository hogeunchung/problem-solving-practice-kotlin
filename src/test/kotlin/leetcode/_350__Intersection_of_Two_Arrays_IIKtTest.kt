package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _350__Intersection_of_Two_Arrays_IIKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = intArrayOf(2, 2)

        // Act
        val actual = intersect(nums1 = intArrayOf(1, 2, 2, 1), nums2 = intArrayOf(2, 2))

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = intArrayOf(4, 9)

        // Act
        val actual = intersect(nums1 = intArrayOf(4, 9, 5), nums2 = intArrayOf(9, 4, 9, 8, 4))

        // Assert
        assertArrayEquals(expected, actual)
    }
}
