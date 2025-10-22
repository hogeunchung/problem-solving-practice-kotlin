package leetcode

import kotlin.math.max
import kotlin.math.min

class Solution1413 {

    fun minStartValue(nums: IntArray): Int {
        var minSum = Int.MAX_VALUE
        var currSum = 0

        for (i in 0 until nums.size) {
            currSum += nums[i]
            minSum = min(minSum, currSum)
        }

        return max(1, 1 - minSum)
    }
}
