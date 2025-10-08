package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution1078Test {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf("girl", "student")

        // When
        val actual = Solution1078().findOcurrences(
            text = "alice is a good girl she is a good student",
            first = "a",
            second = "good",
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf("we", "rock")

        // When
        val actual = Solution1078().findOcurrences(
            text = "we will we will rock you",
            first = "we",
            second = "will",
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
