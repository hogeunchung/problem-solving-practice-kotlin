package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2965Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2, 4)

        // When
        val actual = Solution2965().findMissingAndRepeatedValues(
            grid = arrayOf(
                intArrayOf(1, 3),
                intArrayOf(2, 2),
            )
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(9, 5)

        // When
        val actual = Solution2965().findMissingAndRepeatedValues(
            grid = arrayOf(
                intArrayOf(9, 1, 7),
                intArrayOf(8, 9, 2),
                intArrayOf(3, 4, 6),
            )
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(1, 2)

        // When
        val actual = Solution2965().findMissingAndRepeatedValues(
            grid = arrayOf(
                intArrayOf(1, 4),
                intArrayOf(1, 3),
            )
        )

        actual.forEach {
            println(it)
        }

        // Then
        assertArrayEquals(expected, actual)
    }
}
