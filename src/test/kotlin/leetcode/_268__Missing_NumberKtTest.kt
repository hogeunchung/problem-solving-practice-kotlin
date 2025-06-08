package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _268__Missing_NumberKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = missingNumber(nums = intArrayOf(3, 0, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = missingNumber(nums = intArrayOf(0, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 8

        // When
        val actual = missingNumber(nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1))

        // Then
        assertEquals(expected, actual)
    }
}
