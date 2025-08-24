package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _504__Base_7Test {

    @Test
    fun test1() {
        // Given
        val expected = "202"

        // When
        val actual = convertToBase7(num = 100)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "-10"

        // When
        val actual = convertToBase7(num = -7)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "0"

        // When
        val actual = convertToBase7(num = 0)

        // Then
        assertEquals(expected, actual)
    }
}
