package leetcode

import leetcode.dataStructure.TreeNode

fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
    if (root == null) return 0

    return when {
        root.`val` < low -> rangeSumBST(root = root.right, low = low, high = high)
        root.`val` in low..high -> root.`val` + rangeSumBST(
            root = root.left,
            low = low,
            high = high
        ) + rangeSumBST(root = root.right, low = low, high = high)

        else -> rangeSumBST(root = root.left, low = low, high = high)
    }
}
