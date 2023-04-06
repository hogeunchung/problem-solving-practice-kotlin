package leetcode

fun numIdenticalPairs(nums: IntArray): Int {
    return nums
        .groupBy { it }.values
        .map { it.size }
        .filter { it >= 2 }
        .map { it * (it - 1) / 2 }
        .sum()
}
