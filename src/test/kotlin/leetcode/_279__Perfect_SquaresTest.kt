package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _279__Perfect_SquaresTest {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = numSquares(n = 12)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = numSquares(n = 13)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = numSquares(n = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = 2

        // When
        val actual = numSquares(n = 2)

        // Then
        assertEquals(expected, actual)
    }
}
