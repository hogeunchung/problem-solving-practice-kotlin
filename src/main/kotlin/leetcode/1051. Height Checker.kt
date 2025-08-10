package leetcode

fun heightChecker(heights: IntArray): Int {
    val sortedHeights = heights.sorted()
    var result = 0
    for (i in 0 until heights.size) {
        if (heights[i] != sortedHeights[i]) result++
    }

    return result
}
