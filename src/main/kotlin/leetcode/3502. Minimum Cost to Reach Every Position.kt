package leetcode

import kotlin.math.min

class Solution3502 {

    fun minCosts(cost: IntArray): IntArray {
        val n = cost.size
        val minCosts = IntArray(n)
        var currMin = Int.MAX_VALUE

        for (i in 0 until n) {
            currMin = min(currMin, cost[i])
            minCosts[i] = currMin
        }

        return minCosts
    }
}
