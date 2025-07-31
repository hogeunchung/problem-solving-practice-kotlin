package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _993__Cousins_in_Binary_TreeTest {

    @Test
    fun test1() {
        // Given
        val expected = false

        // When
        val actual = isCousins(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 2,
                    left = TreeNode(`val` = 4),
                    right = null,
                ),
                right = TreeNode(`val` = 3),
            ),
            x = 4,
            y = 3,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = isCousins(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 2,
                    left = null,
                    right = TreeNode(`val` = 4),
                ),
                right = TreeNode(
                    `val` = 3,
                    left = null,
                    right = TreeNode(`val` = 5),
                ),
            ),
            x = 5,
            y = 4,
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = isCousins(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 2,
                    left = null,
                    right = TreeNode(`val` = 4),
                ),
                right = TreeNode(`val` = 3),
            ),
            x = 2,
            y = 3,
        )

        // Then
        assertEquals(expected, actual)
    }
}
