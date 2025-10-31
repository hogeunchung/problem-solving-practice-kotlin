package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2119Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution2119().isSameAfterReversals(num = 526)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution2119().isSameAfterReversals(num = 1800)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = Solution2119().isSameAfterReversals(num = 0)

        // Then
        assertEquals(expected, actual)
    }
}
