package leetcode

import leetcode.dataStructure.TreeNode

class Solution572 {

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null && subRoot == null) return true
        if (root != null && subRoot == null) return false
        if (root == null && subRoot != null) return false

        return isSameTree(root1 = root, root2 = subRoot)
                || isSubtree(root = root?.left, subRoot = subRoot)
                || isSubtree(root = root?.right, subRoot = subRoot)
    }

    private fun isSameTree(root1: TreeNode?, root2: TreeNode?): Boolean {
        if (root1 == null && root2 == null) return true
        if (root1?.`val` != root2?.`val`) return false

        return isSameTree(root1 = root1?.left, root2 = root2?.left)
                && isSameTree(root1 = root1?.right, root2 = root2?.right)
    }
}
