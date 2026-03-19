package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3151Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution3151().isArraySpecial(nums = intArrayOf(1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = Solution3151().isArraySpecial(nums = intArrayOf(2, 1, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = Solution3151().isArraySpecial(nums = intArrayOf(4, 3, 1, 6))

        // Then
        assertEquals(expected, actual)
    }
}
