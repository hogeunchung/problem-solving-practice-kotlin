package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _120__TriangleTest {

    @Test
    fun test1() {
        // Given
        val expected = 11

        // When
        val actual = minimumTotal(listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3)))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = -10

        // When
        val actual = minimumTotal(listOf(listOf(-10)))

        // Then
        assertEquals(expected, actual)
    }
}
