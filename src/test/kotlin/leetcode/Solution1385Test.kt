package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1385Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution1385().findTheDistanceValue(
            arr1 = intArrayOf(4, 5, 8),
            arr2 = intArrayOf(10, 9, 1, 8),
            d = 2,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution1385().findTheDistanceValue(
            arr1 = intArrayOf(1, 4, 2, 3),
            arr2 = intArrayOf(-4, -3, 6, 10, 20, 30),
            d = 3,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = Solution1385().findTheDistanceValue(
            arr1 = intArrayOf(2, 1, 100, 3),
            arr2 = intArrayOf(-5, -2, 10, -3, 7),
            d = 6,
        )

        // Then
        assertEquals(expected, actual)
    }
}
