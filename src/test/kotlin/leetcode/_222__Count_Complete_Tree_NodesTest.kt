package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _222__Count_Complete_Tree_NodesTest {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val input = TreeNode(
            `val` = 1,
            TreeNode(
                `val` = 2,
                left = TreeNode(`val` = 4),
                right = TreeNode(`val` = 5),
            ),
            TreeNode(
                `val` = 3,
                left = TreeNode(`val` = 6),
                right = null,
            )
        )
        val actual = countNodes(root = input)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val input = null
        val actual = countNodes(root = input)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val input = TreeNode(`val` = 1)
        val actual = countNodes(root = input)

        // Then
        assertEquals(expected, actual)
    }
}
