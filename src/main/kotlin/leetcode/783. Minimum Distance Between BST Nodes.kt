package leetcode

import leetcode.dataStructure.TreeNode
import kotlin.math.abs
import kotlin.math.min

fun minDiffInBST(root: TreeNode?): Int {
    return minDiffInBST(root = root, minDiff = Int.MAX_VALUE)
}

private fun minDiffInBST(root: TreeNode?, minDiff: Int): Int {
    if (root == null) return minDiff

    val leftmostNodeOfRightNode = leftmostNode(root = root.right)
    val rightmostNodeOfLeftNode = rightmostNode(root = root.left)

    val diff = when {
        rightmostNodeOfLeftNode != null && leftmostNodeOfRightNode != null ->
            min(
                abs(root.`val` - rightmostNodeOfLeftNode.`val`),
                abs(root.`val` - leftmostNodeOfRightNode.`val`),
            )

        rightmostNodeOfLeftNode != null -> abs(root.`val` - rightmostNodeOfLeftNode.`val`)
        leftmostNodeOfRightNode != null -> abs(root.`val` - leftmostNodeOfRightNode.`val`)
        else -> Int.MAX_VALUE
    }
    val rootMin = min(minDiff, diff)

    val leftMin = minDiffInBST(root = root.left, minDiff = rootMin)
    val rightMin = minDiffInBST(root = root.right, minDiff = rootMin)

    return min(rootMin, min(leftMin, rightMin))
}

private fun leftmostNode(root: TreeNode?): TreeNode? {
    if (root == null) return null
    if (root.left == null) return root

    return leftmostNode(root = root.left)
}

private fun rightmostNode(root: TreeNode?): TreeNode? {
    if (root == null) return null
    if (root.right == null) return root

    return rightmostNode(root = root.right)
}
