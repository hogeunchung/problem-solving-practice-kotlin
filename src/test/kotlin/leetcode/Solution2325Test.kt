package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2325Test {

    @Test
    fun test1() {
        // Given
        val expected = "this is a secret"

        // When
        val actual = Solution2325().decodeMessage(
            key = "the quick brown fox jumps over the lazy dog",
            message = "vkbs bs t suepuv",
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "the five boxing wizards jump quickly"

        // When
        val actual = Solution2325().decodeMessage(
            key = "eljuxhpwnyrdgtqkviszcfmabo",
            message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb",
        )

        // Then
        assertEquals(expected, actual)
    }
}
