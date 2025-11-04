package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1812Test {

    @Test
    fun test1() {
        // Given
        val expected = false

        // When
        val actual = Solution1812().squareIsWhite(coordinates = "a1")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = Solution1812().squareIsWhite(coordinates = "h3")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = Solution1812().squareIsWhite(coordinates = "c7")

        // Then
        assertEquals(expected, actual)
    }
}
