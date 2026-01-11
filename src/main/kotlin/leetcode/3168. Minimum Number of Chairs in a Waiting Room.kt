package leetcode

import kotlin.math.max

class Solution3168 {

    fun minimumChairs(s: String): Int {
        var maxNum = 0
        var currNum = 0

        s.forEach { c ->
            when (c) {
                'E' -> maxNum = max(maxNum, ++currNum)
                'L' -> currNum--
            }
        }

        return maxNum
    }
}
