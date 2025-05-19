package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _279__Perfect_SquaresTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 3

        // Act
        val actual = numSquares(n = 12)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = numSquares(n = 13)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 1

        // Act
        val actual = numSquares(n = 1)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = 2

        // Act
        val actual = numSquares(n = 2)

        // Assert
        assertEquals(expected, actual)
    }
}
