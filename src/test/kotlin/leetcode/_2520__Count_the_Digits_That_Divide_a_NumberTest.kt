package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _2520__Count_the_Digits_That_Divide_a_NumberTest {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = countDigits(num = 7)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = countDigits(num = 121)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 4

        // When
        val actual = countDigits(num = 1248)

        // Then
        assertEquals(expected, actual)
    }
}
