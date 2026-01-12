package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2363Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(listOf(1, 6), listOf(3, 9), listOf(4, 5))

        // When
        val actual = Solution2363().mergeSimilarItems(
            items1 = arrayOf(intArrayOf(1, 1), intArrayOf(4, 5), intArrayOf(3, 8)),
            items2 = arrayOf(intArrayOf(3, 1), intArrayOf(1, 5)),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(listOf(1, 4), listOf(2, 4), listOf(3, 4))

        // When
        val actual = Solution2363().mergeSimilarItems(
            items1 = arrayOf(intArrayOf(1, 1), intArrayOf(3, 2), intArrayOf(2, 3)),
            items2 = arrayOf(intArrayOf(2, 1), intArrayOf(3, 2), intArrayOf(1, 3)),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(listOf(1, 7), listOf(2, 4), listOf(7, 1))

        // When
        val actual = Solution2363().mergeSimilarItems(
            items1 = arrayOf(intArrayOf(1, 3), intArrayOf(2, 2)),
            items2 = arrayOf(intArrayOf(7, 1), intArrayOf(2, 2), intArrayOf(1, 4)),
        )

        // Then
        assertEquals(expected, actual)
    }
}
