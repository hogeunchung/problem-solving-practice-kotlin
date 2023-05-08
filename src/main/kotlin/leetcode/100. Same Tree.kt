package leetcode

import leetcode.dataStructure.TreeNode

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    val stackP = mutableListOf<TreeNode?>()
    val stackQ = mutableListOf<TreeNode?>()

    stackP.add(p)
    stackQ.add(q)

    var size = 1
    while (size > 0) {
        val currP = stackP.removeAt(size - 1)
        val currQ = stackQ.removeAt(size - 1)
        size--

        when {
            currP == null && currQ == null -> Unit
            currP != null && currQ == null -> return false
            currP == null && currQ != null -> return false
            currP != null && currQ != null -> {
                if (currP.`val` != currQ.`val`) return false

                stackP.add(currP.left)
                stackP.add(currP.right)
                stackQ.add(currQ.left)
                stackQ.add(currQ.right)

                size += 2
            }
        }
    }

    return true
}
