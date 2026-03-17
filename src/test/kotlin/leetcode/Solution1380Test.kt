package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1380Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(15)

        // When
        val actual = Solution1380().luckyNumbers(
            matrix = arrayOf(
                intArrayOf(3, 7, 8),
                intArrayOf(9, 11, 13),
                intArrayOf(15, 16, 17),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(12)

        // When
        val actual = Solution1380().luckyNumbers(
            matrix = arrayOf(
                intArrayOf(1, 10, 4, 2),
                intArrayOf(9, 3, 8, 7),
                intArrayOf(15, 16, 17, 12),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(7)

        // When
        val actual = Solution1380().luckyNumbers(
            matrix = arrayOf(
                intArrayOf(7, 8),
                intArrayOf(1, 2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }
}
