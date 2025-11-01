package leetcode

class Solution2089 {

    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        var lessCount = 0
        var targetCount = 0
        for (i in 0 until nums.size) {
            when {
                nums[i] < target -> lessCount++
                target == nums[i] -> targetCount++
                else -> Unit
            }
        }
        return (lessCount until lessCount + targetCount).toList()
    }
}
