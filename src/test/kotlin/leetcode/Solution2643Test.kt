package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2643Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 1)

        // When
        val actual = Solution2643().rowAndMaximumOnes(
            mat = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 2)

        // When
        val actual = Solution2643().rowAndMaximumOnes(
            mat = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1))
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(1, 2)

        // When
        val actual = Solution2643().rowAndMaximumOnes(
            mat = arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(0, 0))
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
