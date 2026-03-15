package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3783Test {

    @Test
    fun test1() {
        // Given
        val expected = 27

        // When
        val actual = Solution3783().mirrorDistance(n = 25)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 9

        // When
        val actual = Solution3783().mirrorDistance(n = 10)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution3783().mirrorDistance(n = 7)

        // Then
        assertEquals(expected, actual)
    }
}
