package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1539Test {

    @Test
    fun test1() {
        // Given
        val expected = 9

        // When
        val actual = Solution1539().findKthPositive(arr = intArrayOf(2, 3, 4, 7, 11), k = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 6

        // When
        val actual = Solution1539().findKthPositive(arr = intArrayOf(1, 2, 3, 4), k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
