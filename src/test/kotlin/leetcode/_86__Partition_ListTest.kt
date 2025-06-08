package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _86__Partition_ListTest {

    @Test
    fun test1() {
        // Given
        var expected: ListNode? = ListNode(1, ListNode(2, ListNode(2, ListNode(4, ListNode(3, ListNode(5))))))

        var actual: ListNode? = partition(
            head = ListNode(1, ListNode(4, ListNode(3, ListNode(2, ListNode(5, ListNode(2)))))),
            x = 3,
        )
        // Then
        while (expected != null && actual != null) {
            assertEquals(expected.`val`, actual.`val`)

            expected = expected.next
            actual = actual.next
        }
        if (expected != null || actual != null) {
            assert(false)
        }
    }

    @Test
    fun test2() {
        // Given
        var expected: ListNode? = ListNode(1, ListNode(2))

        // When
        var actual: ListNode? = partition(
            head = ListNode(2, ListNode(1)),
            x = 2,
        )

        // Then
        while (expected != null && actual != null) {
            assertEquals(expected.`val`, actual.`val`)

            expected = expected.next
            actual = actual.next
        }
        if (expected != null || actual != null) {
            assert(false)
        }
    }
}
