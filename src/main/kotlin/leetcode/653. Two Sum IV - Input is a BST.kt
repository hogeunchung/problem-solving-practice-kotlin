package leetcode

import leetcode.dataStructure.TreeNode

class Solution653 {

    fun findTarget(root: TreeNode?, k: Int): Boolean {
        val nodeValueExistences = mutableMapOf<Int, Boolean>()
        fillNodeValues(root = root, nodeValueExistences = nodeValueExistences)

        for ((nodeValue, _) in nodeValueExistences) {
            if (nodeValue != k - nodeValue && nodeValueExistences[k - nodeValue] == true) return true
        }

        return false
    }

    private fun fillNodeValues(root: TreeNode?, nodeValueExistences: MutableMap<Int, Boolean>) {
        if (root == null) return

        nodeValueExistences[root.`val`] = true
        fillNodeValues(root = root.left, nodeValueExistences = nodeValueExistences)
        fillNodeValues(root = root.right, nodeValueExistences = nodeValueExistences)
    }
}
