package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class _104__Maximum_Depth_of_Binary_TreeKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 3

        // Act
        val actual = maxDepth(root = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = maxDepth(root = TreeNode(1, null, TreeNode(2)))

        // Assert
        assertEquals(expected, actual)
    }
}
