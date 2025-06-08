package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _908__Smallest_Range_IKtTest {
    @Test
    fun test1() {
        // Given
        val expected = 0

        // When
        val actual = smallestRangeI(nums = intArrayOf(1), k = 0)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 6

        // When
        val actual = smallestRangeI(nums = intArrayOf(0, 10), k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = smallestRangeI(nums = intArrayOf(1, 3, 6), k = 3)

        // Then
        assertEquals(expected, actual)
    }
}
