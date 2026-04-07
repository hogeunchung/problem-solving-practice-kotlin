package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2578Test {

    @Test
    fun test1() {
        // Given
        val expected = 59

        // When
        val actual = Solution2578().splitNum(num = 4325)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 75

        // When
        val actual = Solution2578().splitNum(num = 687)

        // Then
        assertEquals(expected, actual)
    }
}
