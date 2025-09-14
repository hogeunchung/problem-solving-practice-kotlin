package leetcode

fun isPathCrossing(path: String): Boolean {
    val n = path.length

    val visit = mutableMapOf<Point, Boolean>()
    val curr = Point(x = 0, y = 0)
    visit[curr] = true

    for (i in 0 until n) {
        when (path[i]) {
            'E' -> curr.x += 1
            'W' -> curr.x -= 1
            'S' -> curr.y -= 1
            'N' -> curr.y += 1
            else -> Unit
        }
        if (visit[curr] == true) return true

        visit[curr] = true
    }

    return false
}

data class Point(
    var x: Int,
    var y: Int,
)
