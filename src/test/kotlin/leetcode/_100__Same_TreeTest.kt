package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _100__Same_TreeTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isSameTree(
            p = TreeNode(
                `val` = 1,
                left = TreeNode(2),
                right = TreeNode(3),
            ),
            q = TreeNode(
                `val` = 1,
                left = TreeNode(2),
                right = TreeNode(3),
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
        val actual = isSameTree(
            p = TreeNode(
                `val` = 1,
                left = TreeNode(2),
                right = null,
            ),
            q = TreeNode(
                `val` = 1,
                left = null,
                right = TreeNode(2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = isSameTree(
            p = TreeNode(
                `val` = 1,
                left = TreeNode(2),
                right = TreeNode(1),
            ),
            q = TreeNode(
                `val` = 1,
                left = TreeNode(1),
                right = TreeNode(2),
            ),
        )

        // Then
        assertEquals(expected, actual)
    }
}
