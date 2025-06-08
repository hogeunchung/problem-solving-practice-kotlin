package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _53__Maximum_SubarrayTest {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = maxSubArray(intArrayOf(1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 23

        // When
        val actual = maxSubArray(intArrayOf(5, 4, -1, 7, 8))

        // Then
        assertEquals(expected, actual)
    }

}
