package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _145__Binary_Tree_Postorder_TraversalTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(3, 2, 1)

        // When
        val actual = postorderTraversal(
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
        val expected = listOf(4, 6, 7, 5, 2, 9, 8, 3, 1)

        // When
        val actual = postorderTraversal(
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
