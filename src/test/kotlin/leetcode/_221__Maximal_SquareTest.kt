package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _221__Maximal_SquareTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 4

        // Act
        val actual = maximalSquare(
            matrix = arrayOf(
                charArrayOf('1', '0', '1', '0', '0'),
                charArrayOf('1', '0', '1', '1', '1'),
                charArrayOf('1', '1', '1', '1', '1'),
                charArrayOf('1', '0', '0', '1', '0'),
            )
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 1

        // Act
        val actual = maximalSquare(
            matrix = arrayOf(
                charArrayOf('0', '1'),
                charArrayOf('1', '0'),
            )
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 0

        // Act
        val actual = maximalSquare(
            matrix = arrayOf(
                charArrayOf('0'),
            )
        )

        // Assert
        assertEquals(expected, actual)
    }
}
