package leetcode

fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
    val m = obstacleGrid.size
    val n = obstacleGrid[0].size

    if (obstacleGrid[0][0] == 1) return 0
    if (obstacleGrid[m - 1][n - 1] == 1) return 0

    val memo = Array(m) { IntArray(n) }
    memo[0][0] = 1

    for (mi in 1 until m) {
        if (obstacleGrid[mi][0] == 0) {
            memo[mi][0] = memo[mi - 1][0]
        }
    }
    for (ni in 1 until n) {
        if (obstacleGrid[0][ni] == 0) {
            memo[0][ni] = memo[0][ni - 1]
        }
    }
    for (mi in 1 until m) {
        for (ni in 1 until n) {
            if (obstacleGrid[mi][ni] == 0) {
                memo[mi][ni] = memo[mi - 1][ni] + memo[mi][ni - 1]
            }
        }
    }

    return memo[m - 1][n - 1]
}
