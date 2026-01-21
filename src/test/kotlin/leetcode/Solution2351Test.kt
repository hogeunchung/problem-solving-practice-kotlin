package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2351Test {

    @Test
    fun test1() {
        // Given
        val expected = 'c'

        // When
        val actual = Solution2351().repeatedCharacter(s = "abccbaacz")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 'd'

        // When
        val actual = Solution2351().repeatedCharacter(s = "abcdd")

        // Then
        assertEquals(expected, actual)
    }
}
