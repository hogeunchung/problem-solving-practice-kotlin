package leetcode

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val intervalStatus = Array(10001) { false }
    val pointStatus = Array(10001) { false }

    intervals.forEach { interval ->
        if (interval[0] == interval[1]) {
            pointStatus[interval[0]] = true
        }
        for (i in interval[0] until interval[1]) {
            intervalStatus[i] = true
        }
    }

    val result = mutableListOf<IntArray>()

    var first = -1
    var isInterval = false
    for (i in 0..10000) {
        if (intervalStatus[i] && isInterval.not()) {
            first = i
            isInterval = true
        } else if (intervalStatus[i].not() && isInterval) {
            result.add(intArrayOf(first, i))
            isInterval = false
        }
    }

    if (pointStatus[0] && intervalStatus[0].not()) {
        result.add(intArrayOf(0, 0))
    }
    for (i in 1..10000) {
        if (pointStatus[i] && intervalStatus[i].not() && intervalStatus[i - 1].not()) {
            result.add(intArrayOf(i, i))
        }
    }

    return result.toTypedArray()
}
