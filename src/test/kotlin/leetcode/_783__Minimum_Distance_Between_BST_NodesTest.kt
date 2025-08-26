package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _783__Minimum_Distance_Between_BST_NodesTest {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = minDiffInBST(
            root =
                TreeNode(
                    `val` = 4,
                    left = TreeNode(
                        `val` = 2,
                        left = TreeNode(`val` = 1),
                        right = TreeNode(`val` = 3),
                    ),
                    right = TreeNode(`val` = 6),
                )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = minDiffInBST(
            root =
                TreeNode(
                    `val` = 1,
                    left = TreeNode(`val` = 0),
                    right = TreeNode(
                        `val` = 48,
                        left = TreeNode(`val` = 12),
                        right = TreeNode(`val` = 49),
                    ),
                )
        )

        // Then
        assertEquals(expected, actual)
    }
}
