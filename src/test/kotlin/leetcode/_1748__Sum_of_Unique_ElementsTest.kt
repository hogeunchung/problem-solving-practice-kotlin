package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1748__Sum_of_Unique_ElementsTest {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = sumOfUnique(nums = intArrayOf(1, 2, 3, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = sumOfUnique(nums = intArrayOf(1, 1, 1, 1, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 15

        // When
        val actual = sumOfUnique(nums = intArrayOf(1, 2, 3, 4, 5))

        // Then
        assertEquals(expected, actual)
    }
}
