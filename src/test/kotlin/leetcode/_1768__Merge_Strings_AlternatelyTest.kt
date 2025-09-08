package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1768__Merge_Strings_AlternatelyTest {

    @Test
    fun test1() {
        // Given
        val expected = "apbqcr"

        // When
        val actual = mergeAlternately(word1 = "abc", word2 = "pqr")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "apbqrs"

        // When
        val actual = mergeAlternately(word1 = "ab", word2 = "pqrs")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "apbqcd"

        // When
        val actual = mergeAlternately(word1 = "abcd", word2 = "pq")

        // Then
        assertEquals(expected, actual)
    }
}
