package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _509__Fibonacci_NumberKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = 1

        // Act
        val actual = fib(2)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = fib(3)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `Test3`() {
        // Arrange
        val expected = 3

        // Act
        val actual = fib(4)

        // Assert
        assertEquals(expected, actual)
    }
}
