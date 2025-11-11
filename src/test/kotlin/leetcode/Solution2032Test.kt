package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2032Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(3, 2)

        // When
        val actual = Solution2032().twoOutOfThree(
            nums1 = intArrayOf(1, 1, 3, 2),
            nums2 = intArrayOf(2, 3),
            nums3 = intArrayOf(3),
        )

        // Then
        assertEquals(expected.sorted(), actual.sorted())
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(2, 3, 1)

        // When
        val actual = Solution2032().twoOutOfThree(
            nums1 = intArrayOf(3, 1),
            nums2 = intArrayOf(2, 3),
            nums3 = intArrayOf(1, 2),
        )

        // Then
        assertEquals(expected.sorted(), actual.sorted())
    }
}
