package leetcode

class Solution1863 {

    fun subsetXORSum(nums: IntArray): Int {
        return accXORSum(nums = nums, currXor = 0, i = 0)
    }

    private fun accXORSum(nums: IntArray, currXor: Int, i: Int): Int {
        if (i >= nums.size) return currXor

        return accXORSum(nums = nums, currXor = currXor.xor(nums[i]), i = i + 1) +
                accXORSum(nums = nums, currXor = currXor, i = i + 1)
    }
}
