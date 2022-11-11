package leetcode

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    val rowSize = image.size
    val colSize = image[0].size
    val startColor = image[sr][sc]

    if (startColor == color) return image

    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.add(sr to sc)
    while (queue.isNotEmpty()) {
        val pos = queue.removeFirst()

        if (image[pos.first][pos.second] == startColor) image[pos.first][pos.second] = color
        else continue

        if (0 <= pos.first - 1) queue.add(pos.first - 1 to pos.second)
        if (0 <= pos.second - 1) queue.add(pos.first to pos.second - 1)
        if (pos.first + 1 < rowSize) queue.add(pos.first + 1 to pos.second)
        if (pos.second + 1 < colSize) queue.add(pos.first to pos.second + 1)
    }

    return image
}
