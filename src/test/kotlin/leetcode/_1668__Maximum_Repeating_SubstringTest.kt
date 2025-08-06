package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1668__Maximum_Repeating_SubstringTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = maxRepeating(sequence = "ababc", word = "ab")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = maxRepeating(sequence = "ababc", word = "ba")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = maxRepeating(sequence = "ababc", word = "ac")

        // Then
        assertEquals(expected, actual)
    }
}
