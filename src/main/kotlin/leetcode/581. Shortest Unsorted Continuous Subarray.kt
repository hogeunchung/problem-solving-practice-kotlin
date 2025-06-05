package leetcode

import kotlin.math.max
import kotlin.math.min

fun findUnsortedSubarray(nums: IntArray): Int {
    val n = nums.size

    var left = n - 1
    var right = 0
    var isOrdered = true
    for (i in 0 until n - 1) {
        if (nums[i] > nums[i + 1]) {
            left = i
            isOrdered = false
            break
        }
    }
    for (i in n - 2 downTo 0) {
        if (nums[i] > nums[i + 1]) {
            right = i + 1
            isOrdered = false
            break
        }
    }

    if (isOrdered) return 0

    var localMin = Int.MAX_VALUE
    var localMax = Int.MIN_VALUE
    for (i in left..right) {
        localMin = min(localMin, nums[i])
        localMax = max(localMax, nums[i])
    }

    var globalLeft = left
    var globalRight = right
    for (i in 0 until left) {
        if (nums[i] > localMin) {
            globalLeft = i
            break
        }
    }
    for (i in n - 1 downTo right + 1) {
        if (nums[i] < localMax) {
            globalRight = i
            break
        }
    }

    return globalRight - globalLeft + 1
}
