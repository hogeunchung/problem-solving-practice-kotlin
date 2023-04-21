package leetcode

fun deleteGreatestValue(grid: Array<IntArray>): Int {
    for (i in grid.indices) grid[i] = grid[i].sortedArray()
    var result = 0
    for (xi in grid[0].size - 1 downTo 0) {
        var m = -1
        for (yi in grid.indices) if (grid[yi][xi] > m) m = grid[yi][xi]
        result += m
    }
    return result
}
