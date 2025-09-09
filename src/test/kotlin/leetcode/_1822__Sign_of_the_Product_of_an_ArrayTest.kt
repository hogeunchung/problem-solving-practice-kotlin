package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1822__Sign_of_the_Product_of_an_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = arraySign(nums = intArrayOf(-1, -2, -3, -4, 3, 2, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = arraySign(nums = intArrayOf(1, 5, 0, 2, -3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -1

        // When
        val actual = arraySign(nums = intArrayOf(-1, 1, -1, 1, -1))

        // Then
        assertEquals(expected, actual)
    }
}
