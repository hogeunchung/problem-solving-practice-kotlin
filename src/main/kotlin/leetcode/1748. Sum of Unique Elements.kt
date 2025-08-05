package leetcode

fun sumOfUnique(nums: IntArray): Int {
    return nums
        .groupBy { it }
        .filter { it.value.size == 1 }
        .map { it.key }
        .sum()
}
