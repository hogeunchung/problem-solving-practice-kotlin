package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _95__Unique_Binary_Search_Trees_IITest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(
            TreeNode(
                `val` = 1,
                left = null,
                right = TreeNode(
                    `val` = 3,
                    left = TreeNode(
                        `val` = 2,
                        left = null,
                        right = null,
                    ),
                    right = null,
                )
            ),
            TreeNode(
                `val` = 1,
                left = null,
                right = TreeNode(
                    `val` = 2,
                    left = null,
                    right = TreeNode(
                        `val` = 3,
                        left = null,
                        right = null,
                    ),
                )
            ),
            TreeNode(
                `val` = 2,
                left = TreeNode(
                    `val` = 1,
                    left = null,
                    right = null,
                ),
                right = TreeNode(
                    `val` = 3,
                    left = null,
                    right = null,
                )
            ),
            TreeNode(
                `val` = 3,
                left = TreeNode(
                    `val` = 2,
                    left = TreeNode(
                        `val` = 1,
                        left = null,
                        right = null,
                    ),
                    right = null,
                ),
                right = null,
            ),
            TreeNode(
                `val` = 3,
                left = TreeNode(
                    `val` = 1,
                    left = null,
                    right = TreeNode(
                        `val` = 2,
                        left = null,
                        right = null,
                    ),
                ),
                right = null,
            ),
        )

        // When
        val actual = generateTrees(n = 3)

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(
            TreeNode(
                `val` = 1,
                left = null,
                right = null,
            )
        )

        // When
        val actual = generateTrees(n = 1)

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }
}
