package leetcode

import kotlin.math.max
import kotlin.math.min

class Solution807 {

    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        val n = grid.size
        val availableHeightGrid = Array(n) { IntArray(n) }

        for (ri in 0 until n) {
            var rowMaxHeight = Int.MIN_VALUE
            for (ci in 0 until n) {
                rowMaxHeight = max(rowMaxHeight, grid[ri][ci])
            }
            for (ci in 0 until n) {
                availableHeightGrid[ri][ci] = rowMaxHeight
            }
        }
        for (ci in 0 until n) {
            var colMaxHeight = Int.MIN_VALUE
            for (ri in 0 until n) {
                colMaxHeight = max(colMaxHeight, grid[ri][ci])
            }
            for (ri in 0 until n) {
                availableHeightGrid[ri][ci] = min(availableHeightGrid[ri][ci], colMaxHeight)
            }
        }

        return availableHeightGrid.sumOf { it.sum() } - grid.sumOf { it.sum() }
    }
}
