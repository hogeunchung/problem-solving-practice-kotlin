package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3300Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution3300().minElement(nums = intArrayOf(10, 12, 13, 14))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution3300().minElement(nums = intArrayOf(1, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 10

        // When
        val actual = Solution3300().minElement(nums = intArrayOf(999, 19, 199))

        // Then
        assertEquals(expected, actual)
    }
}
