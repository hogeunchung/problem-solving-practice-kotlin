package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _872__Leaf_Similar_TreesTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = leafSimilar(
            root1 = TreeNode(
                `val` = 3,
                left = TreeNode(
                    `val` = 5,
                    left = TreeNode(`val` = 6),
                    right = TreeNode(
                        `val` = 2,
                        left = TreeNode(`val` = 7),
                        right = TreeNode(`val` = 4),
                    ),
                ),
                right = TreeNode(
                    `val` = 1,
                    left = TreeNode(`val` = 9),
                    right = TreeNode(`val` = 8),
                )
            ),
            root2 = TreeNode(
                `val` = 3,
                left = TreeNode(
                    `val` = 5,
                    left = TreeNode(`val` = 6),
                    right = TreeNode(`val` = 7),
                ),
                right = TreeNode(
                    `val` = 1,
                    left = TreeNode(`val` = 4),
                    right = TreeNode(
                        `val` = 2,
                        left = TreeNode(`val` = 9),
                        right = TreeNode(`val` = 8),
                    ),
                )
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
        val actual = leafSimilar(
            root1 = TreeNode(
                `val` = 1,
                left = TreeNode(`val` = 2),
                right = TreeNode(`val` = 3)
            ),
            root2 = TreeNode(
                `val` = 1,
                left = TreeNode(`val` = 3),
                right = TreeNode(`val` = 2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }
}
