package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1710Test {

    @Test
    fun test1() {
        // Given
        val expected = 8

        // When
        val actual = Solution1710().maximumUnits(
            boxTypes = arrayOf(intArrayOf(1, 3), intArrayOf(2, 2), intArrayOf(3, 1)),
            truckSize = 4,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 91

        // When
        val actual = Solution1710().maximumUnits(
            boxTypes = arrayOf(intArrayOf(5, 10), intArrayOf(2, 5), intArrayOf(4, 7), intArrayOf(3, 9)),
            truckSize = 10,
        )

        // Then
        assertEquals(expected, actual)
    }
}
