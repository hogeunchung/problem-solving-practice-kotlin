package leetcode

import kotlin.math.max

fun maximumGap(nums: IntArray): Int {
    val counts = mutableMapOf<Int, Boolean>()
    nums.forEach { num -> counts[num] = true }

    val sorted = counts.keys.sorted()
    var max = 0
    for (i in 0 until sorted.size - 1) {
        max = max(sorted[i + 1] - sorted[i], max)
    }

    return max
}
