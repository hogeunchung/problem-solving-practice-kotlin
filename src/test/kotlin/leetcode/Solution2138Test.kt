package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2138Test {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf("abc", "def", "ghi")

        // When
        val actual = Solution2138().divideString(s = "abcdefghi", k = 3, fill = 'x')

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf("abc", "def", "ghi", "jxx")

        // When
        val actual = Solution2138().divideString(s = "abcdefghij", k = 3, fill = 'x')

        // Then
        assertArrayEquals(expected, actual)
    }
}
