package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _509__Fibonacci_NumberKtTest {
    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = fib(2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = fib(3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun `Test3`() {
        // Given
        val expected = 3

        // When
        val actual = fib(4)

        // Then
        assertEquals(expected, actual)
    }
}
