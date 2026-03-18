package leetcode

class Solution2778 {

    fun sumOfSquares(nums: IntArray): Int {
        val n = nums.size

        var result = 0
        for (i in 0 until n) {
            if (n % (i + 1) == 0) {
                result += nums[i] * nums[i]
            }
        }

        return result
    }
}
