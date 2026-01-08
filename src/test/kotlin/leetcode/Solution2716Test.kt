package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2716Test {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = Solution2716().minimizedStringLength(s = "aaabc")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution2716().minimizedStringLength(s = "cbbd")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 4

        // When
        val actual = Solution2716().minimizedStringLength(s = "baadccab")

        // Then
        assertEquals(expected, actual)
    }
}
