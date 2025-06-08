package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _101__Symmetric_TreeKtTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isSymmetric(
            root = TreeNode(
                1,
                TreeNode(2, TreeNode(3), TreeNode(4)),
                TreeNode(2, TreeNode(4), TreeNode(3)),
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
        val actual = isSymmetric(
            root = TreeNode(
                1,
                TreeNode(2, null, TreeNode(3)),
                TreeNode(2, null, TreeNode(3)),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
