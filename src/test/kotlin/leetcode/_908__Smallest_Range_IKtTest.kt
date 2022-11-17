package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _908__Smallest_Range_IKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = 0

        // Act
        val actual = smallestRangeI(nums = intArrayOf(1), k = 0)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 6

        // Act
        val actual = smallestRangeI(nums = intArrayOf(0, 10), k = 2)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 0

        // Act
        val actual = smallestRangeI(nums = intArrayOf(1, 3, 6), k = 3)

        // Assert
        assertEquals(expected, actual)
    }
}
