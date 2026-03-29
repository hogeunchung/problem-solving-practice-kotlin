package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3550Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution3550().smallestIndex(nums = intArrayOf(1, 3, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution3550().smallestIndex(nums = intArrayOf(1, 10, 11))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -1

        // When
        val actual = Solution3550().smallestIndex(nums = intArrayOf(1, 2, 3))

        // Then
        assertEquals(expected, actual)
    }
}
