package leetcode

import leetcode.dataStructure.Node

fun maxDepth(root: Node?): Int {
    if (root == null) return 0

    return maxDepth(root = root, height = 1)
}

private fun maxDepth(root: Node, height: Int): Int {
    return root.children
        .filterNotNull()
        .maxOfOrNull { child -> maxDepth(root = child, height = height + 1) }
        ?: height
}
