package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1299Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(18, 6, 6, 6, 1, -1)

        // When
        val actual = Solution1299().replaceElements(arr = intArrayOf(17, 18, 5, 4, 6, 1))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(-1)

        // When
        val actual = Solution1299().replaceElements(arr = intArrayOf(400))

        // Then
        assertArrayEquals(expected, actual)
    }
}
