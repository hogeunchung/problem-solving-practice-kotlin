package leetcode

fun islandPerimeter(grid: Array<IntArray>): Int {
    var result = 0

    val ySize = grid.size
    val xSize = grid[0].size
    for (y in 0 until ySize) {
        for (x in 0 until xSize) {
            if (grid[y][x] != 1) continue

            if (y == 0) result++
            if (y == ySize - 1) result++
            if (0 < y && grid[y - 1][x] == 0) result++
            if (y < ySize - 1 && grid[y + 1][x] == 0) result++

            if (x == 0) result++
            if (x == xSize - 1) result++
            if (0 < x && grid[y][x - 1] == 0) result++
            if (x < xSize - 1 && grid[y][x + 1] == 0) result++
        }
    }

    return result
}