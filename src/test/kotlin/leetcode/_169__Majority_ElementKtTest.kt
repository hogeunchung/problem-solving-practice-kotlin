package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _169__Majority_ElementKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = 3

        // Act
        val actual = majorityElement(intArrayOf(3, 2, 3))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2))

        // Assert
        assertEquals(expected, actual)
    }
}
