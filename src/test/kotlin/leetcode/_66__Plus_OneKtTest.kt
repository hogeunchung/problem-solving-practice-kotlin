package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class _66__Plus_OneKtTest {
    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(1, 2, 4)

        // When
        val actual = plusOne(digits = intArrayOf(1, 2, 3))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(4, 3, 2, 2)

        // When
        val actual = plusOne(digits = intArrayOf(4, 3, 2, 1))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(1, 0)

        // When
        val actual = plusOne(digits = intArrayOf(9))

        // Then
        assertArrayEquals(expected, actual)
    }
}
