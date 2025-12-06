package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1417Test {

    @Test
    fun test1() {
        // Given
        val expected = "0a1b2c"

        // When
        val actual = Solution1417().reformat(s = "a0b1c2")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = ""

        // When
        val actual = Solution1417().reformat(s = "leetcode")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = ""

        // When
        val actual = Solution1417().reformat(s = "1229857369")

        // Then
        assertEquals(expected, actual)
    }
}
