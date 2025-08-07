package leetcode

import leetcode.dataStructure.TreeNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _113__Path_Sum_IITest {

    @Test
    fun test1() {
        // Given
        val root = TreeNode(
            `val` = 5,
            left = TreeNode(
                `val` = 4,
                left = TreeNode(
                    `val` = 11,
                    left = TreeNode(`val` = 7),
                    right = TreeNode(`val` = 2),
                ),
                right = null,
            ),
            right = TreeNode(
                `val` = 8,
                left = TreeNode(`val` = 13),
                right = TreeNode(
                    `val` = 4,
                    left = TreeNode(`val` = 5),
                    right = TreeNode(`val` = 1),
                )
            )
        )
        val targetSum = 22
        val expected = listOf(listOf(5, 4, 11, 2), listOf(5, 8, 4, 5))

        // When
        val actual = pathSum(root = root, targetSum = targetSum)

        // Then
        assertEquals(expected.size, actual.size)
        for (i in 0 until expected.size) {
            assertArrayEquals(expected[i].toIntArray(), actual[i].toIntArray())
        }
    }

    @Test
    fun test2() {
        // Given
        val root = TreeNode(
            `val` = 1,
            left = TreeNode(`val` = 2),
            right = TreeNode(`val` = 3)
        )
        val targetSum = 5
        val expected = emptyList<List<Int>>()

        // When
        val actual = pathSum(root = root, targetSum = targetSum)

        // Then
        assertEquals(expected.size, actual.size)
        for (i in 0 until expected.size) {
            assertArrayEquals(expected[i].toIntArray(), actual[i].toIntArray())
        }
    }
}
