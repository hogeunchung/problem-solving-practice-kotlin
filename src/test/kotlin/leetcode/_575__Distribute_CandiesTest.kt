package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _575__Distribute_CandiesTest {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = distributeCandies(candyType = intArrayOf(1, 1, 2, 2, 3, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = distributeCandies(candyType = intArrayOf(1, 1, 2, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = distributeCandies(candyType = intArrayOf(6, 6, 6, 6))

        // Then
        assertEquals(expected, actual)
    }
}
