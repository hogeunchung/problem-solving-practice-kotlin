package leetcode

import leetcode.dataStructure.TreeNode
import kotlin.math.max

fun averageOfLevels(root: TreeNode?): DoubleArray {
    val height = calcHeight(root = root)
    val sums = LongArray(height)
    val counts = IntArray(height)

    helper(height = 0, root = root, sums = sums, counts = counts)

    return sums
        .mapIndexed { idx, sum -> sum / counts[idx].toDouble() }
        .toDoubleArray()
}

private fun calcHeight(root: TreeNode?): Int {
    if (root == null) return 0
    return max(calcHeight(root = root.left), calcHeight(root = root.right)) + 1
}

private fun helper(height: Int, root: TreeNode?, sums: LongArray, counts: IntArray) {
    if (root == null) return

    sums[height] += root.`val`
    counts[height]++

    helper(height = height + 1, root = root.left, sums = sums, counts = counts)
    helper(height = height + 1, root = root.right, sums = sums, counts = counts)
}
