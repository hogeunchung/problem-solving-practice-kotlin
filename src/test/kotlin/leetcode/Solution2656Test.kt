package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2656Test {

    @Test
    fun test1() {
        // Given
        val expected = 18

        // When
        val actual = Solution2656().maximizeSum(nums = intArrayOf(1, 2, 3, 4, 5), k = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 11

        // When
        val actual = Solution2656().maximizeSum(nums = intArrayOf(5, 5, 5), k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
