package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2733Test {

    @Test
    fun test1() {
        // Given
        val expected = setOf(2, 3)

        // When
        val actual = Solution2733().findNonMinOrMax(nums = intArrayOf(3, 2, 1, 4))

        // Then
        assertTrue { expected.contains(actual) }
    }

    @Test
    fun test2() {
        // Given
        val expected = -1

        // When
        val actual = Solution2733().findNonMinOrMax(nums = intArrayOf(1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = setOf(2)

        // When
        val actual = Solution2733().findNonMinOrMax(nums = intArrayOf(2, 1, 3))

        // Then
        assertTrue { expected.contains(actual) }
    }
}
