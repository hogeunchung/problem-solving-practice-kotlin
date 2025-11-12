package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2180Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution2180().countEven(num = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 14

        // When
        val actual = Solution2180().countEven(num = 30)

        // Then
        assertEquals(expected, actual)
    }
}
