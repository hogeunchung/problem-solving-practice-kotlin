package leetcode

fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
    val sortedNums = nums.sorted().toMutableList()
    for (i in 0 until k) {
        val smallest = sortedNums.removeAt(0)
        if (smallest == 0) break

        val idx = findIdx(nums = sortedNums, num = -smallest)
        sortedNums.add(idx, -smallest)
    }

    return sortedNums.sum()
}

private fun findIdx(nums: List<Int>, num: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val curr = left + (right - left) / 2
        if (num == nums[curr]) {
            return curr
        } else if (num < nums[curr]) {
            right = curr - 1
        } else if (num > nums[curr]) {
            left = curr + 1
        }
    }

    return left
}
