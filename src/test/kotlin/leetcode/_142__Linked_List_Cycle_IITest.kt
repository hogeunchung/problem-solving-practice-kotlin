package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _142__Linked_List_Cycle_IITest {

    @Test
    fun test1() {
        // Given
        val nodes = listOf(
            ListNode(`val` = 3),
            ListNode(`val` = 2),
            ListNode(`val` = 0),
            ListNode(`val` = -4),
        )
        nodes[0].next = nodes[1]
        nodes[1].next = nodes[2]
        nodes[2].next = nodes[3]
        nodes[3].next = nodes[1]
        val head = nodes[0]
        val expected = nodes[1]

        // When
        val actual = detectCycle(head = head)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val nodes = listOf(
            ListNode(`val` = 1),
            ListNode(`val` = 2),
        )
        nodes[0].next = nodes[1]
        nodes[1].next = nodes[0]
        val head = nodes[0]
        val expected = nodes[0]

        // When
        val actual = detectCycle(head = head)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val nodes = listOf(
            ListNode(`val` = 1),
        )
        nodes[0].next = null
        val head = nodes[0]
        val expected = null

        // When
        val actual = detectCycle(head = head)

        // Then
        assertEquals(expected, actual)
    }
}
