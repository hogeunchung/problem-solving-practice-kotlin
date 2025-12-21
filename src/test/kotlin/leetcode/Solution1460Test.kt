package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1460Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution1460().canBeEqual(target = intArrayOf(1, 2, 3, 4), arr = intArrayOf(2, 4, 1, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = Solution1460().canBeEqual(target = intArrayOf(7), arr = intArrayOf(7))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = Solution1460().canBeEqual(target = intArrayOf(3, 7, 9), arr = intArrayOf(3, 7, 11))

        // Then
        assertEquals(expected, actual)
    }
}
