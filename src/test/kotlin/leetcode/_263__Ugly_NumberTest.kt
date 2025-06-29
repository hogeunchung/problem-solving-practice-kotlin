package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _263__Ugly_NumberTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isUgly(n = 6)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = isUgly(n = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = isUgly(n = 14)

        // Then
        assertEquals(expected, actual)
    }

}
