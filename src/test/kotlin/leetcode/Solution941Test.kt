package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution941Test {

    @Test
    fun test1() {
        // Given
        val expected = false

        // When
        val actual = Solution941().validMountainArray(arr = intArrayOf(2, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution941().validMountainArray(arr = intArrayOf(3, 5, 5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = Solution941().validMountainArray(arr = intArrayOf(0, 3, 2, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = false

        // When
        val actual = Solution941().validMountainArray(arr = intArrayOf(2))

        // Then
        assertEquals(expected, actual)
    }
}
