package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _637__Average_of_Levels_in_Binary_TreeTest {

    @Test
    fun test1() {
        // Arrange
        val expected = doubleArrayOf(3.00000, 14.50000, 11.00000)
        // Act
        val actual = averageOfLevels(
            root = TreeNode(
                `val` = 3,
                left = TreeNode(`val` = 9),
                right = TreeNode(
                    `val` = 20,
                    left = TreeNode(`val` = 15),
                    right = TreeNode(`val` = 7),
                ),
            )
        )

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = doubleArrayOf(3.00000, 14.50000, 11.00000)
        // Act
        val actual = averageOfLevels(
            root = TreeNode(
                `val` = 3,
                left = TreeNode(
                    `val` = 9,
                    left = TreeNode(`val` = 15),
                    right = TreeNode(`val` = 7),
                ),
                right = TreeNode(
                    `val` = 20,
                ),
            )
        )

        // Assert
        assertArrayEquals(expected, actual)
    }
}
