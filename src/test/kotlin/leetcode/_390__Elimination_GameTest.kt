package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _390__Elimination_GameTest {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = lastRemaining(n = 9)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = lastRemaining(n = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 14

        // When
        val actual = lastRemaining(n = 24)

        // Then
        assertEquals(expected, actual)
    }
}
