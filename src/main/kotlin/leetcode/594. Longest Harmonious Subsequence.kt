package leetcode

import kotlin.math.max

fun findLHS(nums: IntArray): Int {
    val counts = mutableMapOf<Int, Int>()
    nums.map { counts[it] = counts.getOrDefault(it, 0) + 1 }

    var maxLength = 0
    counts.keys.map {
        if (counts.contains(it - 1)) {
            val length = counts[it]!! + counts[it - 1]!!
            maxLength = max(maxLength, length)
        }
        if (counts.contains(it + 1)) {
            val length = counts[it]!! + counts[it + 1]!!
            maxLength = max(maxLength, length)
        }
    }

    return maxLength
}
