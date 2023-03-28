package leetcode

fun findSubarrays(nums: IntArray): Boolean {
    val counts = mutableSetOf<Int>()
    for (i in 0 until (nums.size - 1)) {
        val partialSum = nums[i] + nums[i + 1]
        if (counts.contains(partialSum)) return true
        counts.add(partialSum)
    }
    return false
}
