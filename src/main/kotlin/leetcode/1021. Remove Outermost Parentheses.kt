package leetcode

class Solution1021 {

    fun removeOuterParentheses(s: String): String {
        val result = StringBuilder()
        var depth = 0

        for (i in 0 until s.length) {
            if (s[i] == '(') {
                if (depth != 0) {
                    result.append(s[i])
                }
                depth++
            } else if (s[i] == ')') {
                depth--
                if (depth != 0) {
                    result.append(s[i])
                }
            }
        }

        return result.toString()
    }
}
