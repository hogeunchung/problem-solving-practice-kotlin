package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _219__Contains_Duplicate_IIKtTest {
    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1), k = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = containsNearbyDuplicate(nums = intArrayOf(1, 0, 1, 1), k = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1, 2, 3), k = 2)

        // Then
        assertEquals(expected, actual)
    }
}
