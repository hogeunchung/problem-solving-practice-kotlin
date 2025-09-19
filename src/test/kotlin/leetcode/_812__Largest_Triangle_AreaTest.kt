package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import kotlin.math.abs
import kotlin.math.pow

internal class _812__Largest_Triangle_AreaTest {

    @Test
    fun test1() {
        // Given
        val expected = 2.0
        val threshold = 1.0 / 10.0.pow(5)

        // When
        val actual = largestTriangleArea(
            points = arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 1),
                intArrayOf(1, 0),
                intArrayOf(0, 2),
                intArrayOf(2, 0),
            )
        )

        // Then
        assertTrue(abs(expected - actual) < threshold)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0.5
        val threshold = 1.0 / 10.0.pow(5)

        // When
        val actual = largestTriangleArea(
            points = arrayOf(
                intArrayOf(1, 0),
                intArrayOf(0, 0),
                intArrayOf(0, 1),
            )
        )

        // Then
        assertTrue(abs(expected - actual) < threshold)

    }

    @Test
    fun test3() {
        // Given
        val expected = 14.5
        val threshold = 1.0 / 10.0.pow(5)

        // When
        val actual = largestTriangleArea(
            points = arrayOf(
                intArrayOf(2, 5),
                intArrayOf(7, 7),
                intArrayOf(10, 8),
                intArrayOf(10, 10),
                intArrayOf(1, 1),
            )
        )

        // Then
        assertTrue(abs(expected - actual) < threshold)
    }
}
