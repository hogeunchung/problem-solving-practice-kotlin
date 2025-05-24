package leetcode

import kotlin.math.max

fun maxSubArray(nums: IntArray): Int {
    val n = nums.size
    var max = nums[0]
    var before = nums[0]

    for (i in 1 until n) {
        before = if (before < 0) nums[i] else before + nums[i]
        max = max(before, max)
    }

    return max
}
