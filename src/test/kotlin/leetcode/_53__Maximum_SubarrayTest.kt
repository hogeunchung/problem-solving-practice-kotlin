package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _53__Maximum_SubarrayTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 6

        // Act
        val actual = maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 1

        // Act
        val actual = maxSubArray(intArrayOf(1))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 23

        // Act
        val actual = maxSubArray(intArrayOf(5, 4, -1, 7, 8))

        // Assert
        assertEquals(expected, actual)
    }

}
