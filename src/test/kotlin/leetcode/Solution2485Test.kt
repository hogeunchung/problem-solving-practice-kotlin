package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2485Test {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = Solution2485().pivotInteger(n = 8)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution2485().pivotInteger(n = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -1

        // When
        val actual = Solution2485().pivotInteger(n = 4)

        // Then
        assertEquals(expected, actual)
    }
}
