package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2089Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(1, 2)

        // When
        val actual = Solution2089().targetIndices(nums = intArrayOf(1, 2, 5, 2, 3), target = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(3)

        // When
        val actual = Solution2089().targetIndices(nums = intArrayOf(1, 2, 5, 2, 3), target = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(4)

        // When
        val actual = Solution2089().targetIndices(nums = intArrayOf(1, 2, 5, 2, 3), target = 5)

        // Then
        assertEquals(expected, actual)
    }
}
