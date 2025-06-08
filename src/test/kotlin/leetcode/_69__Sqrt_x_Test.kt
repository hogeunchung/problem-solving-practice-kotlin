package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _69__Sqrt_x_Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = mySqrt(x = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = mySqrt(x = 8)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = mySqrt(x = 0)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = 1

        // When
        val actual = mySqrt(x = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = 46340

        // When
        val actual = mySqrt(x = 2147395600)

        // Then
        assertEquals(expected, actual)
    }
}
