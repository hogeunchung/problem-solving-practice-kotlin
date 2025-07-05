package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _143__Reorder_ListTest {

    @Test
    fun test1() {
        // Given
        val nodes = listOf(
            ListNode(`val` = 1),
            ListNode(`val` = 2),
            ListNode(`val` = 3),
            ListNode(`val` = 4),
        )
        nodes[0].next = nodes[1]
        nodes[1].next = nodes[2]
        nodes[2].next = nodes[3]
        nodes[3].next = null

        val head = nodes[0]

        // When
        reorderList(head = head)

        // Then
        assertEquals(nodes[3], nodes[0].next)
        assertEquals(nodes[2], nodes[1].next)
        assertEquals(null, nodes[2].next)
        assertEquals(nodes[1], nodes[3].next)
    }

    @Test
    fun test2() {
        // Given
        val nodes = listOf(
            ListNode(`val` = 1),
            ListNode(`val` = 2),
            ListNode(`val` = 3),
            ListNode(`val` = 4),
            ListNode(`val` = 5),
        )
        nodes[0].next = nodes[1]
        nodes[1].next = nodes[2]
        nodes[2].next = nodes[3]
        nodes[3].next = nodes[4]
        nodes[4].next = null

        val head = nodes[0]

        // When
        reorderList(head = head)

        // Then
        assertEquals(nodes[4], nodes[0].next)
        assertEquals(nodes[3], nodes[1].next)
        assertEquals(null, nodes[2].next)
        assertEquals(nodes[2], nodes[3].next)
        assertEquals(nodes[1], nodes[4].next)
    }
}
