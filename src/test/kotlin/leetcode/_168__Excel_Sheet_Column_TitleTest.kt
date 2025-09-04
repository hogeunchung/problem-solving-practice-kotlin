package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _168__Excel_Sheet_Column_TitleTest {

    @Test
    fun test1() {
        // Given
        val expected = "A"

        // When
        val actual = convertToTitle(columnNumber = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "AB"

        // When
        val actual = convertToTitle(columnNumber = 28)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "ZY"

        // When
        val actual = convertToTitle(columnNumber = 701)

        // Then
        assertEquals(expected, actual)
    }
}
