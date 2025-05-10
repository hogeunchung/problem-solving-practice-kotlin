package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _120__TriangleTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 11

        // Act
        val actual = minimumTotal(listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3)))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = -10

        // Act
        val actual = minimumTotal(listOf(listOf(-10)))

        // Assert
        assertEquals(expected, actual)
    }
}
