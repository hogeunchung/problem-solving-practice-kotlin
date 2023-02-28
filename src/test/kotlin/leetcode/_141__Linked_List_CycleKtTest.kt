package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _141__Linked_List_CycleKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val nodes = listOf(ListNode(3), ListNode(2), ListNode(0), ListNode(-4))
        nodes[0].next = nodes[1]
        nodes[1].next = nodes[2]
        nodes[2].next = nodes[3]
        nodes[3].next = nodes[1]
        val actual = hasCycle(head = nodes[0])

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = true

        // Act
        val nodes = listOf(ListNode(1), ListNode(2))
        nodes[0].next = nodes[1]
        nodes[1].next = nodes[0]
        val actual = hasCycle(head = nodes[0])

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = false

        // Act
        val nodes = listOf(ListNode(1))
        val actual = hasCycle(head = nodes[0])

        // Assert
        assertEquals(expected, actual)
    }
}
