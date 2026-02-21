package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3498Test {

    @Test
    fun test1() {
        // Given
        val expected = 148

        // When
        val actual = Solution3498().reverseDegree(s = "abc")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 160

        // When
        val actual = Solution3498().reverseDegree(s = "zaza")

        // Then
        assertEquals(expected, actual)
    }
}
