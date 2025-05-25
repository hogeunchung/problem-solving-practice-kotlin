package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _49__Group_AnagramsTest {

    @Test
    fun test1() {
        // Arrange
        val expected = listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))

        // Act
        val actual = groupAnagrams(strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))

        // Assert
        assertAll(
            { assertEquals(expected.size, actual.size) },
            { actual.containsAll(expected) },
            { expected.containsAll(actual) },
        )
    }

    @Test
    fun test2() {
        // Arrange
        val expected = listOf(listOf("bat"))

        // Act
        val actual = groupAnagrams(strs = arrayOf(""))

        // Assert
        assertAll(
            { assertEquals(expected.size, actual.size) },
            { actual.containsAll(expected) },
            { expected.containsAll(actual) },
        )
    }

    @Test
    fun test3() {
        // Arrange
        val expected = listOf(listOf("a"))

        // Act
        val actual = groupAnagrams(strs = arrayOf("a"))

        // Assert
        assertAll(
            { assertEquals(expected.size, actual.size) },
            { actual.containsAll(expected) },
            { expected.containsAll(actual) },
        )
    }
}
