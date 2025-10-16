package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution3289Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 1)

        // When
        val actual = Solution3289().getSneakyNumbers(nums = intArrayOf(0, 1, 1, 0))

        // Then
        assertEquals(expected.sorted(), actual.sorted())
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(2, 3)

        // When
        val actual = Solution3289().getSneakyNumbers(nums = intArrayOf(0, 3, 2, 1, 3, 2))

        // Then
        assertEquals(expected.sorted(), actual.sorted())
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(4, 5)

        // When
        val actual = Solution3289().getSneakyNumbers(nums = intArrayOf(7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2))

        // Then
        assertEquals(expected.sorted(), actual.sorted())
    }
}
