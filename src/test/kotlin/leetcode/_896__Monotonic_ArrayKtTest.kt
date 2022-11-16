package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _896__Monotonic_ArrayKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = isMonotonic(nums = intArrayOf(1, 2, 2, 3))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = true

        // Act
        val actual = isMonotonic(nums = intArrayOf(6, 5, 4, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = false

        // Act
        val actual = isMonotonic(nums = intArrayOf(1, 3, 2))

        // Assert
        assertEquals(expected, actual)
    }
}
