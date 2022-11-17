package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _217__Contains_DuplicateKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = containsDuplicate(nums = intArrayOf(1, 2, 3, 1))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = false

        // Act
        val actual = containsDuplicate(nums = intArrayOf(1, 2, 3, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = true

        // Act
        val actual = containsDuplicate(nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))

        // Assert
        assertEquals(expected, actual)
    }
}
