package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1200Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(
            listOf(1, 2),
            listOf(2, 3),
            listOf(3, 4),
        )

        // When
        val actual = Solution1200().minimumAbsDifference(arr = intArrayOf(4, 2, 1, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(
            listOf(1, 3),
        )

        // When
        val actual = Solution1200().minimumAbsDifference(arr = intArrayOf(1, 3, 6, 10, 15))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(
            listOf(-14, -10),
            listOf(19, 23),
            listOf(23, 27),
        )

        // When
        val actual = Solution1200().minimumAbsDifference(arr = intArrayOf(3, 8, -10, 23, 19, -4, -14, 27))

        // Then
        assertEquals(expected, actual)
    }
}
