package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1925__Count_Square_Sum_TriplesTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = countTriples(n = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = countTriples(n = 10)

        // Then
        assertEquals(expected, actual)
    }
}
