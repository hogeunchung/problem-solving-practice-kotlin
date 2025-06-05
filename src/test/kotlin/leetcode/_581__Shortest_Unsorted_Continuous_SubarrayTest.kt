package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _581__Shortest_Unsorted_Continuous_SubarrayTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 5

        // Act
        val actual = findUnsortedSubarray(nums = intArrayOf(2, 6, 4, 8, 10, 9, 15))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 0

        // Act
        val actual = findUnsortedSubarray(nums = intArrayOf(1, 2, 3, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 0

        // Act
        val actual = findUnsortedSubarray(nums = intArrayOf(1))

        // Assert
        assertEquals(expected, actual)
    }
}
