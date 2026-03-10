package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2022Test {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4),
        )

        // When
        val actual = Solution2022().construct2DArray(original = intArrayOf(1, 2, 3, 4), m = 2, n = 2)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf(
            intArrayOf(1, 2, 3),
        )

        // When
        val actual = Solution2022().construct2DArray(original = intArrayOf(1, 2, 3), m = 1, n = 3)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = emptyArray<IntArray>()

        // When
        val actual = Solution2022().construct2DArray(original = intArrayOf(1, 2), m = 1, n = 1)

        // Then
        assertArrayEquals(expected, actual)
    }

}
