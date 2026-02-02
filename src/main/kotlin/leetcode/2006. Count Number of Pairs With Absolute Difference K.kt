package leetcode

import kotlin.math.abs

class Solution2006 {

    fun countKDifference(nums: IntArray, k: Int): Int {
        val n = nums.size

        var count = 0
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (abs(nums[i] - nums[j]) == k) {
                    count++
                }
            }
        }

        return count
    }
}
