package leetcode

fun findMin(nums: IntArray): Int {
    var low = 0
    var high = nums.size - 1

    while (true) {
        println("[$low] ${nums[low]} to [$high] ${nums[high]}")
        Thread.sleep(200)
        if (low == high || nums[low] < nums[high]) {
            return nums[low]
        }

        val mid = (low + high) / 2
        if (nums[low] > nums[mid]) {
            high = mid
        } else if (nums[mid] > nums[high]) {
            low = mid + 1
        }
    }
}
