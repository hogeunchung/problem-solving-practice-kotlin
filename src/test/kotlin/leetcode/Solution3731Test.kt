package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3731Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(3)

        // When
        val actual = Solution3731().findMissingElements(nums = intArrayOf(1, 4, 2, 5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = emptyList<Int>()

        // When
        val actual = Solution3731().findMissingElements(nums = intArrayOf(7, 8, 6, 9))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(2, 3, 4)

        // When
        val actual = Solution3731().findMissingElements(nums = intArrayOf(5, 1))

        // Then
        assertEquals(expected, actual)
    }
}
