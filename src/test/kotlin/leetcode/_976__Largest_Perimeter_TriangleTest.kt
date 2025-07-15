package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _976__Largest_Perimeter_TriangleTest {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = largestPerimeter(nums = intArrayOf(2, 1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = largestPerimeter(nums = intArrayOf(1, 2, 1, 10))

        // Then
        assertEquals(expected, actual)
    }
}
