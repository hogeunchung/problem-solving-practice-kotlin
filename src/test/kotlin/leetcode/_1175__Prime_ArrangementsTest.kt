package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1175__Prime_ArrangementsTest {

    @Test
    fun test1() {
        // Given
        val expected = 12

        // When
        val actual = numPrimeArrangements(n = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 682289015

        // When
        val actual = numPrimeArrangements(n = 100)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = numPrimeArrangements(n = 1)

        // Then
        assertEquals(expected, actual)
    }
}
