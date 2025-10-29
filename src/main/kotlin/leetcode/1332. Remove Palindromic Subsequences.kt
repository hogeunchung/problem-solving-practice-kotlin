package leetcode

class Solution1332 {

    fun removePalindromeSub(s: String): Int {
        val n = s.length
        for (i in 0 until n / 2) {
            if (s[i] != s[n - 1 - i]) {
                return 2
            }
        }

        return 1
    }
}
