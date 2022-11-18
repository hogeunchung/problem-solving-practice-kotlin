package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _219__Contains_Duplicate_IIKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1), k = 3)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = true

        // Act
        val actual = containsNearbyDuplicate(nums = intArrayOf(1, 0, 1, 1), k = 1)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = false

        // Act
        val actual = containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1, 2, 3), k = 2)

        // Assert
        assertEquals(expected, actual)
    }
}
