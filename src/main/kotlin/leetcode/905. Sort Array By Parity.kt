package leetcode

fun sortArrayByParity(nums: IntArray): IntArray {
    val n = nums.size
    for (i in 0 until n - 1) {
        for (j in 0..n - 2 - i) {
            if (nums[j] % 2 == 1) {
                swap(nums = nums, i = j, j = j + 1)
            }
        }
    }

    return nums
}

private fun swap(nums: IntArray, i: Int, j: Int) {
    val tmp = nums[i]
    nums[i] = nums[j]
    nums[j] = tmp
}
