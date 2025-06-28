package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1389__Create_Target_Array_in_the_Given_OrderTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 4, 1, 3, 2)

        // When
        val actual = createTargetArray(nums = intArrayOf(0, 1, 2, 3, 4), index = intArrayOf(0, 1, 2, 2, 1))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(0, 1, 2, 3, 4)

        // When
        val actual = createTargetArray(nums = intArrayOf(1, 2, 3, 4, 0), index = intArrayOf(0, 1, 2, 3, 0))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(1)

        // When
        val actual = createTargetArray(nums = intArrayOf(1), index = intArrayOf(0))

        // Then
        assertArrayEquals(expected, actual)
    }
}
