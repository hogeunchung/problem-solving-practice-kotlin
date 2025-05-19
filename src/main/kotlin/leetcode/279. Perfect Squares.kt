package leetcode

import kotlin.math.sqrt

fun numSquares(n: Int): Int {
    val sqrt = sqrt(n.toDouble()).toInt()
    val memo = IntArray(n + 1)

    memo[0] = 0
    for (si in 1..sqrt) {
        memo[si * si] = 1
    }

    for (ni in 1..n) {
        val min = (1..sqrt)
            .mapNotNull { si -> memo.getOrNull(ni - si * si) }
            .minOrNull()

        memo[ni] = if (min == null) {
            Int.MAX_VALUE
        } else {
            min + 1
        }
    }

    return memo[n]
}
