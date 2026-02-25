package leetcode

import leetcode.dataStructure.TreeNode

class Solution1302 {

    fun deepestLeavesSum(root: TreeNode?): Int {
        if (root == null) return 0

        val heightSumMap = mutableMapOf<Int, Int>()
        calcLeafSums(root, heightSumMap, 0)

        return heightSumMap.maxBy { it.key }.value
    }

    private fun calcLeafSums(root: TreeNode, mm: MutableMap<Int, Int>, height: Int) {
        if (root.left == null && root.right == null) {
            mm[height] = mm.getOrDefault(height, 0) + root.`val`
            return
        }

        if (root.left != null) {
            calcLeafSums(root.left!!, mm, height + 1)
        }
        if (root.right != null) {
            calcLeafSums(root.right!!, mm, height + 1)
        }
    }
}
