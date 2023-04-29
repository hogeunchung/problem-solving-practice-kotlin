package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _463__Island_PerimeterKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 16

        // Act
        val actual = islandPerimeter(
            grid = arrayOf(
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 1, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 0, 0),
            )
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 4

        // Act
        val actual = islandPerimeter(
            grid = arrayOf(
                intArrayOf(1),
            )
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 4

        // Act
        val actual = islandPerimeter(
            grid = arrayOf(
                intArrayOf(1, 0),
            )
        )

        // Assert
        assertEquals(expected, actual)
    }
}