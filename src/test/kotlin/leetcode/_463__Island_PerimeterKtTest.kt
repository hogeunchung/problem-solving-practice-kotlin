package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _463__Island_PerimeterKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 16

        // When
        val actual = islandPerimeter(
            grid = arrayOf(
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 1, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 0, 0),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = islandPerimeter(
            grid = arrayOf(
                intArrayOf(1),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 4

        // When
        val actual = islandPerimeter(
            grid = arrayOf(
                intArrayOf(1, 0),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
