package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2391Test {

    @Test
    fun test1() {
        // Given
        val expected = 21

        // When
        val actual = Solution2391().garbageCollection(
            garbage = arrayOf("G", "P", "GP", "GG"),
            travel = intArrayOf(2, 4, 3),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 37

        // When
        val actual = Solution2391().garbageCollection(
            garbage = arrayOf("MMM", "PGM", "GP"),
            travel = intArrayOf(3, 10),
        )

        // Then
        assertEquals(expected, actual)
    }
}
