package leetcode

import leetcode.dataStructure.TreeNode

fun tree2str(root: TreeNode?): String {
    if (root == null) return ""

    var result = "${root.`val`}"
    if (root.left != null && root.right != null) result += "(${tree2str(root.left)})(${tree2str(root.right)})"
    else if (root.left != null) result += "(${tree2str(root.left)})"
    else if (root.right != null) result += "()(${tree2str(root.right)})"

    return result
}
