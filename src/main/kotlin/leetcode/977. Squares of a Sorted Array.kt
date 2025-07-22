package leetcode

fun sortedSquares0(nums: IntArray): IntArray {
    return nums.map { it * it }.sorted().toIntArray()
}

fun sortedSquares(nums: IntArray): IntArray {
    val n = nums.size
    nums.indices.forEach { i -> nums[i] = nums[i] * nums[i] }

    val result = IntArray(n)
    var left = 0
    var right = n - 1
    for (i in n - 1 downTo 0) {
        when {
            nums[left] < nums[right] -> result[i] = nums[right--]
            else -> result[i] = nums[left++]
        }
    }

    return result
}
