package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _572__Subtree_of_Another_TreeTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution572().isSubtree(
            root = TreeNode(
                `val` = 3,
                left = TreeNode(
                    `val` = 4,
                    left = TreeNode(`val` = 1),
                    right = TreeNode(`val` = 2),
                ),
                right = TreeNode(`val` = 5),
            ),
            subRoot = TreeNode(
                `val` = 4,
                left = TreeNode(`val` = 1),
                right = TreeNode(`val` = 2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution572().isSubtree(
            root = TreeNode(
                `val` = 3,
                left = TreeNode(
                    `val` = 4,
                    left = TreeNode(`val` = 1),
                    right = TreeNode(
                        `val` = 2,
                        left = TreeNode(`val` = 0),
                        right = null,
                    ),
                ),
                right = TreeNode(`val` = 5),
            ),
            subRoot = TreeNode(
                `val` = 4,
                left = TreeNode(`val` = 1),
                right = TreeNode(`val` = 2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = Solution572().isSubtree(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(`val` = 1),
                right = null,
            ),
            subRoot = TreeNode(`val` = 1),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = false

        // When
        val actual = Solution572().isSubtree(
            root = TreeNode(
                `val` = 3,
                left = TreeNode(
                    `val` = 4,
                    left = TreeNode(`val` = 1),
                    right = null,
                ),
                right = TreeNode(
                    `val` = 5,
                    left = TreeNode(`val` = 2),
                    right = null,
                ),
            ),
            subRoot = TreeNode(
                `val` = 3,
                left = TreeNode(`val` = 1),
                right = TreeNode(`val` = 2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = true

        // When
        val actual = Solution572().isSubtree(
            root = TreeNode(
                `val` = 1,
                left = null,
                right = TreeNode(
                    `val` = 1,
                    left = null,
                    right = TreeNode(
                        `val` = 1,
                        left = null,
                        right = TreeNode(
                            `val` = 1,
                            left = null,
                            right = TreeNode(
                                `val` = 1,
                                left = null,
                                right = TreeNode(
                                    `val` = 1,
                                    left = null,
                                    right = TreeNode(
                                        `val` = 1,
                                        left = null,
                                        right = TreeNode(
                                            `val` = 1,
                                            left = null,
                                            right = TreeNode(
                                                `val` = 1,
                                                left = null,
                                                right = TreeNode(
                                                    `val` = 1,
                                                    left = null,
                                                    right = TreeNode(
                                                        `val` = 1,
                                                        left = TreeNode(`val` = 2),
                                                        right = null,
                                                    ),
                                                ),
                                            ),
                                        ),
                                    ),
                                ),
                            ),
                        ),
                    ),
                ),
            ),
            subRoot = TreeNode(
                `val` = 1,
                left = null,
                right = TreeNode(
                    `val` = 1,
                    left = null,
                    right = TreeNode(
                        `val` = 1,
                        left = null,
                        right = TreeNode(
                            `val` = 1,
                            left = null,
                            right = TreeNode(
                                `val` = 1,
                                left = null,
                                right = TreeNode(
                                    `val` = 1,
                                    left = TreeNode(`val` = 2),
                                    right = null,
                                ),
                            ),
                        ),
                    ),
                ),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }
}
