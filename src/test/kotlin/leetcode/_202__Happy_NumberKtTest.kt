package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _202__Happy_NumberKtTest {
    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isHappy(19)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = isHappy(2)

        // Then
        assertEquals(expected, actual)
    }
}
