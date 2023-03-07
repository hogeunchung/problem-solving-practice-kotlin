package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _108__Convert_Sorted_Array_to_Binary_Search_TreeKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = TreeNode(0, TreeNode(-10, null, TreeNode(-3)), TreeNode(5, null, TreeNode(9)))

        // Act
        val actual = sortedArrayToBST(nums = intArrayOf(-10, -3, 0, 5, 9))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = TreeNode(1, null, TreeNode(3))

        // Act
        val actual = sortedArrayToBST(nums = intArrayOf(1, 3))

        // Assert
        assertEquals(expected, actual)
    }
}
