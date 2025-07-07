package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _414__Third_Maximum_NumberTest {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = thirdMax(nums = intArrayOf(3, 2, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = thirdMax(nums = intArrayOf(1, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = thirdMax(nums = intArrayOf(2, 2, 3, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = -2147483648

        // When
        val actual = thirdMax(nums = intArrayOf(1, 2, -2147483648))

        // Then
        assertEquals(expected, actual)
    }
}
