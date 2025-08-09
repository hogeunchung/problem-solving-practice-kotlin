package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _112__Path_Sum {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = hasPathSum(
            root = TreeNode(
                `val` = 5,
                left = TreeNode(
                    `val` = 4,
                    left = TreeNode(
                        `val` = 11,
                        left = TreeNode(`val` = 7),
                        right = TreeNode(`val` = 2),
                    ),
                    right = null,
                ),
                right = TreeNode(
                    `val` = 8,
                    left = TreeNode(`val` = 13),
                    right = TreeNode(
                        `val` = 4,
                        left = null,
                        right = TreeNode(`val` = 1),
                    ),
                ),
            ),
            targetSum = 22,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = hasPathSum(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(`val` = 2),
                right = TreeNode(`val` = 3),
            ),
            targetSum = 5,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = hasPathSum(
            root = null,
            targetSum = 0,
        )

        // Then
        assertEquals(expected, actual)
    }
}
