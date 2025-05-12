package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _215__Kth_Largest_Element_in_an_ArrayTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 5

        // Act
        val actual = findKthLargest(nums = intArrayOf(3, 2, 1, 5, 6, 4), k = 2)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 4

        // Act
        val actual = findKthLargest(nums = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), k = 4)

        // Assert
        assertEquals(expected, actual)
    }
}
