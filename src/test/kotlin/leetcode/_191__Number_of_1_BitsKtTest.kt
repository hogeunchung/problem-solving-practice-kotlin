package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _191__Number_of_1_BitsKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = 3

        // Act
        val actual = hammingWeight(n = 0b00000000000000000000000000001011)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 1

        // Act
        val actual = hammingWeight(n = 0b00000000000000000000000010000000)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 31

        // Act
        val actual = hammingWeight(n = -3)

        // Assert
        assertEquals(expected, actual)
    }
}
