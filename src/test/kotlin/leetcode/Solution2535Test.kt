package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2535Test {

    @Test
    fun test1() {
        // Given
        val expected = 9

        // When
        val actual = Solution2535().differenceOfSum(nums = intArrayOf(1, 15, 6, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2535().differenceOfSum(nums = intArrayOf(1, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }
}
