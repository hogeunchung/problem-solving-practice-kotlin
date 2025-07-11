package leetcode

import leetcode.dataStructure.TreeNode

fun isUnivalTree(root: TreeNode?): Boolean {
    return isUnivalTree(root = root, value = root?.`val`)
}

private fun isUnivalTree(root: TreeNode?, value: Int?): Boolean {
    if (root == null) return true
    if (value == null) return true
    if (root.`val` == value) return isUnivalTree(root = root.left, value) && isUnivalTree(root = root.right, value)

    return false
}
