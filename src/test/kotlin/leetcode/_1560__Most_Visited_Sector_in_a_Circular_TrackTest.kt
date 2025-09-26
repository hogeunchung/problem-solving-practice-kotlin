package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1560__Most_Visited_Sector_in_a_Circular_TrackTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(1, 2)

        // When
        val actual = mostVisited(n = 4, rounds = intArrayOf(1, 3, 1, 2))
        println("actual = $actual")

        // Then
        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(2)

        // When
        val actual = mostVisited(n = 2, rounds = intArrayOf(2, 1, 2, 1, 2, 1, 2, 1, 2))
        println("actual = $actual")

        // Then
        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(1, 2, 3, 4, 5, 6, 7)

        // When
        val actual = mostVisited(n = 7, rounds = intArrayOf(1, 3, 5, 7))

        // Then
        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }

    @Test
    fun test4() {
        // Given
        val expected = listOf(1, 3)

        // When
        val actual = mostVisited(n = 3, rounds = intArrayOf(3, 2, 1, 2, 1, 3, 2, 1, 2, 1, 3, 2, 3, 1))
        println("actual = $actual")

        // Then
        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }
}
