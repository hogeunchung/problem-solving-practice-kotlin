package leetcode

import leetcode.dataStructure.TreeNode

fun generateTrees(n: Int): List<TreeNode?> {
    return generateBinaryTress(lowerBound = 1, upperBound = n)
}

private fun generateBinaryTress(lowerBound: Int, upperBound: Int): List<TreeNode?> {
    if (lowerBound > upperBound) return listOf(null)

    val result = mutableListOf<TreeNode?>()
    for (i in lowerBound..upperBound) {
        val leftSubTrees = generateBinaryTress(lowerBound = lowerBound, upperBound = i - 1)
        val rightSubTrees = generateBinaryTress(lowerBound = i + 1, upperBound = upperBound)

        for (j in 0 until leftSubTrees.size) {
            for (k in 0 until rightSubTrees.size) {
                val root = TreeNode(i)
                root.left = leftSubTrees[j]
                root.right = rightSubTrees[k]

                result.add(root)
            }
        }
    }

    return result
}
