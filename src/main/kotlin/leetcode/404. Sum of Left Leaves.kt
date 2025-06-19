package leetcode

import leetcode.dataStructure.TreeNode

fun sumOfLeftLeaves(root: TreeNode?): Int {
    if (root == null) return 0

    return if (root.left != null && (root.left!!.left == null && root.left!!.right == null)) {
        root.left!!.`val` + sumOfLeftLeaves(root = root.right)
    } else {
        sumOfLeftLeaves(root = root.left) + sumOfLeftLeaves(root = root.right)
    }
}
