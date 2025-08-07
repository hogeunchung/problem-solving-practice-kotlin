package leetcode

import leetcode.dataStructure.TreeNode

fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
    val path = mutableListOf<Int>()
    val validPaths = mutableListOf<List<Int>>()

    helper(
        root = root,
        targetSum = targetSum,
        path = path,
        validPaths = validPaths,
    )

    return validPaths
}

private fun helper(root: TreeNode?, targetSum: Int, path: MutableList<Int>, validPaths: MutableList<List<Int>>) {
    if (root == null) return
    if (root.left == null && root.right == null) {
        if (path.sum() + root.`val` == targetSum) {
            validPaths.add(path + root.`val`)
        }
        return
    }

    path.add(root.`val`)

    helper(
        root = root.left,
        targetSum = targetSum,
        path = path,
        validPaths = validPaths,
    )
    helper(
        root = root.right,
        targetSum = targetSum,
        path = path,
        validPaths = validPaths,
    )

    path.removeLast()
}
