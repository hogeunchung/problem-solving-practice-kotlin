package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _118__Pascal_s_TriangleKtTest {
    @Test
    fun test1() {
        // Given
        val expected = listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1), listOf(1, 3, 3, 1), listOf(1, 4, 6, 4, 1))

        // When
        val actual = generate(5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(listOf(1))

        // When
        val actual = generate(1)

        // Then
        assertEquals(expected, actual)
    }
}
