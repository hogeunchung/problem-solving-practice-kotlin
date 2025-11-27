package leetcode

class Solution3190 {

    fun minimumOperations(nums: IntArray): Int {
        var opCount = 0
        nums.map { num -> if (num % 3 != 0) opCount++ }

        return opCount
    }
}
