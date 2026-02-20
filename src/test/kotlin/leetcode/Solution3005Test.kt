package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3005Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution3005().maxFrequencyElements(nums = intArrayOf(1, 2, 2, 3, 1, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 5

        // When
        val actual = Solution3005().maxFrequencyElements(nums = intArrayOf(1, 2, 3, 4, 5))

        // Then
        assertEquals(expected, actual)
    }
}
