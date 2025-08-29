package leetcode

import kotlin.math.max

fun findMaxAverage(nums: IntArray, k: Int): Double {
    var windowSum = 0
    for (i in 0 until k) {
        windowSum += nums[i]
    }
    var maxSum = windowSum

    val n = nums.size
    for (i in 0 until n - k) {
        windowSum += nums[i + k] - nums[i]
        maxSum = max(maxSum, windowSum)
    }

    return maxSum.toDouble() / k
}
