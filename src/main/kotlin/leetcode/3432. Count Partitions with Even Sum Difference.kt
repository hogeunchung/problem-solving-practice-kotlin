package leetcode

class Solution3432 {

    fun countPartitions(nums: IntArray): Int {
        val n = nums.size
        val acc = IntArray(n)

        acc[0] = nums[0]
        for (i in 1 until n) {
            acc[i] = acc[i - 1] + nums[i]
        }

        return if (acc[n - 1] % 2 == 1) 0
        else n - 1
    }
}
