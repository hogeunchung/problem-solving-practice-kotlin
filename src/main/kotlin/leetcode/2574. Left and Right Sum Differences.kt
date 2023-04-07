package leetcode

fun leftRigthDifference(nums: IntArray): IntArray {
    val len = nums.size

    val ls = nums.copyOf()
    (1 until len).map { ls[it] += ls[it - 1] }

    val rs = nums.copyOf()
    (len - 2 downTo 0).map { rs[it] += rs[it + 1] }

    return (0 until len).map {
        val diff = ls[it] - rs[it]
        if (diff >= 0) diff else -diff
    }.toIntArray()
}
