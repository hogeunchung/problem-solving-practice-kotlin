package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _104__Maximum_Depth_of_Binary_TreeKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val actual = maxDepth(root = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = maxDepth(root = TreeNode(1, null, TreeNode(2)))

        // Then
        assertEquals(expected, actual)
    }
}
