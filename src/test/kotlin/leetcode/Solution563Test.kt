package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution563Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution563().findTilt(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(`val` = 2),
                right = TreeNode(`val` = 3),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 15

        // When
        val actual = Solution563().findTilt(
            root = TreeNode(
                `val` = 4,
                left = TreeNode(
                    `val` = 2,
                    left = TreeNode(`val` = 3),
                    right = TreeNode(`val` = 5),
                ),
                right = TreeNode(
                    `val` = 9,
                    left = null,
                    right = TreeNode(`val` = 7),
                ),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 9

        // When
        val actual = Solution563().findTilt(
            root = TreeNode(
                `val` = 21,
                left = TreeNode(
                    `val` = 7,
                    left = TreeNode(
                        `val` = 1,
                        left = TreeNode(`val` = 3),
                        right = TreeNode(`val` = 3),
                    ),
                    right = TreeNode(`val` = 1),
                ),
                right = TreeNode(
                    `val` = 14,
                    left = TreeNode(`val` = 2),
                    right = TreeNode(`val` = 2),
                ),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
