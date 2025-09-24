package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1207__Unique_Number_of_OccurrencesTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = uniqueOccurrences(intArrayOf(1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = uniqueOccurrences(intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0))

        // Then
        assertEquals(expected, actual)
    }
}
