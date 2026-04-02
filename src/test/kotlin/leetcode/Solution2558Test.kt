package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2558Test {

    @Test
    fun test1() {
        // Given
        val expected = 29L

        // When
        val actual = Solution2558().pickGifts(gifts = intArrayOf(25, 64, 9, 4, 100), k = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4L

        // When
        val actual = Solution2558().pickGifts(gifts = intArrayOf(1, 1, 1, 1), k = 4)

        // Then
        assertEquals(expected, actual)
    }
}
