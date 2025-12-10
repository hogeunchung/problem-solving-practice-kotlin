package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3668Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(3, 1, 4)

        // When
        val actual = Solution3668().recoverOrder(order = intArrayOf(3, 1, 2, 5, 4), friends = intArrayOf(1, 3, 4))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(5, 2)

        // When
        val actual = Solution3668().recoverOrder(order = intArrayOf(1, 4, 5, 3, 2), friends = intArrayOf(2, 5))

        // Then
        assertArrayEquals(expected, actual)
    }
}
