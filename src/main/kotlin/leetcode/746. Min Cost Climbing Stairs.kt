package leetcode

import kotlin.math.min

fun minCostClimbingStairs(cost: IntArray): Int {
    val n = cost.size
    val memo = IntArray(n + 1)
    for (i in 2 until n + 1) {
        memo[i] = min(memo[i - 1] + cost[i - 1], memo[i - 2] + cost[i - 2])
    }

    return memo[n]
}
