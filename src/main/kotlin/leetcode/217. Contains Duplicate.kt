package leetcode

fun containsDuplicate(nums: IntArray): Boolean {
    val cache = mutableSetOf<Int>()
    for (i in nums.indices)
        if (cache.add(nums[i]).not()) return true
    return false
}
