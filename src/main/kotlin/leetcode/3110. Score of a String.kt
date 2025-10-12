package leetcode

import kotlin.math.abs

class Solution3110 {

    fun scoreOfString(s: String): Int {
        var result = 0
        for (i in 0 until s.length - 1) {
            result += abs(s[i] - s[i + 1])
        }

        return result
    }
}
