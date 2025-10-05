package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution653Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution653().findTarget(
            root = TreeNode(
                `val` = 5,
                left = TreeNode(
                    `val` = 3,
                    left = TreeNode(`val` = 2),
                    right = TreeNode(`val` = 4),
                ),
                right = TreeNode(
                    `val` = 6,
                    left = null,
                    right = TreeNode(`val` = 7),
                ),
            ),
            k = 9,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution653().findTarget(
            root = TreeNode(
                `val` = 5,
                left = TreeNode(
                    `val` = 3,
                    left = TreeNode(`val` = 2),
                    right = TreeNode(`val` = 4),
                ),
                right = TreeNode(
                    `val` = 6,
                    left = null,
                    right = TreeNode(`val` = 7),
                ),
            ),
            k = 28,
        )

        // Then
        assertEquals(expected, actual)
    }
}
