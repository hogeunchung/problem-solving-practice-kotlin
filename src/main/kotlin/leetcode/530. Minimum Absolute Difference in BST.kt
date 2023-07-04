package leetcode

import leetcode.dataStructure.TreeNode
import kotlin.math.abs

fun getMinimumDifference(root: TreeNode?): Int {
    root!!
    val candidates = mutableSetOf<Int>()

    if (root.left != null && root.right != null) {
        candidates.add(root.`val` - findLargest(root.left!!).`val`)
        candidates.add(root.`val` - findSmallest(root.right!!).`val`)
        candidates.add(getMinimumDifference(root.left))
        candidates.add(getMinimumDifference(root.right))
    } else if (root.left != null) {
        candidates.add(root.`val` - findLargest(root.left!!).`val`)
        candidates.add(getMinimumDifference(root.left))
    } else if (root.right != null) {
        candidates.add(root.`val` - findSmallest(root.right!!).`val`)
        candidates.add(getMinimumDifference(root.right))
    } else {
        candidates.add(Int.MAX_VALUE)
    }

    return candidates.map { abs(it) }.min()!!
}

fun findLargest(root: TreeNode): TreeNode {
    return if (root.right == null) root
    else findLargest(root.right!!)
}

fun findSmallest(root: TreeNode): TreeNode {
    return if (root.left == null) root
    else findSmallest(root.left!!)
}

