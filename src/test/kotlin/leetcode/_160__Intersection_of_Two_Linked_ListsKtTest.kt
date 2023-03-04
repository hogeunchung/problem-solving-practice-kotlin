package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class _160__Intersection_of_Two_Linked_ListsKtTest {

    @Nested
    inner class FirstImplementation {
        @Test
        fun test1() {
            // Arrange
            val intersectHead = ListNode(8, ListNode(4, ListNode(5)))
            val aHead = ListNode(4, ListNode(1, intersectHead))
            val bHead = ListNode(5, ListNode(6, ListNode(1, intersectHead)))
            val expected = intersectHead

            // Act
            val actual = getIntersectionNode(headA = aHead, headB = bHead)

            // Assert
            assertEquals(expected, actual)
        }

        @Test
        fun test2() {
            // Arrange
            val intersectHead = ListNode(2, ListNode(4))
            val aHead = ListNode(1, ListNode(9, ListNode(1, intersectHead)))
            val bHead = ListNode(3, intersectHead)
            val expected = intersectHead

            // Act
            val actual = getIntersectionNode(headA = aHead, headB = bHead)

            // Assert
            assertEquals(expected, actual)
        }

        @Test
        fun test3() {
            // Arrange
            val aHead = ListNode(2, ListNode(6, ListNode(4)))
            val bHead = ListNode(1, ListNode(5))
            val expected = null

            // Act
            val actual = getIntersectionNode(headA = aHead, headB = bHead)

            // Assert
            assertEquals(expected, actual)
        }
    }

    @Nested
    inner class ImprovedImplementation {
        @Test
        fun test1() {
            // Arrange
            val intersectHead = ListNode(8, ListNode(4, ListNode(5)))
            val aHead = ListNode(4, ListNode(1, intersectHead))
            val bHead = ListNode(5, ListNode(6, ListNode(1, intersectHead)))
            val expected = intersectHead

            // Act
            val actual = getIntersectionNode(headA = aHead, headB = bHead)

            // Assert
            assertEquals(expected, actual)
        }

        @Test
        fun test2() {
            // Arrange
            val intersectHead = ListNode(2, ListNode(4))
            val aHead = ListNode(1, ListNode(9, ListNode(1, intersectHead)))
            val bHead = ListNode(3, intersectHead)
            val expected = intersectHead

            // Act
            val actual = getIntersectionNode(headA = aHead, headB = bHead)

            // Assert
            assertEquals(expected, actual)
        }

        @Test
        fun test3() {
            // Arrange
            val aHead = ListNode(2, ListNode(6, ListNode(4)))
            val bHead = ListNode(1, ListNode(5))
            val expected = null

            // Act
            val actual = getIntersectionNode(headA = aHead, headB = bHead)

            // Assert
            assertEquals(expected, actual)
        }
    }
}
