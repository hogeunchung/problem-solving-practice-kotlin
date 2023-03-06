package leetcode

import leetcode.dataStructure.TreeNode

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) return false
    if (root.left == null && root.right == null && root.`val` == targetSum)
        return true

    val remainder = targetSum - root.`val`
    return hasPathSum(root.left, remainder) || hasPathSum(root.right, remainder)
}
