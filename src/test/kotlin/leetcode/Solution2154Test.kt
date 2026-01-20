package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2154Test {

    @Test
    fun test1() {
        // Given
        val expected = 24

        // When
        val actual = Solution2154().findFinalValue(nums = intArrayOf(5, 3, 6, 1, 12), original = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = Solution2154().findFinalValue(nums = intArrayOf(2, 7, 9), original = 4)

        // Then
        assertEquals(expected, actual)
    }
}
