package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _892__Surface_Area_of_3D_ShapesKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 34

        // When
        val actual = surfaceArea(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 32

        // When
        val actual = surfaceArea(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1)))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 46

        // When
        val actual = surfaceArea(arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 1, 2), intArrayOf(2, 2, 2)))

        // Then
        assertEquals(expected, actual)
    }
}
