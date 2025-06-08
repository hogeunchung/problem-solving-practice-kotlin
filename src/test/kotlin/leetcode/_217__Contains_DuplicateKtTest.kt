package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _217__Contains_DuplicateKtTest {
    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = containsDuplicate(nums = intArrayOf(1, 2, 3, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = containsDuplicate(nums = intArrayOf(1, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = containsDuplicate(nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))

        // Then
        assertEquals(expected, actual)
    }
}
