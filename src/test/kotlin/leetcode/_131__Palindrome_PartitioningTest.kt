package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _131__Palindrome_PartitioningTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(
            listOf("a", "a", "b"),
            listOf("aa", "b"),
        )

        // When
        val actual = partition(s = "aab")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(
            listOf("a"),
        )

        // When
        val actual = partition(s = "a")

        // Then
        assertEquals(expected, actual)
    }
}
