package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2315Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution2315().countAsterisks(s = "l|*e*et|c**o|*de|")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2315().countAsterisks(s = "iamprogrammer")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 5

        // When
        val actual = Solution2315().countAsterisks(s = "yo|uar|e**|b|e***au|tifu|l")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = 8

        // When
        val actual = Solution2315().countAsterisks(s = "*||||**||*||**|**||*|||**")

        // Then
        assertEquals(expected, actual)
    }
}
