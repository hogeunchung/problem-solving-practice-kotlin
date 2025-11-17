package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1356Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(0, 1, 2, 4, 8, 3, 5, 6, 7)

        // When
        val actual = Solution1356().sortByBits(arr = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024)

        // When
        val actual = Solution1356().sortByBits(arr = intArrayOf(1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1))

        // Then
        assertArrayEquals(expected, actual)
    }
}
