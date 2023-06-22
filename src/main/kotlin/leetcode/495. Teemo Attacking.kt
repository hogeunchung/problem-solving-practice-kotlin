package leetcode

import kotlin.math.min

fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var count = 0
    (0 until timeSeries.size - 1)
        .map { count += min(timeSeries[it + 1] - timeSeries[it], duration) }

    return count + duration
}
