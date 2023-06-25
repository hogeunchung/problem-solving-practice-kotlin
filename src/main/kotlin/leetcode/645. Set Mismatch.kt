package leetcode

fun findErrorNums(nums: IntArray): IntArray {
    val result = intArrayOf(-1, -1)
    val visits = BooleanArray(nums.size + 1) { false }
    nums.map {
        if (visits[it]) result[0] = it
        visits[it] = true
    }
    for (it in 1 until visits.size) {
        if (visits[it].not()) {
            result[1] = it
            break
        }
    }

    return result
}
