package leetcode

import kotlin.math.max

fun projectionArea(grid: Array<IntArray>): Int {
    val xSize = grid.size
    val ySize = grid[0].size

    val xz = mutableMapOf<Int, Int>()
    val yz = mutableMapOf<Int, Int>()

    var result = 0
    for (x in 0 until xSize) {
        for (y in 0 until ySize) {
            if (grid[x][y] > 0) result++
            xz[x] = max(xz.getOrDefault(x, 0), grid[x][y])
            yz[y] = max(yz.getOrDefault(y, 0), grid[x][y])
        }
    }

    result += xz.values.sum()
    result += yz.values.sum()

    return result
}
