package leetcode

import leetcode.dataStructure.TreeNode

fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0

    val leftDepth = maxDepth(root = root.left)
    val rightDepth = maxDepth(root = root.right)
    return 1 + if (leftDepth > rightDepth) leftDepth else rightDepth
}
