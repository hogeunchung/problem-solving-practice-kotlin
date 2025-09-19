package leetcode

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sqrt

fun largestTriangleArea(points: Array<IntArray>): Double {
    val n = points.size
    var result = 0.0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                val currArea = calcArea(p1 = points[i], p2 = points[j], p3 = points[k])
                result = max(result, currArea)
            }
        }
    }

    return result
}

private fun calcArea(p1: IntArray, p2: IntArray, p3: IntArray): Double {
    val a = calcDistance(p1, p2)
    val b = calcDistance(p2, p3)
    val c = calcDistance(p3, p1)

    // semiperimeter
    val s = (a + b + c) * 0.5

    // Heron's formula
    return sqrt(abs(s * (s - a) * (s - b) * (s - c)))
}

private fun calcDistance(p1: IntArray, p2: IntArray): Double {
    val xDiff = p1[0] - p2[0]
    val yDiff = p1[1] - p2[1]

    return sqrt((xDiff * xDiff + yDiff * yDiff).toDouble())
}
