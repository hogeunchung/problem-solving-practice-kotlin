package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _965__Univalued_Binary_TreeTest {

    @Test
    fun test1() {
        // Given
        val root = TreeNode(
            `val` = 1,
            left = TreeNode(
                `val` = 1,
                left = TreeNode(`val` = 1),
                right = TreeNode(`val` = 1),
            ),
            right = TreeNode(
                `val` = 1,
                left = null,
                right = TreeNode(`val` = 1),
            )
        )
        val expected = true

        // When
        val actual = isUnivalTree(root = root)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val root = TreeNode(
            `val` = 2,
            left = TreeNode(
                `val` = 2,
                left = TreeNode(`val` = 5),
                right = TreeNode(`val` = 2),
            ),
            right = TreeNode(`val` = 2)
        )
        val expected = false

        // When
        val actual = isUnivalTree(root = root)

        // Then
        assertEquals(expected, actual)
    }
}
