package leetcode

fun missingNumber(nums: IntArray): Int =
    nums.size * (nums.size + 1) / 2 - nums.fold(0) { total, num -> total + num }
