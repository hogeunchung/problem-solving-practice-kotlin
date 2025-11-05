package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1876Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1876().countGoodSubstrings(s = "xyzzaz")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = Solution1876().countGoodSubstrings(s = "aababcabc")

        // Then
        assertEquals(expected, actual)
    }
}
