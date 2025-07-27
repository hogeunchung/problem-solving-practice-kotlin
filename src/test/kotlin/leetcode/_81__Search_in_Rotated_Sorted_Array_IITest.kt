package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class _81__Search_in_Rotated_Sorted_Array_IITest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = search2(nums = intArrayOf(2, 5, 6, 0, 0, 1, 2), target = 0)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = search2(nums = intArrayOf(2, 5, 6, 0, 0, 1, 2), target = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = search2(nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1), target = 2)

        // Then
        assertEquals(expected, actual)
    }
}
