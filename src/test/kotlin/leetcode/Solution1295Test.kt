package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1295Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution1295().findNumbers(nums = intArrayOf(12, 345, 2, 6, 7896))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution1295().findNumbers(nums = intArrayOf(555, 901, 482, 1771))

        // Then
        assertEquals(expected, actual)
    }
}
