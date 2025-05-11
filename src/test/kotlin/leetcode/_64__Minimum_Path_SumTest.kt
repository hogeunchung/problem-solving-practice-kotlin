package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _64__Minimum_Path_SumTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 7

        // Act
        val actual = minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1)))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 12

        // Act
        val actual = minPathSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)))

        // Assert
        assertEquals(expected, actual)
    }
}
