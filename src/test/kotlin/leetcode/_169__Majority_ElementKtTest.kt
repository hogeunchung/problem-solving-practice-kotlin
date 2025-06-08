package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _169__Majority_ElementKtTest {
    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = majorityElement(intArrayOf(3, 2, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2))

        // Then
        assertEquals(expected, actual)
    }
}
