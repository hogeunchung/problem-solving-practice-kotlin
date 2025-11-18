package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2769Test {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = Solution2769().theMaximumAchievableX(num = 4, t = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 7

        // When
        val actual = Solution2769().theMaximumAchievableX(num = 3, t = 2)

        // Then
        assertEquals(expected, actual)
    }
}
