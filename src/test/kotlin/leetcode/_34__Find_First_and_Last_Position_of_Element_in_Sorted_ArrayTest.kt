package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _34__Find_First_and_Last_Position_of_Element_in_Sorted_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(3, 4)

        // When
        val actual = searchRange(nums = intArrayOf(5, 7, 7, 8, 8, 10), target = 8)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(-1, -1)

        // When
        val actual = searchRange(nums = intArrayOf(5, 7, 7, 8, 8, 10), target = 6)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(-1, -1)

        // When
        val actual = searchRange(nums = intArrayOf(), target = 0)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = intArrayOf(0, 0)

        // When
        val actual = searchRange(nums = intArrayOf(1), target = 1)

        // Then
        assertArrayEquals(expected, actual)
    }
}
