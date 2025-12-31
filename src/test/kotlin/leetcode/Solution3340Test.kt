package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3340Test {

    @Test
    fun test1() {
        // Given
        val expected = false

        // When
        val actual = Solution3340().isBalanced(num = "1234")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = Solution3340().isBalanced(num = "24123")

        // Then
        assertEquals(expected, actual)
    }
}
