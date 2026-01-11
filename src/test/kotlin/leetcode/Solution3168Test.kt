package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3168Test {

    @Test
    fun test1() {
        // Given
        val expected = 7

        // When
        val actual = Solution3168().minimumChairs(s = "EEEEEEE")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution3168().minimumChairs(s = "ELELEEL")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = Solution3168().minimumChairs(s = "ELEELEELLL")

        // Then
        assertEquals(expected, actual)
    }
}
