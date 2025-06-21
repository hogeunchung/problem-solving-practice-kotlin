package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _47__Permutations_IITest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(
            listOf(1, 1, 2),
            listOf(1, 2, 1),
            listOf(2, 1, 1),
        )

        // When
        val actual = permuteUnique(nums = intArrayOf(1, 1, 2))

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test2() {
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
        val actual = permuteUnique(nums = intArrayOf(1, 2, 3))

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }
}
