package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _404__Sum_of_Left_LeavesTest {

    @Test
    fun test1() {
        // Given
        val expected = 24

        // When
        val actual = sumOfLeftLeaves(
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

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = sumOfLeftLeaves(
            root = TreeNode(`val` = 1)
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 4

        // When
        val actual = sumOfLeftLeaves(
            root = TreeNode(
                `val` = 1,
                left = TreeNode(
                    `val` = 2,
                    left = TreeNode(`val` = 4),
                    right = TreeNode(`val` = 5),
                ),
                right = TreeNode(`val` = 3),
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
