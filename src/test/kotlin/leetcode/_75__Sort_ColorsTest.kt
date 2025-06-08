package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _75__Sort_ColorsTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 0, 1, 1, 2, 2)

        // When
        val actual = intArrayOf(2, 0, 2, 1, 1, 0)
        sortColors(nums = actual)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(0, 1, 2)

        // When
        val actual = intArrayOf(2, 0, 1)
        sortColors(nums = actual)

        // Then
        assertArrayEquals(expected, actual)
    }
}
