package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _697__Degree_of_an_ArrayTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 2

        // Act
        val actual = findShortestSubArray(nums = intArrayOf(1, 2, 2, 3, 1))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 6

        // Act
        val actual = findShortestSubArray(nums = intArrayOf(1, 2, 2, 3, 1, 4, 2))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 1

        // Act
        val actual = findShortestSubArray(nums = intArrayOf(1))

        // Assert
        assertEquals(expected, actual)
    }
}
