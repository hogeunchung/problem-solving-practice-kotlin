package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _3218__Minimum_Cost_for_Cutting_Cake_ITest {

    @Test
    fun test1() {
        // Given
        val expected = 13

        // When
        val actual = minimumCost(m = 3, n = 2, horizontalCut = intArrayOf(1, 3), verticalCut = intArrayOf(5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 15

        // When
        val actual = minimumCost(m = 2, n = 2, horizontalCut = intArrayOf(7), verticalCut = intArrayOf(4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 258

        // When
        val actual = minimumCost(
            m = 7,
            n = 4,
            horizontalCut = intArrayOf(13, 6, 12, 14, 4, 7),
            verticalCut = intArrayOf(14, 15, 11),
        )

        // Then
        assertEquals(expected, actual)
    }
}
