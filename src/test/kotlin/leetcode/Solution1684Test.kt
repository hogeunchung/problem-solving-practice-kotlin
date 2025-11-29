package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1684Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution1684().countConsistentStrings(
            allowed = "ab",
            words = arrayOf("ad", "bd", "aaab", "baa", "badab"),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 7

        // When
        val actual = Solution1684().countConsistentStrings(
            allowed = "abc",
            words = arrayOf("a", "b", "c", "ab", "ac", "bc", "abc"),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 4

        // When
        val actual = Solution1684().countConsistentStrings(
            allowed = "cad",
            words = arrayOf("cc", "acd", "b", "ba", "bac", "bad", "ac", "d"),
        )

        // Then
        assertEquals(expected, actual)
    }
}
