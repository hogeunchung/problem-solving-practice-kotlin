package leetcode

fun subsets(nums: IntArray): List<List<Int>> {
    return helper(nums = nums, idx = 0)
}

private fun helper(nums: IntArray, idx: Int): List<List<Int>> {
    if (idx == nums.size - 1) return listOf(emptyList(), listOf(nums[idx]))

    val result = helper(nums = nums, idx = idx + 1)
    return result + result.map { it + nums[idx] }
}
