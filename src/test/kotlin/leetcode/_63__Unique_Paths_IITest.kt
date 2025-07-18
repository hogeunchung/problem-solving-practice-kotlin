package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _63__Unique_Paths_IITest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = uniquePathsWithObstacles(
            obstacleGrid = arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = uniquePathsWithObstacles(
            obstacleGrid = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 0),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
