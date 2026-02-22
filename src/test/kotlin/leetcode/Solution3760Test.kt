package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3760Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution3760().maxDistinct(s = "abab")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = Solution3760().maxDistinct(s = "abcd")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = Solution3760().maxDistinct(s = "aaaa")

        // Then
        assertEquals(expected, actual)
    }
}
