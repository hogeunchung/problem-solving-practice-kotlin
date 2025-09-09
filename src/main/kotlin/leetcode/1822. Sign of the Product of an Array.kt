package leetcode

fun arraySign(nums: IntArray): Int {
    val n = nums.size
    var isPositive = true

    for (i in 0 until n) {
        when {
            nums[i] == 0 -> return 0
            nums[i] > 0 -> Unit
            else -> isPositive = isPositive.not()
        }
    }

    return if (isPositive) 1 else -1
}
