package leetcode

import leetcode.dataStructure.TreeNode

fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    return leafSequence(root = root1) == leafSequence(root = root2)
}

private fun leafSequence(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()
    if (root.left == null && root.right == null) return listOf(root.`val`)

    return leafSequence(root.left) + leafSequence(root.right)
}
