package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _110__Balanced_Binary_TreeTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
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

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
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

        // Then
        assertEquals(expected, actual)
    }
}
