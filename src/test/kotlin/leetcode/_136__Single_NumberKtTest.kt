package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _136__Single_NumberKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 1

        // Act
        val actual = singleNumber(nums = intArrayOf(2, 2, 1))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 4

        // Act
        val actual = singleNumber(nums = intArrayOf(4, 1, 2, 1, 2))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 1

        // Act
        val actual = singleNumber(nums = intArrayOf(1))

        // Assert
        assertEquals(expected, actual)
    }
}
