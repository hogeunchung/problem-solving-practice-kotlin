package leetcode

import leetcode.dataStructure.TreeNode

fun binaryTreePaths(root: TreeNode?): List<String> {
    val result = mutableListOf<List<Int>>()
    collectLeafPaths(root = root, path = emptyList(), result = result)

    return result.map { it.joinToString("->") }
}

private fun collectLeafPaths(root: TreeNode?, path: List<Int>, result: MutableList<List<Int>>) {
    if (root == null) return

    when {
        root.left == null && root.right == null -> {
            result.add(path + root.`val`)
        }

        root.left == null && root.right != null -> {
            collectLeafPaths(root = root.right, path = path + root.`val`, result = result)
        }

        root.left != null && root.right == null -> {
            collectLeafPaths(root = root.left, path = path + root.`val`, result = result)
        }

        else -> {
            collectLeafPaths(root = root.right, path = path + root.`val`, result = result)
            collectLeafPaths(root = root.left, path = path + root.`val`, result = result)
        }
    }
}
