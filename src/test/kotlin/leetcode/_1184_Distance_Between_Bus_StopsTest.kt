package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1184_Distance_Between_Bus_StopsTest {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = distanceBetweenBusStops(distance = intArrayOf(1, 2, 3, 4), start = 0, destination = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = distanceBetweenBusStops(distance = intArrayOf(1, 2, 3, 4), start = 0, destination = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 4

        // When
        val actual = distanceBetweenBusStops(distance = intArrayOf(1, 2, 3, 4), start = 0, destination = 3)

        // Then
        assertEquals(expected, actual)
    }
}
