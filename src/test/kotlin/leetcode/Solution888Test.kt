package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution888Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(1, 2)

        // When
        val actual = Solution888().fairCandySwap(
            aliceSizes = intArrayOf(1, 1),
            bobSizes = intArrayOf(2, 2),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 2)

        // When
        val actual = Solution888().fairCandySwap(
            aliceSizes = intArrayOf(1, 2),
            bobSizes = intArrayOf(2, 3),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(2, 3)

        // When
        val actual = Solution888().fairCandySwap(
            aliceSizes = intArrayOf(2),
            bobSizes = intArrayOf(1, 3),
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
