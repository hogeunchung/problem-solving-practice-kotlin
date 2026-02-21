package leetcode

class Solution3498 {

    fun reverseDegree(s: String): Int {
        return s
            .mapIndexed { index, char -> ('a' - char + 26) * (index + 1) }
            .sum()
    }
}
