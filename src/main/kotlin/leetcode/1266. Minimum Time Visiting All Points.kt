package leetcode

import kotlin.math.abs
import kotlin.math.max

class Solution1266 {

    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var timeCost = 0
        for (i in 0 until points.size - 1) {
            val from = points[i]
            val to = points[i + 1]

            timeCost += max(abs(from[0] - to[0]), abs(from[1] - to[1]))
        }

        return timeCost
    }
}
