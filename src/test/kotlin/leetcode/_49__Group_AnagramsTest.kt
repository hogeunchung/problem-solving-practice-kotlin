package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _49__Group_AnagramsTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))

        // When
        val actual = groupAnagrams(strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))

        // Then
        assertAll(
            { assertEquals(expected.size, actual.size) },
            { actual.containsAll(expected) },
            { expected.containsAll(actual) },
        )
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(listOf("bat"))

        // When
        val actual = groupAnagrams(strs = arrayOf(""))

        // Then
        assertAll(
            { assertEquals(expected.size, actual.size) },
            { actual.containsAll(expected) },
            { expected.containsAll(actual) },
        )
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(listOf("a"))

        // When
        val actual = groupAnagrams(strs = arrayOf("a"))

        // Then
        assertAll(
            { assertEquals(expected.size, actual.size) },
            { actual.containsAll(expected) },
            { expected.containsAll(actual) },
        )
    }
}
