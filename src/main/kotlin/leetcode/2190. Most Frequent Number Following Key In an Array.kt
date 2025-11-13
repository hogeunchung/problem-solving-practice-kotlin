package leetcode

class Solution2190 {

    fun mostFrequent(nums: IntArray, key: Int): Int {
        val n = nums.size
        val targetMap = mutableMapOf<Int, Int>()

        for (i in 0 until n - 1) {
            if (nums[i] == key) {
                targetMap[nums[i + 1]] = targetMap.getOrDefault(nums[i + 1], 0) + 1
            }
        }

        return targetMap.maxBy { it.value }.key
    }
}
