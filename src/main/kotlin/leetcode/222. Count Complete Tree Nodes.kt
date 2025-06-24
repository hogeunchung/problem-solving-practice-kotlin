package leetcode

import leetcode.dataStructure.TreeNode

fun countNodes(root: TreeNode?): Int {
    if (root == null) return 0

    return 1 + countNodes(root.left) + countNodes(root.right)
}
