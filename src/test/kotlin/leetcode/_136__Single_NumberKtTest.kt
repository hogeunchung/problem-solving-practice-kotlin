package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _136__Single_NumberKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = singleNumber(nums = intArrayOf(2, 2, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = singleNumber(nums = intArrayOf(4, 1, 2, 1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = singleNumber(nums = intArrayOf(1))

        // Then
        assertEquals(expected, actual)
    }
}
