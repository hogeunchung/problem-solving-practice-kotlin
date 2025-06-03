package leetcode

fun sortColors(nums: IntArray): Unit {
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
