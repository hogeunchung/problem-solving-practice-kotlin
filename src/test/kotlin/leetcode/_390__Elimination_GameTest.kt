package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _390__Elimination_GameTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 6

        // Act
        val actual = lastRemaining(n = 9)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 1

        // Act
        val actual = lastRemaining(n = 1)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 14

        // Act
        val actual = lastRemaining(n = 24)

        // Assert
        assertEquals(expected, actual)
    }
}
