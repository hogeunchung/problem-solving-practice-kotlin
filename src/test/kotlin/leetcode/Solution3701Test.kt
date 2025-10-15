package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution3701Test {

    @Test
    fun test1() {
        // Given
        val expected = -4

        // When
        val actual = Solution3701().alternatingSum(nums = intArrayOf(1, 3, 5, 7))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 100

        // When
        val actual = Solution3701().alternatingSum(nums = intArrayOf(100))

        // Then
        assertEquals(expected, actual)
    }
}
