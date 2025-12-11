package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2798Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution2798().numberOfEmployeesWhoMetTarget(hours = intArrayOf(0, 1, 2, 3, 4), target = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2798().numberOfEmployeesWhoMetTarget(hours = intArrayOf(5, 1, 4, 2, 2), target = 6)

        // Then
        assertEquals(expected, actual)
    }
}
