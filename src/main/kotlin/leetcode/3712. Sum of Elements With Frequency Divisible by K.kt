package leetcode

class Solution3712 {

    fun sumDivisibleByK(nums: IntArray, k: Int): Int {
        return nums
            .groupBy { it }
            .values
            .asSequence()
            .filter { it.size % k == 0 }
            .sumOf { it.sum() }
    }
}
