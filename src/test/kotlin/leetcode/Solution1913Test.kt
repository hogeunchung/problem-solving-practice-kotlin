package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1913Test {

    @Test
    fun test1() {
        // Given
        val expected = 34

        // When
        val actual = Solution1913().maxProductDifference(nums = intArrayOf(5, 6, 2, 7, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 64

        // When
        val actual = Solution1913().maxProductDifference(nums = intArrayOf(4, 2, 5, 9, 7, 4, 8))

        // Then
        assertEquals(expected, actual)
    }
}
