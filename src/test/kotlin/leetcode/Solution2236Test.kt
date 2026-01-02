package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2236Test {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = Solution2236().checkTree(
            root = TreeNode(
                `val` = 10,
                left = TreeNode(`val` = 4),
                right = TreeNode(`val` = 6),
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = Solution2236().checkTree(
            root = TreeNode(
                `val` = 5,
                left = TreeNode(`val` = 3),
                right = TreeNode(`val` = 1),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
