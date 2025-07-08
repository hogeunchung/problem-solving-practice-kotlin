package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _543__Diameter_of_Binary_TreeTest {

    @Test
    fun test1() {
        // Given
        val root = TreeNode(
            `val` = 1,
            left = TreeNode(
                `val` = 2,
                left = TreeNode(`val` = 4),
                right = TreeNode(`val` = 5),
            ),
            right = TreeNode(`val` = 3),
        )

        val expected = 3

        // When
        val actual = diameterOfBinaryTree(root = root)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val root = TreeNode(
            `val` = 1,
            left = TreeNode(`val` = 2),
        )

        val expected = 1

        // When
        val actual = diameterOfBinaryTree(root = root)

        // Then
        assertEquals(expected, actual)
    }

}
