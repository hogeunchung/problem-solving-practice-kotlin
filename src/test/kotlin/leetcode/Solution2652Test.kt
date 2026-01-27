package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2652Test {

    @Test
    fun test1() {
        // Given
        val expected = 21

        // When
        val actual = Solution2652().sumOfMultiples(n = 7)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 40

        // When
        val actual = Solution2652().sumOfMultiples(n = 10)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 30

        // When
        val actual = Solution2652().sumOfMultiples(n = 9)

        // Then
        assertEquals(expected, actual)
    }
}
