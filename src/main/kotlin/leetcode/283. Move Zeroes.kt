package leetcode

fun moveZeroes(nums: IntArray): Unit {
    mergeSort(nums, 0, nums.size)
}

private fun mergeSort(nums: IntArray, l: Int, r: Int) {
    TODO()
//    if (l >= r) return
//
//    val mid = l / 2 + r / 2 + 1
//    mergeSort(nums, l, mid)
//    mergeSort(nums, mid, r)
//
//    var lf = l
//    var rf = mid
//
//    while (true) {
//        if (nums[lf] == 0) {
//
//        }
//    }
}
