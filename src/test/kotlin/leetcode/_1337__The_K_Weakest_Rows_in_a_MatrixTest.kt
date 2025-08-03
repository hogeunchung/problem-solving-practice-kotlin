package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1337__The_K_Weakest_Rows_in_a_MatrixTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2, 0, 3)

        // When
        val actual = kWeakestRows(
            mat = arrayOf(
                intArrayOf(1, 1, 0, 0, 0),
                intArrayOf(1, 1, 1, 1, 0),
                intArrayOf(1, 0, 0, 0, 0),
                intArrayOf(1, 1, 0, 0, 0),
                intArrayOf(1, 1, 1, 1, 1),
            ),
            k = 3
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(0, 2)

        // When
        val actual = kWeakestRows(
            mat = arrayOf(
                intArrayOf(1, 0, 0, 0),
                intArrayOf(1, 1, 1, 1),
                intArrayOf(1, 0, 0, 0),
                intArrayOf(1, 0, 0, 0),
            ),
            k = 2
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
