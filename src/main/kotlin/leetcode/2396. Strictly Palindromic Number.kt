package leetcode

class Solution2396 {

    fun isStrictlyPalindromic(n: Int): Boolean {
        for (base in 2..n - 2) {
            if (isPalindromic(n = n, base = base).not()) {
                return false
            }
        }

        return true
    }

    private fun isPalindromic(n: Int, base: Int): Boolean {
        val representations = mutableListOf<Int>()
        var curr = n
        while (curr > 0) {
            representations.add(curr % base)
            curr /= base
        }

        for (i in 0 until representations.size / 2) {
            if (representations[i] != representations[representations.size - 1 - i]) {
                return false
            }
        }

        return true
    }
}
