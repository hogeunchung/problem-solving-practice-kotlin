package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2778Test {

    @Test
    fun test1() {
        // Given
        val expected = 21

        // When
        val actual = Solution2778().sumOfSquares(nums = intArrayOf(1, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 63

        // When
        val actual = Solution2778().sumOfSquares(nums = intArrayOf(2, 7, 1, 19, 18, 3))

        // Then
        assertEquals(expected, actual)
    }
}
