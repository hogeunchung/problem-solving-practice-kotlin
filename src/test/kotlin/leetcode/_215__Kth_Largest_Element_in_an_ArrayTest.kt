package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _215__Kth_Largest_Element_in_an_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = findKthLargest(nums = intArrayOf(3, 2, 1, 5, 6, 4), k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = findKthLargest(nums = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), k = 4)

        // Then
        assertEquals(expected, actual)
    }
}
