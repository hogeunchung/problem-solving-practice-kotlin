package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _441__Arranging_CoinsTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = arrangeCoins(n = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = arrangeCoins(n = 8)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = arrangeCoins(n = 2)

        // Then
        assertEquals(expected, actual)
    }
}
