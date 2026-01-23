package leetcode

class Solution3402 {

    fun minimumOperations(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        var result = 0
        for (j in 0 until n) {
            for (i in 1 until m) {
                if (grid[i][j] <= grid[i - 1][j]) {
                    val opCount = grid[i - 1][j] - grid[i][j] + 1

                    grid[i][j] += opCount
                    result += opCount
                }
            }
        }

        return result
    }
}
