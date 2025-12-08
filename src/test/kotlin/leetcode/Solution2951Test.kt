package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2951Test {

    @Test
    fun test1() {
        // Given
        val expected = emptyList<Int>()

        // When
        val actual = Solution2951().findPeaks(mountain = intArrayOf(2, 4, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(1, 3)

        // When
        val actual = Solution2951().findPeaks(mountain = intArrayOf(1, 4, 3, 8, 5))

        // Then
        assertEquals(expected, actual)
    }
}
