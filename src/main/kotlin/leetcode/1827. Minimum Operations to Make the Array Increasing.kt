package leetcode

import kotlin.math.max

class Solution1827 {

    fun minOperations(nums: IntArray): Int {
        var operationCount = 0
        var prev = nums[0]
        for (i in 1 until nums.size) {
            prev = max(nums[i], prev + 1)
            operationCount += prev - nums[i]
        }

        return operationCount
    }
}
