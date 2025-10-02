package leetcode

import leetcode.dataStructure.TreeNode

class Solution501 {

    fun findMode(root: TreeNode?): IntArray {
        val counts = mutableMapOf<Int, Int>()
        count(root = root, counts = counts)

        val maxCount = counts.maxOfOrNull { it.value }
            ?: return intArrayOf()

        return counts
            .filter { it.value == maxCount }
            .keys
            .toIntArray()
    }

    private fun count(root: TreeNode?, counts: MutableMap<Int, Int>) {
        if (root == null) return

        counts[root.`val`] = counts.getOrDefault(root.`val`, 0) + 1
        count(root.left, counts = counts)
        count(root.right, counts = counts)
    }
}
