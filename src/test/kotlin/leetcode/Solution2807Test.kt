package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertNull

class Solution2807Test {

    @Test
    fun test1() {
        // Given
        val expected = ListNode(
            `val` = 18,
            next = ListNode(
                `val` = 6,
                next = ListNode(
                    `val` = 6,
                    next = ListNode(
                        `val` = 2,
                        next = ListNode(
                            `val` = 10,
                            next = ListNode(
                                `val` = 1,
                                next = ListNode(
                                    `val` = 3,
                                )
                            )
                        )
                    )
                )
            )
        )

        // When
        val actual = Solution2807().insertGreatestCommonDivisors(
            head = ListNode(
                `val` = 18,
                next = ListNode(
                    `val` = 6,
                    next = ListNode(
                        `val` = 10,
                        next = ListNode(
                            `val` = 3,
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
        assertNull(expectedCurr)
        assertNull(actualCurr)
    }

    @Test
    fun test2() {
        // Given
        val expected = ListNode(`val` = 7)

        // When
        val actual = Solution2807().insertGreatestCommonDivisors(
            head = ListNode(`val` = 7)
        )

        // Then
        var expectedCurr: ListNode? = expected
        var actualCurr: ListNode? = actual
        while (expectedCurr != null && actualCurr != null) {
            assertEquals(expectedCurr.`val`, actualCurr.`val`)
            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        assertNull(expectedCurr)
        assertNull(actualCurr)
    }
}
