package leetcode

import kotlin.math.max
import kotlin.math.min

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    if (intervals.isEmpty()) return arrayOf(newInterval)

    val n = intervals.size

    var firstOverlappingIdx = -1
    var lastOverlappingIdx = -1
    var hasOverlapping = false
    for (i in 0 until n) {
        if (intervals[i].isOverlapping(other = newInterval)) {
            if (hasOverlapping.not()) firstOverlappingIdx = i
            lastOverlappingIdx = i
            hasOverlapping = true

            newInterval[0] = min(newInterval[0], intervals[i][0])
            newInterval[1] = max(newInterval[1], intervals[i][1])
        }
    }

    if (hasOverlapping) {
        val result = mutableListOf<IntArray>()

        for (i in 0 until firstOverlappingIdx) result.add(intervals[i])
        result.add(newInterval)
        for (i in lastOverlappingIdx + 1 until n) result.add(intervals[i])

        return result.toTypedArray()
    } else {
        val result = intervals.toMutableList()

        val newIntervalIdx = intervals.indexOfLast { interval -> interval[0] < newInterval[0] } + 1
        result.add(newIntervalIdx, newInterval)

        return result.toTypedArray()
    }
}

private fun IntArray.isOverlapping(other: IntArray): Boolean {
    if (this[1] < other[0]) return false
    if (other[1] < this[0]) return false

    return true
}
