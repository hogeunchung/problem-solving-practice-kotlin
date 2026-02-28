package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3838Test {

    @Test
    fun test1() {
        // Given
        val expected = "rij"

        // When
        val actual = Solution3838().mapWordWeights(
            words = arrayOf("abcd", "def", "xyz"),
            weights = intArrayOf(5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "yyy"

        // When
        val actual = Solution3838().mapWordWeights(
            words = arrayOf("a", "b", "c"),
            weights = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "g"

        // When
        val actual = Solution3838().mapWordWeights(
            words = arrayOf("abcd"),
            weights = intArrayOf(7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4, 1, 3, 4, 4, 5),
        )

        // Then
        assertEquals(expected, actual)
    }
}
