package leetcode

import kotlin.math.abs
import kotlin.math.min

fun shortestToChar(s: String, c: Char): IntArray {
    val occurrenceIndices = s
        .withIndex()
        .filter { it.value == c }
        .map { it.index }

    val n = s.length
    val result = IntArray(n)

    for (i in 0 until n) {
        var idxDiff = Int.MAX_VALUE
        for (j in 0 until occurrenceIndices.size) {
            idxDiff = min(idxDiff, abs(i - occurrenceIndices[j]))
        }

        result[i] = idxDiff
    }

    return result
}
