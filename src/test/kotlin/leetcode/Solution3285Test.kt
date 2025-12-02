package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3285Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(3, 4)

        // When
        val actual = Solution3285().stableMountains(height = intArrayOf(1, 2, 3, 4, 5), threshold = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(1, 3)

        // When
        val actual = Solution3285().stableMountains(height = intArrayOf(10, 1, 10, 1, 10), threshold = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = emptyList<Int>()

        // When
        val actual = Solution3285().stableMountains(height = intArrayOf(10, 1, 10, 1, 10), threshold = 10)

        // Then
        assertEquals(expected, actual)
    }
}
