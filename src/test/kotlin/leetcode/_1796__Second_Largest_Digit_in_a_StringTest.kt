package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1796__Second_Largest_Digit_in_a_StringTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = secondHighest(s = "dfa12321afd")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = -1

        // When
        val actual = secondHighest(s = "abc1111")

        // Then
        assertEquals(expected, actual)
    }
}
