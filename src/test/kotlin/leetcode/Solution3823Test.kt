package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3823Test {

    @Test
    fun test1() {
        // Given
        val expected = "(fad@cb#e)"

        // When
        val actual = Solution3823().reverseByType(s = ")ebc#da@f(")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "z"

        // When
        val actual = Solution3823().reverseByType(s = "z")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = ")(*&^%$#@!"

        // When
        val actual = Solution3823().reverseByType(s = "!@#$%^&*()")

        // Then
        assertEquals(expected, actual)
    }
}
