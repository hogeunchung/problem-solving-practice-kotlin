package leetcode

import leetcode.dataStructure.TreeNode

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return sortedArrayToBSTHelper(nums, 0, nums.size - 1)
}

fun sortedArrayToBSTHelper(nums: IntArray, first: Int, last: Int): TreeNode? {
    if (first > last) return null

    val mid = (first + last) / 2
    val l = sortedArrayToBSTHelper(nums, first, mid - 1)
    val r = sortedArrayToBSTHelper(nums, mid + 1, last)

    return TreeNode(nums[mid], l, r)
}
