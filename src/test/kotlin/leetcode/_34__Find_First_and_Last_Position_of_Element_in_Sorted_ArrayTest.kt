package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _34__Find_First_and_Last_Position_of_Element_in_Sorted_ArrayTest {

    @Test
    fun test1() {
        // Arrange
        val expected = intArrayOf(3, 4)

        // Act
        val actual = searchRange(nums = intArrayOf(5, 7, 7, 8, 8, 10), target = 8)

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = intArrayOf(-1, -1)

        // Act
        val actual = searchRange(nums = intArrayOf(5, 7, 7, 8, 8, 10), target = 6)

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = intArrayOf(-1, -1)

        // Act
        val actual = searchRange(nums = intArrayOf(), target = 0)

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = intArrayOf(0, 0)

        // Act
        val actual = searchRange(nums = intArrayOf(1), target = 1)

        // Assert
        assertArrayEquals(expected, actual)
    }
}
