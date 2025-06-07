package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _164__Maximum_GapTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 3

        // Act
        val actual = maximumGap(nums = intArrayOf(3, 6, 9, 1))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 0

        // Act
        val actual = maximumGap(nums = intArrayOf(10))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 2

        // Act
        val actual = maximumGap(nums = intArrayOf(3, 1))

        // Assert
        assertEquals(expected, actual)
    }
}
