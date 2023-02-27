package leetcode

import leetcode.dataStructure.TreeNode

fun isSymmetric(root: TreeNode?): Boolean {
    val leftTraverseList = mutableListOf<Int?>()
    val rightTraverseList = mutableListOf<Int?>()

    leftTraverse(root = root, list = leftTraverseList)
    rightTraverse(root = root, list = rightTraverseList)

    return leftTraverseList == rightTraverseList
}

private fun leftTraverse(root: TreeNode?, list: MutableList<Int?>) {
    list.add(root?.`val`)

    if (root == null) return

    leftTraverse(root.left, list)
    rightTraverse(root.right, list)
}

private fun rightTraverse(root: TreeNode?, list: MutableList<Int?>) {
    list.add(root?.`val`)

    if (root == null) return

    rightTraverse(root.right, list)
    leftTraverse(root.left, list)
}
