package leetcode

import kotlin.math.min

fun minimumDifference(nums: IntArray, k: Int): Int {
    val n = nums.size
    val sortedNums = nums.sorted()
    var minDiff = Int.MAX_VALUE

    for (i in 0..n - k) {
        minDiff = min(minDiff, sortedNums[i + k - 1] - sortedNums[i])
    }

    return minDiff
}
