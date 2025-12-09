package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1450Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1450().busyStudent(
            startTime = intArrayOf(1, 2, 3),
            endTime = intArrayOf(3, 2, 7),
            queryTime = 4,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution1450().busyStudent(
            startTime = intArrayOf(4),
            endTime = intArrayOf(4),
            queryTime = 4,
        )

        // Then
        assertEquals(expected, actual)
    }
}
