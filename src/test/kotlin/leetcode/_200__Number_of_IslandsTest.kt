package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _200__Number_of_IslandsTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 1

        // Act
        val actual = numIslands(
            grid = arrayOf(
                charArrayOf('1', '1', '1', '1', '0'),
                charArrayOf('1', '1', '0', '1', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '0', '0', '0'),
            )
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 3

        // Act
        val actual = numIslands(
            grid = arrayOf(
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '1', '0', '0'),
                charArrayOf('0', '0', '0', '1', '1'),
            )
        )

        // Assert
        assertEquals(expected, actual)
    }
}
