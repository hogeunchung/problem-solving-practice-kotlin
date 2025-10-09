package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution1128Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1128().numEquivDominoPairs(
            dominoes = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 1),
                intArrayOf(3, 4),
                intArrayOf(5, 6),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution1128().numEquivDominoPairs(
            dominoes = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 2),
                intArrayOf(1, 1),
                intArrayOf(1, 2),
                intArrayOf(2, 2),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

}
