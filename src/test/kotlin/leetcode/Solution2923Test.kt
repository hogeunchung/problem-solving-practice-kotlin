package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2923Test {

    @Test
    fun test1() {
        // Given
        val expected = 0

        // When
        val actual = Solution2923().findChampion(
            grid = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 0),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual =
            Solution2923().findChampion(
                grid = arrayOf(
                    intArrayOf(0, 0, 1),
                    intArrayOf(1, 0, 1),
                    intArrayOf(0, 0, 0),
                )
            )

        // Then
        assertEquals(expected, actual)
    }
}
