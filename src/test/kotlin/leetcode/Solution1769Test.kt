package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1769Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(1, 1, 3)

        // When
        val actual = Solution1769().minOperations(boxes = "110")

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(11, 8, 5, 4, 3, 4)

        // When
        val actual = Solution1769().minOperations(boxes = "001011")

        // Then
        assertArrayEquals(expected, actual)
    }
}
