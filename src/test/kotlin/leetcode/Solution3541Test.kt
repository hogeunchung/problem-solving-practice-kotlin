package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3541Test {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = Solution3541().maxFreqSum(s = "successes")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution3541().maxFreqSum(s = "aeiaeia")

        // Then
        assertEquals(expected, actual)
    }
}
