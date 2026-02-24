package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2181Test {

    @Test
    fun test1() {
        // Given
        val expected = ListNode(
            `val` = 4,
            next = ListNode(
                `val` = 11,
            )
        )

        // When
        val actual = Solution2181().mergeNodes(
            head =
                ListNode(
                    `val` = 0,
                    next = ListNode(
                        `val` = 3,
                        next = ListNode(
                            `val` = 1,
                            next = ListNode(
                                `val` = 0,
                                next = ListNode(
                                    `val` = 4,
                                    next = ListNode(
                                        `val` = 5,
                                        next = ListNode(
                                            `val` = 2,
                                            next = ListNode(
                                                `val` = 0,
                                            ),
                                        ),
                                    ),
                                ),
                            ),
                        ),
                    ),
                )
        )

        // Then
        var expectedCurr: ListNode? = expected
        var actualCurr: ListNode? = actual
        while (expectedCurr != null && actualCurr != null) {
            println("expected: $expectedCurr, actual: $actualCurr")
            assertEquals(expectedCurr.`val`, actualCurr.`val`)

            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        assertTrue(expectedCurr == null)
        assertTrue(actualCurr == null)
    }

    @Test
    fun test2() {
        // Given
        val expected = ListNode(
            `val` = 1,
            next = ListNode(
                `val` = 3,
                next = ListNode(
                    `val` = 4,
                )
            )
        )

        // When
        val actual = Solution2181().mergeNodes(
            head =
                ListNode(
                    `val` = 0,
                    next = ListNode(
                        `val` = 1,
                        next = ListNode(
                            `val` = 0,
                            next = ListNode(
                                `val` = 3,
                                next = ListNode(
                                    `val` = 0,
                                    next = ListNode(
                                        `val` = 2,
                                        next = ListNode(
                                            `val` = 2,
                                            next = ListNode(
                                                `val` = 0,
                                            ),
                                        ),
                                    ),
                                ),
                            ),
                        ),
                    ),
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
        assertTrue(expectedCurr == null)
        assertTrue(actualCurr == null)
    }
}
