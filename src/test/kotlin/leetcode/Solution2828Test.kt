package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2828Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution2828().isAcronym(words = listOf("alice", "bob", "charlie"), s = "abc")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution2828().isAcronym(words = listOf("an", "apple"), s = "a")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = Solution2828().isAcronym(words = listOf("never", "gonna", "give", "up", "on", "you"), s = "ngguoy")

        // Then
        assertEquals(expected, actual)
    }
}
