package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1689Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution1689().minPartitions(n = "32")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 8

        // When
        val actual = Solution1689().minPartitions(n = "82734")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 9

        // When
        val actual = Solution1689().minPartitions(n = "27346209830709182346")

        // Then
        assertEquals(expected, actual)
    }
}
