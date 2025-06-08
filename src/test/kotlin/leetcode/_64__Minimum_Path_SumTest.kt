package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _64__Minimum_Path_SumTest {

    @Test
    fun test1() {
        // Given
        val expected = 7

        // When
        val actual = minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1)))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 12

        // When
        val actual = minPathSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)))

        // Then
        assertEquals(expected, actual)
    }
}
