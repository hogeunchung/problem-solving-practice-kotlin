package leetcode

import leetcode.dataStructure.TreeNode

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val temp = root.left
    root.left = invertTree(root.right)
    root.right = invertTree(temp)

    return root
}
