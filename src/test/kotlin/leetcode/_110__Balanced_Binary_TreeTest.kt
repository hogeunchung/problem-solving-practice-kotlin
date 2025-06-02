package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _110__Balanced_Binary_TreeTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = isBalanced(
            root = TreeNode(
                `val` = 3,
                left = TreeNode(`val` = 9),
                right = TreeNode(
                    `val` = 20,
                    left = TreeNode(`val` = 15),
                    right = TreeNode(`val` = 7),
                )
            )
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = false

        // Act
        val actual = isBalanced(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 2,
                    left = TreeNode(
                        `val` = 3,
                        left = TreeNode(`val` = 4),
                        right = TreeNode(`val` = 4),
                    ),
                    right = TreeNode(`val` = 3)
                ),
                right = TreeNode(`val` = 2)
            )
        )

        // Assert
        assertEquals(expected, actual)
    }
}
