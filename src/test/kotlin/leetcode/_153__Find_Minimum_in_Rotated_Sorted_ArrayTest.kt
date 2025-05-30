package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _153__Find_Minimum_in_Rotated_Sorted_ArrayTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 1

        // Act
        val actual = findMin(nums = intArrayOf(3, 4, 5, 1, 2))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 0

        // Act
        val actual = findMin(nums = intArrayOf(4, 5, 6, 7, 0, 1, 2))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 11

        // Act
        val actual = findMin(nums = intArrayOf(11, 13, 15, 17))

        // Assert
        assertEquals(expected, actual)
    }
}
