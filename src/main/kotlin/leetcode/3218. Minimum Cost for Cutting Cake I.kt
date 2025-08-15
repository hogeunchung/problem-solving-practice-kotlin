package leetcode

import kotlin.math.min

fun minimumCost(m: Int, n: Int, horizontalCut: IntArray, verticalCut: IntArray): Int {
    val descendingHorizontalCutCosts = horizontalCut.sortedByDescending { it }
    val descendingVerticalCutCosts = verticalCut.sortedByDescending { it }

    val memo = Array(m) { Array(n) { 0 } }
    for (ni in 1 until n) {
        memo[0][ni] = memo[0][ni - 1] + descendingVerticalCutCosts[ni - 1]
    }
    for (mi in 1 until m) {
        memo[mi][0] = memo[mi - 1][0] + descendingHorizontalCutCosts[mi - 1]
    }
    for (mi in 1 until m) {
        for (ni in 1 until n) {
            val horizontalCutCost = (ni + 1) * descendingHorizontalCutCosts[mi - 1]
            val verticalCutCost = (mi + 1) * descendingVerticalCutCosts[ni - 1]

            memo[mi][ni] = min(memo[mi - 1][ni] + horizontalCutCost, memo[mi][ni - 1] + verticalCutCost)
        }
    }

    return memo[m - 1][n - 1]
}
