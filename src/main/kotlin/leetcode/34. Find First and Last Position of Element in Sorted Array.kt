package leetcode

fun searchRange(nums: IntArray, target: Int): IntArray {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (nums[mid] < target) {
            left = mid + 1
        } else if (nums[mid] == target) {
            while (nums[left] < nums[mid]) left++
            while (nums[right] > nums[mid]) right--

            return intArrayOf(left, right)
        } else {
            right = mid - 1
        }
    }

    return intArrayOf(-1, -1)
}
