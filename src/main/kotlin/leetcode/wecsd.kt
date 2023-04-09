package leetcode

fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    val result = mutableListOf<Int>()
    (nums.indices).map { result.add(index[it], nums[it]) }
    return result.toIntArray()
}
