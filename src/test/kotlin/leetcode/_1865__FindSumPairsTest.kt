package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1865__FindSumPairsTest {

    @Test
    fun test1() {
        // Given
        val findSumPairs = FindSumPairs(nums1 = intArrayOf(1, 1, 2, 2, 2, 3), nums2 = intArrayOf(1, 4, 5, 2, 5, 4))

        // When & Then
        assertEquals(8, findSumPairs.count(tot = 7))
        findSumPairs.add(index = 3, `val` = 2)
        assertEquals(2, findSumPairs.count(tot = 8))
        assertEquals(1, findSumPairs.count(tot = 4))
        findSumPairs.add(index = 0, `val` = 1)
        findSumPairs.add(index = 1, `val` = 1)
        assertEquals(11, findSumPairs.count(tot = 7))
    }
}
