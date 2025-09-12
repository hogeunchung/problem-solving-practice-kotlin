package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1752__Check_if_Array_Is_Sorted_and_RotatedTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = check(nums = intArrayOf(3, 4, 5, 1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = check(nums = intArrayOf(2, 1, 3, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = check(nums = intArrayOf(1, 2, 3))

        // Then
        assertEquals(expected, actual)
    }
}
