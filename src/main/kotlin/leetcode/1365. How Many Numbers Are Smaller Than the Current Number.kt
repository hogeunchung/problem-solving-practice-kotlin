package leetcode

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val counts = IntArray(501) { 0 }
    nums.forEach { counts[it]++ }
    for (i in 0 until (500)) {
        counts[i + 1] += counts[i]
    }

    return nums.map { if (it <= 0) 0 else counts[it - 1] }.toIntArray()
}
