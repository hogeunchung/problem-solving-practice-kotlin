package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _226__Invert_Binary_TreeKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = TreeNode(
            `val` = 4,
            TreeNode(
                `val` = 7,
                left = TreeNode(`val` = 9), right = TreeNode(`val` = 6)
            ),
            TreeNode(
                `val` = 2,
                left = TreeNode(`val` = 3), right = TreeNode(`val` = 1)
            )
        )

        // Act
        val input = TreeNode(
            `val` = 4,
            TreeNode(
                `val` = 2,
                left = TreeNode(`val` = 1), right = TreeNode(`val` = 3)
            ),
            TreeNode(
                `val` = 7,
                left = TreeNode(`val` = 6), right = TreeNode(`val` = 9)
            )
        )
        val actual = invertTree(root = input)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = TreeNode(
            `val` = 2,
            TreeNode(`val` = 1),
            TreeNode(`val` = 3)
        )

        // Act
        val input = TreeNode(
            `val` = 2,
            TreeNode(`val` = 3),
            TreeNode(`val` = 1)
        )
        val actual = invertTree(root = input)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = null

        // Act
        val input = null
        val actual = invertTree(root = input)

        // Assert
        assertEquals(expected, actual)
    }
}
