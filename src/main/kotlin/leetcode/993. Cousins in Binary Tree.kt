package leetcode

import leetcode.dataStructure.TreeNode

fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
    if (root?.left?.`val` == root?.right?.`val`) return false

    val searched = mutableMapOf<Int, Int>()
    search(root = root, x = x, y = y, searched = searched, height = 0)

    if (searched[x] == null) return false
    if (searched[y] == null) return false
    if (searched[x] != searched[y]) return false

    return true
}

private fun search(root: TreeNode?, x: Int, y: Int, searched: MutableMap<Int, Int>, height: Int) {
    if (root == null) return

    if (root.left?.`val` == x && root.right?.`val` == y) return
    if (root.left?.`val` == y && root.right?.`val` == x) return

    if (root.`val` == x) {
        searched[x] = height
        if (searched[y] != null) return
    }
    if (root.`val` == y) {
        searched[y] = height
        if (searched[x] != null) return
    }

    search(root = root.left, x = x, y = y, searched = searched, height = height + 1)
    search(root = root.right, x = x, y = y, searched = searched, height = height + 1)
}
