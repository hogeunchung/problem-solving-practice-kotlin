package leetcode

import kotlin.math.max

fun rob2(nums: IntArray): Int {
    val n = nums.size
    if (n == 1) return nums[0]

    // 0: unrobbed, 1: robbed
    val memo = Array(n) { IntArray(2) }
    var result = -1

    // 0 is not robbed
    memo[1][0] = 0
    memo[1][1] = nums[1]

    for (i in 2 until n) {
        memo[i][0] = max(memo[i - 1][0], memo[i - 1][1])
        memo[i][1] = memo[i - 1][0] + nums[i]
    }

    result = max(memo[n - 1][0], memo[n - 1][1])

    // 0 is robbed
    memo[1][0] = nums[0]
    memo[1][1] = nums[0]

    for (i in 2 until n) {
        memo[i][0] = max(memo[i - 1][0], memo[i - 1][1])
        memo[i][1] = memo[i - 1][0] + nums[i]
    }

    result = max(result, memo[n - 1][0])

    return result
}
