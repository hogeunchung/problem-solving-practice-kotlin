package leetcode

class Solution2367 {

    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val numSet = nums.toHashSet()
        var tripletCount = 0

        for (i in 1 until nums.size - 1) {
            if (numSet.contains(nums[i] - diff) && numSet.contains(nums[i] + diff)) {
                tripletCount++
            }
        }

        return tripletCount
    }
}
