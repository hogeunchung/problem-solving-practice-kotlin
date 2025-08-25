package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _476__Number_ComplementTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = findComplement(num = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = findComplement(num = 1)

        // Then
        assertEquals(expected, actual)
    }
}
