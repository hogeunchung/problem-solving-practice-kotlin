package leetcode

fun check(nums: IntArray): Boolean {
    val n = nums.size

    var rotateIdx = -1
    for (i in 0 until n - 1) {
        if (nums[i] > nums[i + 1]) {
            rotateIdx = i + 1
            break
        }
    }
    if (rotateIdx == -1) {
        return true
    }

    for (i in 0 until n - 1) {
        if (nums[(rotateIdx + i) % n] > nums[(rotateIdx + i + 1) % n]) {
            return false
        }
    }

    return true
}
