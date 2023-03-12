package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _111__Minimum_Depth_of_Binary_TreeKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 2

        // Act
        val actual = minDepth(
            root =
            TreeNode(
                3,
                TreeNode(9),
                TreeNode(
                    20,
                    TreeNode(15),
                    TreeNode(7)
                )
            )
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 5

        // Act
        val actual = minDepth(
            root =
            TreeNode(
                2,
                null,
                TreeNode(
                    3,
                    null,
                    TreeNode(
                        4,
                        null,
                        TreeNode(
                            5,
                            null,
                            TreeNode(6)
                        )
                    )
                )
            )
        )

        // Assert
        assertEquals(expected, actual)
    }
}
