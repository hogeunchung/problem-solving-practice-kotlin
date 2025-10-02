package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution501Test {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2)

        // When
        val actual = Solution501().findMode(
            root = TreeNode(
                `val` = 1,
                left = null,
                right = TreeNode(
                    `val` = 2,
                    left = TreeNode(`val` = 2),
                    right = null,
                )
            )
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(0)

        // When
        val actual = Solution501().findMode(
            root = TreeNode(`val` = 0)
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
