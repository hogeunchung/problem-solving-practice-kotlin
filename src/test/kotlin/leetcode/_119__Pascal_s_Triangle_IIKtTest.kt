package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _119__Pascal_s_Triangle_IIKtTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(1, 3, 3, 1)

        // When
        val actual = getRow(rowIndex = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(1)

        // When
        val actual = getRow(rowIndex = 0)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(1, 1)

        // When
        val actual = getRow(rowIndex = 1)

        // Then
        assertEquals(expected, actual)
    }
}
