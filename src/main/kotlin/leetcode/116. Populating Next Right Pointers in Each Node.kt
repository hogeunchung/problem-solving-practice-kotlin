package leetcode

import leetcode.dataStructure.Node

fun connect(root: Node?): Node? {
    val nodes = mutableListOf<Node>()

    val queue = ArrayDeque<Node>()
    if (root != null) queue.add(root)

    while (queue.isNotEmpty()) {
        val curr = queue.removeFirst()
        nodes.add(curr)

        if (curr.left != null) queue.add(curr.left!!)
        if (curr.right != null) queue.add(curr.right!!)
    }

    var curr = 2
    (0 until nodes.size - 1).forEach { idx ->
        if (idx + 1 == curr - 1) {
            curr *= 2
            return@forEach
        } else {
            nodes[idx].next = nodes[idx + 1]
        }
    }

    return root
}
