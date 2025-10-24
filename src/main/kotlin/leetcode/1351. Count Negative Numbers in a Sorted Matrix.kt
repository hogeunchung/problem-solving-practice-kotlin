package leetcode

class Solution1351 {

    fun countNegatives(grid: Array<IntArray>): Int {
        val ySize = grid.size
        val xSize = grid[0].size
        var result = 0

        for (y in 0 until ySize) {
            for (x in 0 until xSize) {
                if (grid[y][x] < 0) result++
            }
        }

        return result
    }
}
