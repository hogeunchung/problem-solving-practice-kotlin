package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3019Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution3019().countKeyChanges(s = "aAbBcC")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution3019().countKeyChanges(s = "AaAaAaaA")

        // Then
        assertEquals(expected, actual)
    }
}
