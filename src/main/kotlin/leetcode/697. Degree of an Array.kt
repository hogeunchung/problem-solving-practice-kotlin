package leetcode

import kotlin.math.max
import kotlin.math.min

fun findShortestSubArray(nums: IntArray): Int {
    val n = nums.size
    val counts = IntArray(50000) { -1 }
    val firstOccurrenceIndexes = IntArray(50000) { -1 }
    val lastOccurrenceIndexes = IntArray(50000) { -1 }

    var maxCount = -1
    for (i in 0 until n) {
        if (firstOccurrenceIndexes[nums[i]] == -1) {
            firstOccurrenceIndexes[nums[i]] = i
        }
        lastOccurrenceIndexes[nums[i]] = i
        counts[nums[i]]++
        maxCount = max(counts[nums[i]], maxCount)
    }

    var minLength = Int.MAX_VALUE
    for (i in 0 until n) {
        if (counts[nums[i]] != -1 && counts[nums[i]] == maxCount) {
            minLength = min(lastOccurrenceIndexes[nums[i]] - firstOccurrenceIndexes[nums[i]] + 1, minLength)
        }
    }

    return minLength
}
