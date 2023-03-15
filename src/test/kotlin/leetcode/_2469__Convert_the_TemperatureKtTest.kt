package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _2469__Convert_the_TemperatureKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = doubleArrayOf(309.65000, 97.70000)

        // Act
        val actual = convertTemperature(celsius = 36.50)

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = doubleArrayOf(395.26000, 251.79800)

        // Act
        val actual = convertTemperature(celsius = 122.11)

        // Assert
        assertArrayEquals(expected, actual)
    }
}
