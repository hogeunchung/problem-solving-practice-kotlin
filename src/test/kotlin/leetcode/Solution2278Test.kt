package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2278Test {

    @Test
    fun test1() {
        // Given
        val expected = 33

        // When
        val actual = Solution2278().percentageLetter(s = "foobar", letter = 'o')

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2278().percentageLetter(s = "jjjj", letter = 'k')

        // Then
        assertEquals(expected, actual)
    }
}
