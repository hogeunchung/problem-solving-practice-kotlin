package leetcode

import kotlin.math.max
import kotlin.math.min

class Solution1380 {

    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val m = matrix.size
        val n = matrix[0].size
        val minInRow = IntArray(m) { Int.MAX_VALUE }
        val minInCol = IntArray(n) { Int.MIN_VALUE }

        for (i in 0 until m) {
            for (j in 0 until n) {
                minInRow[i] = min(minInRow[i], matrix[i][j])
                minInCol[j] = max(minInCol[j], matrix[i][j])
            }
        }

        return minInRow.intersect(minInCol.toSet()).toList()
    }
}
