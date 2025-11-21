package leetcode

class Solution1979 {

    fun findGCD(nums: IntArray): Int {
        val minNum = nums.min()
        val maxNum = nums.max()

        return gcd(a = maxNum, b = minNum)
    }

    private fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a

        return gcd(b, a % b)
    }
}
