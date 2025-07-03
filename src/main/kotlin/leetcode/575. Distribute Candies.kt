package leetcode

import kotlin.math.min

fun distributeCandies(candyType: IntArray): Int {
    return min(candyType.toSet().size, candyType.size / 2)
}
