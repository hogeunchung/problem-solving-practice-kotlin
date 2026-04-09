package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2220Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution2220().minBitFlips(start = 10, goal = 7)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution2220().minBitFlips(start = 3, goal = 4)

        // Then
        assertEquals(expected, actual)
    }
}
