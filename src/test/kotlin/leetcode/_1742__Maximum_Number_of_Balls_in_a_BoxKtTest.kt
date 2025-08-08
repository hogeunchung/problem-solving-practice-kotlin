package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1742__Maximum_Number_of_Balls_in_a_BoxKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = countBalls(lowLimit = 1, highLimit = 10)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = countBalls(lowLimit = 5, highLimit = 15)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 2

        // When
        val actual = countBalls(lowLimit = 19, highLimit = 28)

        // Then
        assertEquals(expected, actual)
    }
}
