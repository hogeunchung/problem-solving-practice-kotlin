package leetcode

import kotlin.math.max

fun rob(nums: IntArray): Int {
    val n = nums.size
    val memo = Array(n) { IntArray(2) }

    // 0: unrobbed, 1: robbed
    memo[0][0] = 0
    memo[0][1] = nums[0]

    for (i in 1 until n) {
        memo[i][0] = max(memo[i - 1][0], memo[i - 1][1])
        memo[i][1] = memo[i - 1][0] + nums[i]
    }

    return max(memo[n - 1][0], memo[n - 1][1])
}
