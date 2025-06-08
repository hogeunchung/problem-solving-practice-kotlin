package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _83__Remove_Duplicates_from_Sorted_ListTest {

    @Test
    fun test1() {
        // Given
        val expected = ListNode(
            `val` = 1,
            next = ListNode(
                `val` = 2,
            )
        )

        // When
        val actual = deleteDuplicates(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 1,
                    next = ListNode(
                        `val` = 2,
                    )
                )
            )
        )

        // Then
        var expectedCurr: ListNode? = expected
        var actualCurr: ListNode? = actual
        while (expectedCurr != null && actualCurr != null) {
            assertEquals(expectedCurr.`val`, actualCurr.`val`)

            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        assertEquals(null, expectedCurr)
        assertEquals(null, actualCurr)
    }

    @Test
    fun test2() {
        // Given
        val expected = ListNode(
            `val` = 1,
            next = ListNode(
                `val` = 2,
                next = ListNode(
                    `val` = 3,
                )
            )
        )

        // When
        val actual = deleteDuplicates(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 1,
                    next = ListNode(
                        `val` = 2,
                        next = ListNode(
                            `val` = 3,
                            next = ListNode(
                                `val` = 3,
                            )
                        )
                    )
                )
            )
        )

        // Then
        var expectedCurr: ListNode? = expected
        var actualCurr: ListNode? = actual
        while (expectedCurr != null && actualCurr != null) {
            assertEquals(expectedCurr.`val`, actualCurr.`val`)

            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        assertEquals(null, expectedCurr)
        assertEquals(null, actualCurr)
    }

    @Test
    fun test3() {
        // Given
        val expected = ListNode(
            `val` = 1,
        )

        // When
        val actual = deleteDuplicates(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 1,
                    next = ListNode(
                        `val` = 1,
                    )
                )
            )
        )

        // Then
        var expectedCurr: ListNode? = expected
        var actualCurr: ListNode? = actual
        while (expectedCurr != null && actualCurr != null) {
            assertEquals(expectedCurr.`val`, actualCurr.`val`)

            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        assertEquals(null, expectedCurr)
        assertEquals(null, actualCurr)
    }
}
