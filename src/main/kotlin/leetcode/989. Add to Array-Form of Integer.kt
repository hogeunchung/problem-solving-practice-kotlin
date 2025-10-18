package leetcode

import java.math.BigInteger

class Solution989 {

    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        var sum = BigInteger.ZERO
        var digit = BigInteger.ONE
        for (i in num.size - 1 downTo 0) {
            sum = sum.add(digit.multiply(num[i].toBigInteger()))
            digit = digit.multiply(BigInteger.TEN)
        }
        sum = sum.add(k.toBigInteger())

        return sum
            .toString()
            .toCharArray()
            .map { it.digitToInt() }
    }
}
