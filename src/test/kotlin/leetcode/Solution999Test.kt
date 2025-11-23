package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution999Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution999().numRookCaptures(
            board = arrayOf(
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', 'R', '.', '.', '.', 'p'),
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution999().numRookCaptures(
            board = arrayOf(
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                charArrayOf('.', 'p', 'p', 'p', 'p', 'p', '.', '.'),
                charArrayOf('.', 'p', 'p', 'B', 'p', 'p', '.', '.'),
                charArrayOf('.', 'p', 'B', 'R', 'B', 'p', '.', '.'),
                charArrayOf('.', 'p', 'p', 'B', 'p', 'p', '.', '.'),
                charArrayOf('.', 'p', 'p', 'p', 'p', 'p', '.', '.'),
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = Solution999().numRookCaptures(
            board = arrayOf(
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                charArrayOf('p', 'p', '.', 'R', '.', 'p', 'B', '.'),
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', 'B', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
