package leetcode

fun isMonotonic(nums: IntArray): Boolean {
    return isMonotonicIncreasing(nums) || isMonotonicDecreasing(nums)
}

fun isMonotonicIncreasing(nums: IntArray): Boolean {
    for (i in 0..nums.size - 2)
        if (nums[i] > nums[i + 1]) return false

    return true
}

fun isMonotonicDecreasing(nums: IntArray): Boolean {
    for (i in 0..nums.size - 2)
        if (nums[i] < nums[i + 1]) return false

    return true
}
