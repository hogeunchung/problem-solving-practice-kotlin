package leetcode

class Solution2656 {

    fun maximizeSum(nums: IntArray, k: Int): Int {
        return (2 * nums.max() + k - 1) * k / 2
    }
}
