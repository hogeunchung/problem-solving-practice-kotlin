package leetcode

fun sortColors0(nums: IntArray): Unit {
    val n = nums.size
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (nums[i] > nums[j]) {
                val temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp
            }
        }
    }
}

fun sortColors(nums: IntArray): Unit {
    var low = 0
    var mid = 0
    var high = nums.size - 1

    while (mid <= high) {
        when (nums[mid]) {
            0 -> {
                swap(nums = nums, i = low, j = mid)
                low++
                mid++
            }

            1 -> {
                mid++
            }

            2 -> {
                swap(nums = nums, i = high, j = mid)
                high--
            }
        }
    }
}

private fun swap(nums: IntArray, i: Int, j: Int) {
    val temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
}
