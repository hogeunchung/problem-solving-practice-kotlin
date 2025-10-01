package leetcode

import leetcode.dataStructure.TreeNode
import kotlin.math.abs

class Solution563 {

    fun findTilt(root: TreeNode?): Int {
        if (root == null) return 0

        accumulate(root = root)
        return sumTilt(root = root)
    }

    // Bottom to Top
    private fun accumulate(root: TreeNode) {
        if (root.left != null) {
            accumulate(root.left!!)
            root.`val` += root.left!!.`val`
        }

        if (root.right != null) {
            accumulate(root.right!!)
            root.`val` += root.right!!.`val`
        }
    }

    // Top to Bottom
    private fun sumTilt(root: TreeNode): Int {
        return when {
            root.left != null && root.right == null ->
                abs(root.left!!.`val`) + sumTilt(root.left!!)

            root.left == null && root.right != null ->
                abs(root.right!!.`val`) + sumTilt(root.right!!)

            root.left != null && root.right != null ->
                abs(root.left!!.`val` - root.right!!.`val`) + sumTilt(root.left!!) + sumTilt(root.right!!)

            else -> 0
        }
    }
}
