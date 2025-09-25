package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1323__Maximum_69_NumberTest {

    @Test
    fun test1() {
        // Given
        val expected = 9969

        // When
        val actual = maximum69Number(num = 9669)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 9999

        // When
        val actual = maximum69Number(num = 9996)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 9999

        // When
        val actual = maximum69Number(num = 9999)

        // Then
        assertEquals(expected, actual)
    }
}
