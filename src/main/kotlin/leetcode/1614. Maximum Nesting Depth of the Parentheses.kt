package leetcode

import kotlin.math.max

class Solution1614 {

    fun maxDepth(s: String): Int {
        var parenthesesDepth = 0
        var maxParenthesesDepth = 0

        s.forEach {
            when (it) {
                '(' -> {
                    parenthesesDepth++
                    maxParenthesesDepth = max(maxParenthesesDepth, parenthesesDepth)
                }

                ')' -> parenthesesDepth--
            }
        }

        return maxParenthesesDepth
    }
}
