package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3194Test {

    @Test
    fun test1() {
        // Given
        val expected = 5.5

        // When
        val actual = Solution3194().minimumAverage(nums = intArrayOf(7, 8, 3, 4, 15, 13, 4, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 5.5

        // When
        val actual = Solution3194().minimumAverage(nums = intArrayOf(1, 9, 8, 3, 10, 5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 5.0

        // When
        val actual = Solution3194().minimumAverage(nums = intArrayOf(1, 2, 3, 7, 8, 9))

        // Then
        assertEquals(expected, actual)
    }
}
