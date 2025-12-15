package leetcode

class Solution2108 {

    fun firstPalindrome(words: Array<String>): String {
        return words.firstOrNull { it.isPalindrome() } ?: ""
    }

    private fun String.isPalindrome(): Boolean {
        val n = this.length
        for (i in 0 until n / 2) {
            if (this[i] != this[n - 1 - i]) return false
        }

        return true
    }
}
