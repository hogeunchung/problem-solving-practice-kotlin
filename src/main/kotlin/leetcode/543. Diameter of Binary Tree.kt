package leetcode

import leetcode.dataStructure.TreeNode
import kotlin.math.max

fun diameterOfBinaryTree(root: TreeNode?): Int {
    if (root == null) return 0

    val candidates = listOf(
        diameterOfBinaryTree(root = root.left),
        diameterOfBinaryTree(root = root.right),
        height(root = root.left) + height(root = root.right),
    )
    return candidates.max()
}

private fun height(root: TreeNode?): Int {
    if (root == null) return 0

    return max(height(root = root.left), height(root = root.right)) + 1
}
