package leetcode

import leetcode.dataStructure.TreeNode
import kotlin.math.max

fun isBalanced(root: TreeNode?): Boolean {
    if (root == null) return true
    if ((height(root.left) - height(root.right) in (-1..1)).not()) {
        return false
    }
    return isBalanced(root.left) && isBalanced(root.right)
}

private fun height(root: TreeNode?): Int {
    if (root == null) return 0
    return max(height(root.left), height(root.right)) + 1
}
