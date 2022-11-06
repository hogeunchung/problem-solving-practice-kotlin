package leetcode

fun search(nums: IntArray, target: Int): Int {
    var lo = 0
    var hi = nums.size - 1
    var mid: Int
    while (lo <= hi) {
        mid = (lo + hi) / 2
        if (nums[mid] < target) {
            lo = mid + 1
        } else if (nums[mid] > target) {
            hi = mid - 1
        } else {
            return mid
        }
    }

    return -1
}
