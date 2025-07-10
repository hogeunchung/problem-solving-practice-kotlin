package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _819__Most_Common_WordTest {

    @Test
    fun test1() {
        // Given
        val expected = "ball"

        // When
        val actual = mostCommonWord(
            paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.",
            banned = arrayOf("hit"),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "a"

        // When
        val actual = mostCommonWord(
            paragraph = "a.",
            banned = emptyArray(),
        )

        // Then
        assertEquals(expected, actual)
    }
}
