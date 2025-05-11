package leetcode

import kotlin.math.min

// Memory: O(m * n)
fun minPathSum1(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val memo = Array(m) { IntArray(n) { Int.MAX_VALUE } }

    memo[0][0] = grid[0][0]
    for (mi in 0 until m) {
        for (ni in 0 until n) {
            when {
                mi == 0 && ni == 0 -> continue
                mi > 0 && ni > 0 -> memo[mi][ni] = grid[mi][ni] + min(memo[mi - 1][ni], memo[mi][ni - 1])
                mi > 0 -> memo[mi][ni] = grid[mi][ni] + memo[mi - 1][ni]
                else -> memo[mi][ni] = grid[mi][ni] + memo[mi][ni - 1]
            }
        }
    }

    return memo[m - 1][n - 1]
}

// Memory: O(n)
fun minPathSum2(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val memo = Array(n) { Int.MAX_VALUE }

    memo[0] = grid[0][0]
    for (mi in 0 until m) {
        for (ni in 0 until n) {
            when {
                mi == 0 && ni == 0 -> continue
                mi > 0 && ni > 0 -> memo[ni] = grid[mi][ni] + min(memo[ni], memo[ni - 1])
                mi > 0 -> memo[ni] = grid[mi][ni] + memo[ni]
                else -> memo[ni] = grid[mi][ni] + memo[ni - 1]
            }
        }
    }

    return memo[n - 1]
}

// Memory: O(n)
fun minPathSum3(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val memo = Array(n) { Int.MAX_VALUE }

    memo[0] = grid[0][0]
    for (ni in 1 until n) {
        memo[ni] = grid[0][ni] + memo[ni - 1]
    }

    for (mi in 1 until m) {
        for (ni in 0 until n) {
            when {
                ni == 0 -> memo[ni] = grid[mi][ni] + memo[ni]
                else -> memo[ni] = grid[mi][ni] + min(memo[ni], memo[ni - 1])
            }
        }
    }

    return memo[n - 1]
}

// Memory: No extra memory
fun minPathSum(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size

    for (ni in 1 until n) {
        grid[0][ni] += grid[0][ni - 1]
    }

    for (mi in 1 until m) {
        for (ni in 0 until n) {
            when {
                ni == 0 -> grid[mi][ni] += grid[mi - 1][ni]
                else -> grid[mi][ni] += min(grid[mi - 1][ni], grid[mi][ni - 1])
            }
        }
    }

    return grid[m - 1][n - 1]
}
