package leetcode

import kotlin.math.max

fun findLengthOfLCIS(nums: IntArray): Int {
    val n = nums.size

    var currLength = 1
    var maxLength = 1
    for (i in 1 until n) {
        if (nums[i - 1] < nums[i]) {
            currLength++
        } else {
            maxLength = max(maxLength, currLength)
            currLength = 1
        }
    }
    maxLength = max(maxLength, currLength)

    return maxLength
}
