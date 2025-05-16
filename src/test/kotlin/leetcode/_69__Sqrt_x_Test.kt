package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _69__Sqrt_x_Test {

    @Test
    fun test1() {
        // Arrange
        val expected = 2

        // Act
        val actual = mySqrt(x = 4)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = mySqrt(x = 8)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 0

        // Act
        val actual = mySqrt(x = 0)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = 1

        // Act
        val actual = mySqrt(x = 1)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Arrange
        val expected = 46340

        // Act
        val actual = mySqrt(x = 2147395600)

        // Assert
        assertEquals(expected, actual)
    }
}
