package leetcode

import leetcode.dataStructure.TreeNode

fun preorderTraversal(root: TreeNode?): List<Int> {
    val trace = mutableListOf<Int>()
    traverse(root = root, trace = trace)

    return trace
}

private fun traverse(root: TreeNode?, trace: MutableList<Int>) {
    if (root == null) return

    trace.add(root.`val`)
    traverse(root = root.left, trace = trace)
    traverse(root = root.right, trace = trace)
}
