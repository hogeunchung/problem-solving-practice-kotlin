package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _164__Maximum_GapTest {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = maximumGap(nums = intArrayOf(3, 6, 9, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = maximumGap(nums = intArrayOf(10))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 2

        // When
        val actual = maximumGap(nums = intArrayOf(3, 1))

        // Then
        assertEquals(expected, actual)
    }
}
