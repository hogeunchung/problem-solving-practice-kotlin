package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1313Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2, 4, 4, 4)

        // When
        val actual = Solution1313().decompressRLElist(nums = intArrayOf(1, 2, 3, 4))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 3, 3)

        // When
        val actual = Solution1313().decompressRLElist(nums = intArrayOf(1, 1, 2, 3))

        // Then
        assertArrayEquals(expected, actual)
    }
}
