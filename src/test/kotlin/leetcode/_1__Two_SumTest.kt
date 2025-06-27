package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class _1__Two_SumTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 1)

        // When
        val actual = twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 2)

        // When
        val actual = twoSum(nums = intArrayOf(3, 2, 4), target = 6)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(0, 1)

        // When
        val actual = twoSum(nums = intArrayOf(3, 3), target = 6)

        // Then
        assertArrayEquals(expected, actual)
    }
}
