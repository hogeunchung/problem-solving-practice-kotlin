package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2206Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution2206().divideArray(nums = intArrayOf(3, 2, 3, 2, 2, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution2206().divideArray(nums = intArrayOf(1, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }
}
