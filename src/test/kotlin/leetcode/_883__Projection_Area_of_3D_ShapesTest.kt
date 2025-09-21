package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _883__Projection_Area_of_3D_ShapesTest {

    @Test
    fun test1() {
        // Given
        val expected = 17

        // When
        val actual = projectionArea(grid = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 8

        // When
        val actual = projectionArea(grid = arrayOf(intArrayOf(1, 0), intArrayOf(0, 2)))

        // Then
        assertEquals(expected, actual)
    }
}
