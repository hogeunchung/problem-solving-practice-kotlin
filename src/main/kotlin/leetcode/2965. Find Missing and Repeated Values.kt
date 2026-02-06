package leetcode

class Solution2965 {

    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val n = grid.size

        var i = 0
        while (i < n) {
            var j = 0
            while (j < n) {
                if (grid[i][j] != grid[(grid[i][j] - 1) / n][(grid[i][j] - 1) % n]) {
                    val tmp = grid[i][j]
                    grid[i][j] = grid[(tmp - 1) / n][(tmp - 1) % n]
                    grid[(tmp - 1) / n][(tmp - 1) % n] = tmp
                } else {
                    j++
                }
            }
            i++
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (grid[i][j] != n * i + j + 1) {
                    return intArrayOf(grid[i][j], n * i + j + 1)
                }
            }
        }

        throw IllegalStateException()
    }
}
