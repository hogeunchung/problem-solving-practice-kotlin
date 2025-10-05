package leetcode

import leetcode.dataStructure.TreeNode

class Solution653 {

    fun findTarget(root: TreeNode?, k: Int): Boolean {
        val nodeValues = mutableListOf<Int>()
        fillNodeValues(root = root, nodeValues = nodeValues)

        var left = 0
        var right = nodeValues.size - 1

        while (left < right) {
            val sum = nodeValues[left] + nodeValues[right]
            when {
                k < sum -> right--
                sum < k -> left++
                else -> return true
            }
        }

        return false
    }

    private fun fillNodeValues(root: TreeNode?, nodeValues: MutableList<Int>) {
        if (root == null) return

        fillNodeValues(root.left, nodeValues = nodeValues)
        nodeValues.add(root.`val`)
        fillNodeValues(root.right, nodeValues = nodeValues)
    }
}
