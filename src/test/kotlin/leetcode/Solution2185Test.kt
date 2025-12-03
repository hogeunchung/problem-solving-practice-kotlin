package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2185Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution2185().prefixCount(words = arrayOf("pay", "attention", "practice", "attend"), pref = "at")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2185().prefixCount(words = arrayOf("leetcode", "win", "loops", "success"), pref = "code")

        // Then
        assertEquals(expected, actual)
    }
}
