package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3099Test {

    @Test
    fun test1() {
        // Given
        val expected = 9

        // When
        val actual = Solution3099().sumOfTheDigitsOfHarshadNumber(x = 18)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = -1

        // When
        val actual = Solution3099().sumOfTheDigitsOfHarshadNumber(x = 23)

        // Then
        assertEquals(expected, actual)
    }
}
