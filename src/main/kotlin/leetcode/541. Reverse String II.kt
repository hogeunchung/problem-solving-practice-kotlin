package leetcode

import kotlin.math.min

fun reverseStr(s: String, k: Int): String {
    val n = s.length
    val chars = s.toCharArray()

    for (i in 0..n / (2 * k)) {
        val startIdx = 2 * k * i
        val endIdx = min(n, 2 * k * i + k)
        reverse(chars = chars, startIdx = startIdx, endIdx = endIdx)
    }

    return chars.joinToString("")
}

private fun reverse(chars: CharArray, startIdx: Int, endIdx: Int) {
    for (i in 0 until (endIdx - startIdx) / 2) {
        swap(chars = chars, i = startIdx + i, j = endIdx - 1 - i)
    }
}

private fun swap(chars: CharArray, i: Int, j: Int) {
    val tmp = chars[i]
    chars[i] = chars[j]
    chars[j] = tmp
}
