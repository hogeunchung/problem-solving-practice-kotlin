package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1437Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution1437().kLengthApart(nums = intArrayOf(1, 0, 0, 0, 1, 0, 0, 1), k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution1437().kLengthApart(nums = intArrayOf(1, 0, 0, 1, 0, 1), k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
