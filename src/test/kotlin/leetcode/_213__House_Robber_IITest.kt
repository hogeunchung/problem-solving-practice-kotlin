package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _213__House_Robber_IITest {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = rob2(nums = intArrayOf(2, 3, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = rob2(nums = intArrayOf(1, 2, 3, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = rob2(nums = intArrayOf(1, 2, 3))

        // Then
        assertEquals(expected, actual)
    }
}
