package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _482__License_Key_FormattingTest {

    @Test
    fun test1() {
        // Given
        val expected = "5F3Z-2E9W"

        // When
        val actual = licenseKeyFormatting(s = "5F3Z-2e-9-w", k = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "2-5G-3J"

        // When
        val actual = licenseKeyFormatting(s = "2-5g-3-J", k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
