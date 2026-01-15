package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2169Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution2169().countOperations(num1 = 2, num2 = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution2169().countOperations(num1 = 10, num2 = 10)

        // Then
        assertEquals(expected, actual)
    }
}
