package leetcode

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val n = nums.size

    var i = 0
    while (i < n) {
        if (nums[i] == -1) {
            i++
            continue
        }

        val numExistenceIdx = nums[i] - 1
        if (nums[numExistenceIdx] != -1) {
            nums[i] = nums[numExistenceIdx]
            nums[numExistenceIdx] = -1
            continue
        }

        i++
    }

    return nums.indices
        .filter { nums[it] != -1 }
        .map { it + 1 }
}
