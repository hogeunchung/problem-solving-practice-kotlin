package leetcode

import kotlin.math.min

fun jump(nums: IntArray): Int {
    val n = nums.size
    val jumpCount = IntArray(n) { Int.MAX_VALUE }
    jumpCount[0] = 0

    for (i in 0 until n) {
        for (j in i + 1..min(i + nums[i], n - 1)) {
            if (jumpCount[j] > jumpCount[i] + 1) {
                jumpCount[j] = jumpCount[i] + 1
            }
        }
    }

    return jumpCount[n - 1]
}

fun jump2(nums: IntArray): Int {
    val n = nums.size
    val jumpCount = IntArray(n) { Int.MAX_VALUE }
    jumpCount[0] = 0

    if (n == 1) {
        return 0
    }

    for (i in 0 until n) {
        if (i + nums[i] >= n - 1) {
            return jumpCount[i] + 1
        }
        for (j in i + 1..i + nums[i]) {
            if (jumpCount[j] > jumpCount[i] + 1) {
                jumpCount[j] = jumpCount[i] + 1
            }
        }
    }

    return jumpCount[n - 1]
}
