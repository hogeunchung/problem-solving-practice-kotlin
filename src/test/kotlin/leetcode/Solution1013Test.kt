package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution1013Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution1013().canThreePartsEqualSum(arr = intArrayOf(0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution1013().canThreePartsEqualSum(arr = intArrayOf(0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = Solution1013().canThreePartsEqualSum(arr = intArrayOf(3, 3, 6, 5, -2, 2, 5, 1, -9, 4))

        // Then
        assertEquals(expected, actual)
    }
}
