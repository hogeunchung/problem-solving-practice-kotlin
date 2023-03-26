package leetcode

fun surfaceArea(grid: Array<IntArray>): Int {
    val n = grid.size
    var result = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (grid[i][j] != 0) result += 2

            val height = grid[i][j]
            for (h in 1..height) {
                if (i == 0 || h > grid[i - 1][j]) result++
                if (i == n - 1 || h > grid[i + 1][j]) result++
                if (j == 0 || h > grid[i][j - 1]) result++
                if (j == n - 1 || h > grid[i][j + 1]) result++
            }
        }
    }

    return result
}
