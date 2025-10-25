package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1346Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution1346().checkIfExist(arr = intArrayOf(10, 2, 5, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution1346().checkIfExist(arr = intArrayOf(3, 1, 7, 11))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = Solution1346().checkIfExist(arr = intArrayOf(0, -2, 2))

        // Then
        assertEquals(expected, actual)
    }
}
