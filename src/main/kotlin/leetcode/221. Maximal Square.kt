package leetcode

import kotlin.math.max
import kotlin.math.min

fun maximalSquare(matrix: Array<CharArray>): Int {
    val m = matrix.size
    val n = matrix[0].size
    val rectangleMemo = Array(m) { IntArray(n) }
    val leftMemo = Array(m) { IntArray(n) }
    val topMemo = Array(m) { IntArray(n) }

    var maxEdgeLength = 0
    for (mi in 0 until m) {
        if (matrix[mi][0] == '1') {
            maxEdgeLength = 1
            rectangleMemo[mi][0] = 1
            leftMemo[mi][0] = 1
        } else {
            rectangleMemo[mi][0] = 0
        }
    }
    for (ni in 0 until n) {
        if (matrix[0][ni] == '1') {
            maxEdgeLength = 1
            rectangleMemo[0][ni] = 1
            topMemo[0][ni] = 1
        } else {
            rectangleMemo[0][ni] = 0
        }
    }

    for (mi in 1 until m) {
        for (ni in 1 until n) {
            if (matrix[mi][ni] == '1') {
                rectangleMemo[mi][ni] =
                    min(rectangleMemo[mi - 1][ni - 1], min(leftMemo[mi][ni - 1], topMemo[mi - 1][ni])) + 1
                maxEdgeLength = max(rectangleMemo[mi][ni], maxEdgeLength)

                leftMemo[mi][ni] = leftMemo[mi][ni - 1] + 1
                topMemo[mi][ni] = topMemo[mi - 1][ni] + 1
            } else {
                rectangleMemo[mi][ni] = 0
                leftMemo[mi][ni] = 0
                topMemo[mi][ni] = 0
            }
        }
    }

    return maxEdgeLength * maxEdgeLength
}
