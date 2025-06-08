package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _2413__Smallest_Even_MultipleKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 10

        // When
        val actual = smallestEvenMultiple(n = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 6

        // When
        val actual = smallestEvenMultiple(n = 6)

        // Then
        assertEquals(expected, actual)
    }
}
