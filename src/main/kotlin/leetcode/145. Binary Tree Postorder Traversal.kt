package leetcode

import leetcode.dataStructure.TreeNode

fun postorderTraversal(root: TreeNode?): List<Int> {
    val trace = mutableListOf<Int>()
    traverse(root = root, trace = trace)

    return trace
}

private fun traverse(root: TreeNode?, trace: MutableList<Int>) {
    if (root == null) return

    traverse(root = root.left, trace = trace)
    traverse(root = root.right, trace = trace)
    trace.add(root.`val`)
}
