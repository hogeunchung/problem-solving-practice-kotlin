package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _56__Merge_IntervalsTest {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 6),
            intArrayOf(8, 10),
            intArrayOf(15, 18),
        )

        // When
        val actual = merge(
            intervals = arrayOf(
                intArrayOf(1, 3),
                intArrayOf(2, 6),
                intArrayOf(8, 10),
                intArrayOf(15, 18),
            )
        )

        // Then
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 5),
        )

        // When
        val actual = merge(
            intervals = arrayOf(
                intArrayOf(1, 4),
                intArrayOf(4, 5),
            )
        )

        // Then
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(5, 6),
        )

        // When
        val actual = merge(
            intervals = arrayOf(
                intArrayOf(1, 4),
                intArrayOf(5, 6),
            )
        )

        // Then
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = arrayOf(
            intArrayOf(0, 4),
        )

        // When
        val actual = merge(
            intervals = arrayOf(
                intArrayOf(1, 4),
                intArrayOf(0, 4),
            )
        )

        // Then
        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 4),
        )

        // When
        val actual = merge(
            intervals = arrayOf(
                intArrayOf(1, 4),
                intArrayOf(0, 0),
            )
        )

        // Then
        assertEquals(expected = expected, actual = actual)
    }

    private fun assertEquals(expected: Array<IntArray>, actual: Array<IntArray>) {
        val comparator = Comparator<IntArray> { o1, o2 ->
            if (o1[0] < o2[0]) {
                -1
            } else if (o1[0] > o2[0]) {
                1
            } else {
                if (o1[1] < o2[1]) {
                    -1
                } else if (o1[1] > o2[1]) {
                    1
                } else {
                    0
                }
            }
        }

        val sortedExpected = expected.sortedWith(comparator)
        val sortedActual = actual.sortedWith(comparator)

        assertEquals(expected.size, actual.size)
        for (i in 0 until expected.size) {
            assertArrayEquals(sortedExpected[i], sortedActual[i])
        }
    }
}
