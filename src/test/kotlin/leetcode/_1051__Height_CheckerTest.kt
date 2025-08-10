package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1051__Height_CheckerTest {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = heightChecker(heights = intArrayOf(1, 1, 4, 2, 1, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 5

        // When
        val actual = heightChecker(heights = intArrayOf(5, 1, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = heightChecker(heights = intArrayOf(1, 2, 3, 4, 5))

        // Then
        assertEquals(expected, actual)
    }
}
