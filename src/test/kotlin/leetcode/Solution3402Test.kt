package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3402Test {

    @Test
    fun test1() {
        // Given
        val expected = 15

        // When
        val actual = Solution3402().minimumOperations(
            grid = arrayOf(
                intArrayOf(3, 2),
                intArrayOf(1, 3),
                intArrayOf(3, 4),
                intArrayOf(0, 1),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 12

        // When
        val actual = Solution3402().minimumOperations(
            grid = arrayOf(
                intArrayOf(3, 2, 1),
                intArrayOf(2, 1, 0),
                intArrayOf(1, 2, 3),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
