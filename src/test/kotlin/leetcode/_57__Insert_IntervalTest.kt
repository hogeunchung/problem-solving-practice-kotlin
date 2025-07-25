package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _57__Insert_IntervalTest {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(6, 9),
        )

        // When
        val actual = insert(
            intervals = arrayOf(
                intArrayOf(1, 3),
                intArrayOf(6, 9),
            ),
            newInterval = intArrayOf(2, 5),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 10),
            intArrayOf(12, 16),
        )

        // When
        val actual = insert(
            intervals = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 5),
                intArrayOf(6, 7),
                intArrayOf(8, 10),
                intArrayOf(12, 16),
            ),
            newInterval = intArrayOf(4, 8),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = arrayOf(
            intArrayOf(5, 7),
        )

        // When
        val actual = insert(
            intervals = emptyArray(),
            newInterval = intArrayOf(5, 7),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(6, 8),
        )

        // When
        val actual = insert(
            intervals = arrayOf(intArrayOf(1, 5)),
            newInterval = intArrayOf(6, 8),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 5),
        )

        // When
        val actual = insert(
            intervals = arrayOf(
                intArrayOf(1, 5),
            ),
            newInterval = intArrayOf(0, 0),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test6() {
        // Given
        val expected = arrayOf(
            intArrayOf(2, 6),
            intArrayOf(7, 9),
            intArrayOf(15, 18),
        )

        // When
        val actual = insert(
            intervals = arrayOf(
                intArrayOf(2, 6),
                intArrayOf(7, 9),
            ),
            newInterval = intArrayOf(15, 18),
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
