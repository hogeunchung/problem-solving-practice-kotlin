package leetcode

class Solution3340 {

    fun isBalanced(num: String): Boolean {
        val digits = num
            .toCharArray()
            .map { it.digitToInt() }

        var evenSum = 0
        var oddSum = 0
        for (i in 0 until digits.size) {
            if (i % 2 == 0) {
                evenSum += digits[i]
            } else {
                oddSum += digits[i]
            }
        }

        return evenSum == oddSum
    }
}
