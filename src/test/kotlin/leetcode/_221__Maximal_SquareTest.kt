package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _221__Maximal_SquareTest {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = maximalSquare(
            matrix = arrayOf(
                charArrayOf('1', '0', '1', '0', '0'),
                charArrayOf('1', '0', '1', '1', '1'),
                charArrayOf('1', '1', '1', '1', '1'),
                charArrayOf('1', '0', '0', '1', '0'),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = maximalSquare(
            matrix = arrayOf(
                charArrayOf('0', '1'),
                charArrayOf('1', '0'),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = maximalSquare(
            matrix = arrayOf(
                charArrayOf('0'),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
