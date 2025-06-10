package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _144__Binary_Tree_Preorder_TraversalTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(1, 2, 3)

        // When
        val actual = preorderTraversal(
            root = TreeNode(
                `val` = 1,
                left = null,
                right = TreeNode(
                    `val` = 2,
                    left = TreeNode(`val` = 3),
                    right = null,
                )
            )
        )

        // Then
        assertEquals(expected, actual)
    }


    @Test
    fun test2() {
        // Given
        val expected = listOf(1, 2, 4, 5, 6, 7, 3, 8, 9)

        // When
        val actual = preorderTraversal(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 2,
                    left = TreeNode(`val` = 4),
                    right = TreeNode(
                        `val` = 5,
                        left = TreeNode(`val` = 6),
                        right = TreeNode(`val` = 7),
                    ),
                ),
                right = TreeNode(
                    `val` = 3,
                    left = null,
                    right = TreeNode(
                        `val` = 8,
                        left = TreeNode(
                            `val` = 9,
                        ),
                        right = null,
                    ),
                )
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
