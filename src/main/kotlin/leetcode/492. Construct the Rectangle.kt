package leetcode

import kotlin.math.sqrt

fun constructRectangle(area: Int): IntArray {
    val root = sqrt(area.toFloat())
    var length = if (root > root.toInt())
        root.toInt() + 1
    else
        root.toInt()

    while (true) {
        if (area % length == 0) return intArrayOf(length, area / length)
        length++
    }
}
