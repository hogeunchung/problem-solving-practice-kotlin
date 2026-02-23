package leetcode

import kotlin.math.pow

class Solution1828 {

    fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
        return queries
            .map { query ->
                points.count { point ->
                    (query[0] - point[0]).square() + (query[1] - point[1]).square() <= query[2].square()
                }
            }
            .toIntArray()
    }

    private fun Int.square(): Double =
        this.toDouble().pow(2)
}
