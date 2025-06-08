package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _67__Add_BinaryKtTest {
    @Test
    fun test1() {
        // Given
        val expected = "100"

        // When
        val actual = addBinary(a = "11", b = "1")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "10101"

        // When
        val actual = addBinary(a = "1010", b = "1011")

        // Then
        assertEquals(expected, actual)
    }
}
