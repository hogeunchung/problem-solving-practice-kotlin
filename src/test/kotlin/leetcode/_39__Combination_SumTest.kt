package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _39__Combination_SumTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(listOf(2, 2, 3), listOf(7))

        // When
        val actual = combinationSum(candidates = intArrayOf(2, 3, 6, 7), target = 7)

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(listOf(2, 2, 2, 2), listOf(2, 3, 3), listOf(3, 5))

        // When
        val actual = combinationSum(candidates = intArrayOf(2, 3, 5), target = 8)

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test3() {
        // Given
        val expected = emptyList<List<Int>>()

        // When
        val actual = combinationSum(candidates = intArrayOf(2), target = 1)

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }
}
