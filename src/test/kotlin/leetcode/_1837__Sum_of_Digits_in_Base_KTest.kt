package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1837__Sum_of_Digits_in_Base_KTest {

    @Test
    fun test1() {
        // Given
        val expected = 9

        // When
        val actual = sumBase(n = 34, k = 6)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = sumBase(n = 10, k = 10)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = sumBase(n = 42, k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
