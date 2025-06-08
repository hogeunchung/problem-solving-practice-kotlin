package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _231__Power_of_TwoKtTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isPowerOfTwo(n = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = isPowerOfTwo(n = 16)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = isPowerOfTwo(n = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = false

        // When
        val actual = isPowerOfTwo(n = 0)

        // Then
        assertEquals(expected, actual)
    }
}
