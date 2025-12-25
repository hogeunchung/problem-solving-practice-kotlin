package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1700Test {

    @Test
    fun test1() {
        // Given
        val expected = 0

        // When
        val actual = Solution1700().countStudents(
            students = intArrayOf(1, 1, 0, 0),
            sandwiches = intArrayOf(0, 1, 0, 1),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution1700().countStudents(
            students = intArrayOf(1, 1, 1, 0, 0, 1),
            sandwiches = intArrayOf(1, 0, 0, 0, 1, 1),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 2

        // When
        val actual = Solution1700().countStudents(
            students = intArrayOf(1, 1),
            sandwiches = intArrayOf(0, 1),
        )

        // Then
        assertEquals(expected, actual)
    }
}
