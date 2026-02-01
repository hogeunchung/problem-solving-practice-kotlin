package leetcode

import kotlin.math.max

class Solution3427 {

    fun subarraySum(nums: IntArray): Int {
        var result = 0
        for (i in 0 until nums.size) {
            val start = max(0, i - nums[i])
            for (j in start..i) {
                result += nums[j]
            }
        }

        return result
    }
}
