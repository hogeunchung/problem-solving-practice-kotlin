package leetcode

fun repeatedNTimes(nums: IntArray): Int {
    val found = mutableMapOf<Int, Boolean>()
    nums.forEach { num ->
        if (found[num] == true) return num
        found[num] = true
    }

    return -1
}
