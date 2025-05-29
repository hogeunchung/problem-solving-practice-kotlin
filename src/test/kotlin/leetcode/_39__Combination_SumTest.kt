package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _39__Combination_SumTest {

    @Test
    fun test1() {
        // Arrange
        val expected = listOf(listOf(2, 2, 3), listOf(7))

        // Act
        val actual = combinationSum(candidates = intArrayOf(2, 3, 6, 7), target = 7)

        // Assert
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test2() {
        // Arrange
        val expected = listOf(listOf(2, 2, 2, 2), listOf(2, 3, 3), listOf(3, 5))

        // Act
        val actual = combinationSum(candidates = intArrayOf(2, 3, 5), target = 8)

        // Assert
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test3() {
        // Arrange
        val expected = emptyList<List<Int>>()

        // Act
        val actual = combinationSum(candidates = intArrayOf(2), target = 1)

        // Assert
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }
}
