package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _643__Maximum_Average_Subarray_ITest {

    @Test
    fun test1() {
        // Given
        val expected = 12.75000

        // When
        val actual = findMaxAverage(nums = intArrayOf(1, 12, -5, -6, 50, 3), k = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 5.00000

        // When
        val actual = findMaxAverage(nums = intArrayOf(5), k = 1)

        // Then
        assertEquals(expected, actual)
    }
}
