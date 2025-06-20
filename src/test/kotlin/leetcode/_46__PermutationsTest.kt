package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _46__PermutationsTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1),
        )

        // When
        val actual = permute(nums = intArrayOf(1, 2, 3))

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(
            listOf(0, 1),
            listOf(1, 0),
        )

        // When
        val actual = permute(nums = intArrayOf(0, 1))

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(
            listOf(1),
        )

        // When
        val actual = permute(nums = intArrayOf(1))

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }
}
