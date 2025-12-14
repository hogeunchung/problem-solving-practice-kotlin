package leetcode

import kotlin.math.min

class Solution3194 {

    fun minimumAverage(nums: IntArray): Double {
        val n = nums.size
        val sortedNums = nums.sorted()

        var minAvg = Double.MAX_VALUE
        for (i in 0 until n / 2) {
            minAvg = min(minAvg, (sortedNums[i] + sortedNums[n - 1 - i]) * 0.5)
        }

        return minAvg
    }
}
