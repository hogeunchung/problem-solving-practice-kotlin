package leetcode

class Solution2124 {

    fun checkString(s: String): Boolean {
        val n = s.length
        var bAppeared = false

        for (i in 0 until n) {
            if (s[i] == 'a') {
                if (bAppeared) return false
            } else if (s[i] == 'b') {
                bAppeared = true
            }
        }

        return true
    }
}
