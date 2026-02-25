package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1302Test {

    @Test
    fun test1() {
        // Given
        val expected = 15

        // When
        val actual = Solution1302().deepestLeavesSum(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 2,
                    left = TreeNode(
                        `val` = 4,
                        left = TreeNode(
                            `val` = 7,
                            left = null,
                            right = null,
                        ),
                        right = null,
                    ),
                    right = TreeNode(
                        `val` = 5,
                        left = null,
                        right = null,
                    ),
                ),
                right = TreeNode(
                    `val` = 3,
                    left = null,
                    right = TreeNode(
                        `val` = 6,
                        left = null,
                        right = TreeNode(
                            `val` = 8,
                            left = null,
                            right = null,
                        ),
                    ),
                ),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 19

        // When
        val actual = Solution1302().deepestLeavesSum(
            root = TreeNode(
                `val` = 6,
                left = TreeNode(
                    `val` = 7,
                    left = TreeNode(
                        `val` = 2,
                        left = TreeNode(`val` = 9),
                        right = null,
                    ),
                    right = TreeNode(
                        `val` = 7,
                        TreeNode(`val` = 1),
                        TreeNode(`val` = 4),
                    ),
                ),
                right = TreeNode(
                    `val` = 8,
                    left = TreeNode(
                        `val` = 1,
                        left = null,
                        right = null,
                    ),
                    right = TreeNode(
                        `val` = 3,
                        left = null,
                        right = TreeNode(`val` = 5),
                    ),
                ),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
