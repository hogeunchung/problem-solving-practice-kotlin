package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1550Test {

    @Test
    fun test1() {
        // Given
        val expected = false

        // When
        val actual = Solution1550().threeConsecutiveOdds(arr = intArrayOf(2, 6, 4, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = Solution1550().threeConsecutiveOdds(arr = intArrayOf(1, 2, 34, 3, 4, 5, 7, 23, 12))

        // Then
        assertEquals(expected, actual)
    }
}
