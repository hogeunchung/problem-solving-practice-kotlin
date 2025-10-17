package leetcode

class Solution3512 {

    fun minOperations(nums: IntArray, k: Int): Int {
        return nums.sum() % k
    }
}
