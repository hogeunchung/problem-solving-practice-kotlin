package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _171__Excel_Sheet_Column_NumberKtTest {
    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = titleToNumber(columnTitle = "A")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 28

        // When
        val actual = titleToNumber(columnTitle = "AB")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 701

        // When
        val actual = titleToNumber(columnTitle = "ZY")

        // Then
        assertEquals(expected, actual)
    }
}
