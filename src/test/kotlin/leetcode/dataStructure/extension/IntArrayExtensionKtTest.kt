package leetcode.dataStructure.extension

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IntArrayExtentionKtTest {

    @Test
    fun toListNodes() {
        // Arrange
        val expected = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6))))))

        // Act
        val actual = intArrayOf(1, 2, 3, 4, 5, 6).toListNodes()

        // Assert
        assertEquals(expected, actual)
    }
}
