package leetcode

import kotlin.math.min

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val initialWindowSize = min(nums.size, k + 1)
    val slidingWindow = nums.slice(0 until initialWindowSize).toMutableSet()
    if (slidingWindow.size != initialWindowSize) return true

    for (i in 1..nums.size - 1 - k) {
        slidingWindow.remove(nums[i - 1])
        if (slidingWindow.add(nums[i + k]).not()) return true
    }

    return false
}
