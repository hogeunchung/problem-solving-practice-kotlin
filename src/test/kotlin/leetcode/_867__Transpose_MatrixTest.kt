package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class _867__Transpose_MatrixTest {

    @Test
    fun test1() {
        // given
        val expected = arrayOf(
            intArrayOf(1, 4, 7),
            intArrayOf(2, 5, 8),
            intArrayOf(3, 6, 9),
        )

        // when
        val actual = transpose(
            matrix = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9),
            )
        )

        // then
        assertArrayEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test2() {
        // given
        val expected = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(2, 5),
            intArrayOf(3, 6),
        )

        // when
        val actual = transpose(
            matrix = arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
            )
        )

        // then
        assertArrayEquals(/* expected = */ expected, /* actual = */ actual)
    }
}
