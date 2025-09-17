package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1941__Check_if_All_Characters_Have_Equal_Number_of_OccurrencesTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = areOccurrencesEqual(s = "abacbc")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = areOccurrencesEqual(s = "aaabb")

        // Then
        assertEquals(expected, actual)
    }
}
