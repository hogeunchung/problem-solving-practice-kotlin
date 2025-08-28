package leetcode

import leetcode.dataStructure.TreeNode

fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
    if (root1 == null && root2 == null) return null

    val newRoot = TreeNode((root1?.`val` ?: 0) + (root2?.`val` ?: 0))
    newRoot.left = mergeTrees(root1 = root1?.left, root2 = root2?.left)
    newRoot.right = mergeTrees(root1 = root1?.right, root2 = root2?.right)

    return newRoot
}
