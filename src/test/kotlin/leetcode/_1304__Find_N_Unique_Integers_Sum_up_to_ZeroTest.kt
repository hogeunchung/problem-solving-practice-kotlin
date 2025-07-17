package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1304__Find_N_Unique_Integers_Sum_up_to_ZeroTest {

    @Test
    fun test1() {
        // Given
        val n = 5

        // When
        val actual = sumZero(n = n)

        // Then
        assertEquals(0, actual.sum())
        assertEquals(n, actual.size)
    }

    @Test
    fun test2() {
        // Given
        val n = 3

        // When
        val actual = sumZero(n = n)

        // Then
        assertEquals(0, actual.sum())
        assertEquals(n, actual.size)
    }

    @Test
    fun test3() {
        // Given
        val n = 1

        // When
        val actual = sumZero(n = n)

        // Then
        assertEquals(0, actual.sum())
        assertEquals(n, actual.size)
    }
}
