package leetcode

import kotlin.math.max

fun smallestRangeI(nums: IntArray, k: Int): Int {
    return max(0, (nums.max()!! - nums.min()!!) - 2 * k)
}
