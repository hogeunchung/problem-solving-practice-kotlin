package leetcode

fun largestLocal(grid: Array<IntArray>): Array<IntArray> {
    val ySize = grid.size
    val xSize = grid[0].size
    val compressedGrid = Array(ySize - 2) { IntArray(xSize - 2) }
    for (y in 1 until ySize - 1) {
        for (x in 1 until xSize - 1) {
            var localMax = -1
            for (dy in -1..1) {
                for (dx in -1..1) {
                    if (grid[y + dy][x + dx] > localMax) localMax = grid[y + dy][x + dx]
                }
            }
            compressedGrid[y - 1][x - 1] = localMax
        }
    }
    return compressedGrid
}
