package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _257__Binary_Tree_PathsTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf("1->2->5", "1->3")

        // When
        val actual = binaryTreePaths(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 2,
                    left = null,
                    right = TreeNode(`val` = 5)
                ),
                right = TreeNode(`val` = 3)
            )
        )

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf("1")

        // When
        val actual = binaryTreePaths(
            root = TreeNode(`val` = 1)
        )

        // Then
        assertTrue(expected.containsAll(actual))
        assertTrue(actual.containsAll(expected))
    }
}
