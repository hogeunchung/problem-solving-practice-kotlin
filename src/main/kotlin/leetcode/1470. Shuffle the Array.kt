package leetcode

fun shuffle(nums: IntArray, n: Int): IntArray {
    val result = IntArray(2 * n)
    for (i in 0 until n) {
        result[2 * i] = nums[i]
        result[2 * i + 1] = nums[n + i]
    }
    return result
}
