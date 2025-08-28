package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _617__Merge_Two_Binary_TreesTest {

    @Test
    fun test1() {
        // Given
        val expected = TreeNode(
            `val` = 3,
            left = TreeNode(
                `val` = 4,
                left = TreeNode(`val` = 5),
                right = TreeNode(`val` = 4),
            ),
            right = TreeNode(
                `val` = 5,
                left = null,
                right = TreeNode(`val` = 7),
            ),
        )

        // When
        val actual = mergeTrees(
            root1 = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 3,
                    left = TreeNode(`val` = 5),
                    right = null,
                ),
                right = TreeNode(`val` = 2),
            ),
            root2 = TreeNode(
                `val` = 2,
                left = TreeNode(
                    `val` = 1,
                    left = null,
                    right = TreeNode(`val` = 4),
                ),
                right = TreeNode(
                    `val` = 3,
                    left = null,
                    right = TreeNode(`val` = 7),
                ),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = TreeNode(
            `val` = 2,
            left = TreeNode(`val` = 2),
            right = null,
        )

        // When
        val actual = mergeTrees(
            root1 = TreeNode(`val` = 1),
            root2 = TreeNode(
                `val` = 1,
                left = TreeNode(`val` = 2),
                right = null,
            ),
        )

        // Then
        assertEquals(expected, actual)
    }
}
