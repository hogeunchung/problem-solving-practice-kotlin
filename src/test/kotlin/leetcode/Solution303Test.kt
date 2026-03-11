package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution303Test {

    @Test
    fun test1() {
        // Given
        val numArray = Solution303.NumArray(nums = intArrayOf(-2, 0, 3, -5, 2, -1))

        // When & Then
        assertEquals(numArray.sumRange(0, 2), 1)
        assertEquals(numArray.sumRange(2, 5), -1)
        assertEquals(numArray.sumRange(0, 5), -3)
    }
}
