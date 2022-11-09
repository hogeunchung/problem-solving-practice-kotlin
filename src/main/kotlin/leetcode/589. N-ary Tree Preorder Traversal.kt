package leetcode

import leetcode.dataStructure.Node

fun preorder(root: Node?): List<Int> {
    if (root == null) return emptyList()

    var traversal = mutableListOf(root.`val`)
    for (child in root.children) {
        traversal.addAll(preorder(child))
    }

    return traversal
}
