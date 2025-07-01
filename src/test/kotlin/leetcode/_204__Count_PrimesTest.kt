package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _204__Count_PrimesTest {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = countPrimes(n = 10)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = countPrimes(n = 0)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = countPrimes(n = 1)

        // Then
        assertEquals(expected, actual)
    }
}
