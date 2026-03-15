package leetcode

import kotlin.math.abs

class Solution3783 {

    fun mirrorDistance(n: Int): Int {
        val base = 10
        val digits = mutableListOf<Int>()

        var curr = n
        while (curr > 0) {
            digits.add(curr % base)
            curr /= base
        }

        var reversed = 0
        var figure = 1
        digits.forEach { digit ->
            reversed = reversed * base + digit
            figure *= base
        }

        return abs(reversed - n)
    }
}
