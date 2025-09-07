package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _507__Perfect_NumberTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = checkPerfectNumber(num = 28)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = checkPerfectNumber(num = 7)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = checkPerfectNumber(num = 6)

        // Then
        assertEquals(expected, actual)
    }
}
