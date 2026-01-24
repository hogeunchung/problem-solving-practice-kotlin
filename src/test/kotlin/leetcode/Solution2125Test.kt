package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2125Test {

    @Test
    fun test1() {
        // Given
        val expected = 8

        // When
        val actual = Solution2125().numberOfBeams(bank = arrayOf("011001", "000000", "010100", "001000"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2125().numberOfBeams(bank = arrayOf("000", "111", "000"))

        // Then
        assertEquals(expected, actual)
    }
}
