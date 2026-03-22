package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2103Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution2103().countPoints(rings = "B0B6G0R6R0R6G9")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = Solution2103().countPoints(rings = "B0R0G0R9R0B0G0")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution2103().countPoints(rings = "G4")

        // Then
        assertEquals(expected, actual)
    }
}
