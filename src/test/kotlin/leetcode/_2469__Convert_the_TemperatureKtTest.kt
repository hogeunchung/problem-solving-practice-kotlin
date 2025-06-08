package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _2469__Convert_the_TemperatureKtTest {

    @Test
    fun test1() {
        // Given
        val expected = doubleArrayOf(309.65000, 97.70000)

        // When
        val actual = convertTemperature(celsius = 36.50)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = doubleArrayOf(395.26000, 251.79800)

        // When
        val actual = convertTemperature(celsius = 122.11)

        // Then
        assertArrayEquals(expected, actual)
    }
}
