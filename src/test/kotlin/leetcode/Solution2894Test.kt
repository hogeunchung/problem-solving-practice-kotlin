package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution2894Test {

    @Test
    fun test1() {
        // Given
        val expected = 19

        // When
        val actual = Solution2894().differenceOfSums(n = 10, m = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 15

        // When
        val actual = Solution2894().differenceOfSums(n = 5, m = 6)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -15

        // When
        val actual = Solution2894().differenceOfSums(n = 5, m = 1)

        // Then
        assertEquals(expected, actual)
    }
}
