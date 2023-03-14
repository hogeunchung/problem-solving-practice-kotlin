package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _2413__Smallest_Even_MultipleKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 10

        // Act
        val actual = smallestEvenMultiple(n = 5)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 6

        // Act
        val actual = smallestEvenMultiple(n = 6)

        // Assert
        assertEquals(expected, actual)
    }
}
