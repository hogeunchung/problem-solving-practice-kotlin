package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _191__Number_of_1_BitsKtTest {
    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = hammingWeight(n = 0b00000000000000000000000000001011)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = hammingWeight(n = 0b00000000000000000000000010000000)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 31

        // When
        val actual = hammingWeight(n = -3)

        // Then
        assertEquals(expected, actual)
    }
}
