package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3146Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution3146().findPermutationDifference(s = "abc", t = "bac")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 12

        // When
        val actual = Solution3146().findPermutationDifference(s = "abcde", t = "edbac")

        // Then
        assertEquals(expected, actual)
    }
}
