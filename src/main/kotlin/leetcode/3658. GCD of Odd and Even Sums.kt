package leetcode

class Solution3658 {

    fun gcdOfOddEvenSums(n: Int): Int {
        val sumOdd = 2 * n * (2 * n + 1) / 2
        val sumEven = sumOdd + n

        return gcd(sumOdd, sumEven)
    }

    private fun gcd(a: Int, b: Int): Int =
        when {
            b == 0 -> a
            a < b -> gcd(b - a, a)
            else -> gcd(a - b, b)
        }
}
