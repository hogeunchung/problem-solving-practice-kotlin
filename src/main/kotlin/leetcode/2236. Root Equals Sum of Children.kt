package leetcode

import leetcode.dataStructure.TreeNode

class Solution2236 {

    fun checkTree(root: TreeNode?): Boolean {
        return root!!.`val` == root.left!!.`val` + root.right!!.`val`
    }
}
