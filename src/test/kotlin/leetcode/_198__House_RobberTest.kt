package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _198__House_RobberTest {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = rob(nums = intArrayOf(1, 2, 3, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 12

        // When
        val actual = rob(nums = intArrayOf(2, 7, 9, 3, 1))

        // Then
        assertEquals(expected, actual)
    }
}
