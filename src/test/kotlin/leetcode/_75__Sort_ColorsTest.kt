package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _75__Sort_ColorsTest {

    @Test
    fun test1() {
        // Arrange
        val expected = intArrayOf(0, 0, 1, 1, 2, 2)

        // Act
        val actual = intArrayOf(2, 0, 2, 1, 1, 0)
        sortColors(nums = actual)

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = intArrayOf(0, 1, 2)

        // Act
        val actual = intArrayOf(2, 0, 1)
        sortColors(nums = actual)

        // Assert
        assertArrayEquals(expected, actual)
    }
}
