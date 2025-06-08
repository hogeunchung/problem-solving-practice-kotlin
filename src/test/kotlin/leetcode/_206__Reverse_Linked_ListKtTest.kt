package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _206__Reverse_Linked_ListKtTest {

    @Test
    fun test1() {
        // Given
        var expected: ListNode? = ListNode(5, ListNode(4, ListNode(3, ListNode(2, ListNode(1)))))

        // When
        var actual: ListNode? = reverseList(head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))))

        // Then
        while (expected != null && actual != null) {
            assertEquals(expected.`val`, actual.`val`)

            expected = expected.next
            actual = actual.next
        }

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        var expected: ListNode? = ListNode(2, ListNode(1))

        // When
        var actual: ListNode? = reverseList(head = ListNode(1, ListNode(2)))

        // Then
        while (expected != null && actual != null) {
            assertEquals(expected.`val`, actual.`val`)

            expected = expected.next
            actual = actual.next
        }

        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        var expected: ListNode? = null

        // When
        var actual: ListNode? = reverseList(head = null)

        // Then
        while (expected != null && actual != null) {
            assertEquals(expected.`val`, actual.`val`)

            expected = expected.next
            actual = actual.next
        }

        assertEquals(expected, actual)
    }
}
