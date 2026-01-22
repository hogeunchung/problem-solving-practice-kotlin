package leetcode

class Solution2923 {

    fun findChampion(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size

        for (i in 0 until n) {
            var weak = false
            for (j in 0 until m) {
                if (i == j) continue
                if (grid[i][j] == 0) {
                    weak = true
                    break
                }
            }

            if (weak.not()) {
                return i
            }
        }

        return -1
    }
}
