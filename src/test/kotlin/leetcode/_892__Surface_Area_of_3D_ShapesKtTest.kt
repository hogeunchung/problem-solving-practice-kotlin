package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _892__Surface_Area_of_3D_ShapesKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 34

        // Act
        val actual = surfaceArea(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 32

        // Act
        val actual = surfaceArea(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1)))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 46

        // Act
        val actual = surfaceArea(arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 1, 2), intArrayOf(2, 2, 2)))

        // Assert
        assertEquals(expected, actual)
    }
}
