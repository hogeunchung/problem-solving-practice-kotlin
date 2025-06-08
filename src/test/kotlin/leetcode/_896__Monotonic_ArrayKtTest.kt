package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _896__Monotonic_ArrayKtTest {
    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isMonotonic(nums = intArrayOf(1, 2, 2, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = isMonotonic(nums = intArrayOf(6, 5, 4, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = isMonotonic(nums = intArrayOf(1, 3, 2))

        // Then
        assertEquals(expected, actual)
    }
}
