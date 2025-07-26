package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _61__Rotate_ListTest {

    @Test
    fun test1() {
        // Given
        val expected = ListNode(
            `val` = 4,
            next = ListNode(
                `val` = 5,
                next = ListNode(
                    `val` = 1,
                    next = ListNode(
                        `val` = 2,
                        next = ListNode(
                            `val` = 3,
                        ),
                    ),
                ),
            ),
        )

        // When
        val actual = rotateRight(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 2,
                    next = ListNode(
                        `val` = 3,
                        next = ListNode(
                            `val` = 4,
                            next = ListNode(
                                `val` = 5,
                            ),
                        ),
                    ),
                ),
            ),
            k = 2,
        )

        // Then
        var expectedCurr: ListNode? = expected
        var actualCurr: ListNode? = actual
        while (expectedCurr != null && actualCurr != null) {
            assertEquals(expectedCurr.`val`, actualCurr.`val`)

            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        assertTrue(expectedCurr == null && actualCurr == null)
    }

    @Test
    fun test2() {
        // Given
        val expected = ListNode(
            `val` = 2,
            next = ListNode(
                `val` = 0,
                next = ListNode(
                    `val` = 1,
                ),
            ),
        )

        // When
        val actual = rotateRight(
            head = ListNode(
                `val` = 0,
                next = ListNode(
                    `val` = 1,
                    next = ListNode(
                        `val` = 2,
                    ),
                ),
            ),
            k = 4,
        )

        // Then
        var expectedCurr: ListNode? = expected
        var actualCurr: ListNode? = actual
        while (expectedCurr != null && actualCurr != null) {
            assertEquals(expectedCurr.`val`, actualCurr.`val`)

            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        assertTrue(expectedCurr == null && actualCurr == null)
    }
}
