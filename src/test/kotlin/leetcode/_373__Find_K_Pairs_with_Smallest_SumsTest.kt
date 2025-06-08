package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _373__Find_K_Pairs_with_Smallest_SumsTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(listOf(1, 2), listOf(1, 4), listOf(1, 6))

        // When
        val actual = kSmallestPairs(
            nums1 = intArrayOf(1, 7, 11),
            nums2 = intArrayOf(2, 4, 6),
            k = 3,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(listOf(1, 1), listOf(1, 1))

        // When
        val actual = kSmallestPairs(
            nums1 = intArrayOf(1, 1, 2),
            nums2 = intArrayOf(1, 2, 3),
            k = 2,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(listOf(1, 3), listOf(2, 3), listOf(1, 5))

        // When
        val actual = kSmallestPairs(
            nums1 = intArrayOf(1, 2, 4, 5, 6),
            nums2 = intArrayOf(3, 5, 7, 9),
            k = 3,
        )

        // Then
        assertEquals(expected, actual)
    }
}
