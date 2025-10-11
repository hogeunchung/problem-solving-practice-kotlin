package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution1037Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution1037().isBoomerang(
            points = arrayOf(
                intArrayOf(1, 1),
                intArrayOf(2, 3),
                intArrayOf(3, 2),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution1037().isBoomerang(
            points = arrayOf(
                intArrayOf(1, 1),
                intArrayOf(2, 2),
                intArrayOf(3, 3),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = Solution1037().isBoomerang(
            points = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 1),
                intArrayOf(2, 1),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = false

        // When
        val actual = Solution1037().isBoomerang(
            points = arrayOf(
                intArrayOf(73, 31),
                intArrayOf(73, 19),
                intArrayOf(73, 45),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = false

        // When
        val actual = Solution1037().isBoomerang(
            points = arrayOf(
                intArrayOf(22, 33),
                intArrayOf(37, 27),
                intArrayOf(67, 15),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
