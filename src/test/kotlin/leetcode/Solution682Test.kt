package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution682Test {

    @Test
    fun test1() {
        // Given
        val expected = 30

        // When
        val actual = Solution682().calPoints(operations = arrayOf("5", "2", "C", "D", "+"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 27

        // When
        val actual = Solution682().calPoints(operations = arrayOf("5", "-2", "4", "C", "D", "9", "+", "+"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution682().calPoints(operations = arrayOf("1", "C"))

        // Then
        assertEquals(expected, actual)
    }
}
