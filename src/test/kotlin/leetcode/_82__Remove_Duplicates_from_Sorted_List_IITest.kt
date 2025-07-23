package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _82__Remove_Duplicates_from_Sorted_List_IITest {

    @Test
    fun test1() {
        // Given
        val expected = ListNode(
            `val` = 1,
            next = ListNode(
                `val` = 2,
                next = ListNode(
                    `val` = 5,
                )
            )
        )

        // When
        val actual = deleteDuplicates2(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 2,
                    next = ListNode(
                        `val` = 3,
                        next = ListNode(
                            `val` = 3,
                            next = ListNode(
                                `val` = 4,
                                next = ListNode(
                                    `val` = 4,
                                    next = ListNode(
                                        `val` = 5,
                                    )
                                )
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
            println("expected = ${expectedCurr.`val`}, actual = ${actualCurr.`val`}")

            assertEquals(expectedCurr.`val`, actualCurr.`val`)

            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        println("expected = ${expectedCurr?.`val`}, actual = ${actualCurr?.`val`}")
        assertEquals(null, expectedCurr)
        assertEquals(null, actualCurr)
    }

    @Test
    fun test2() {
        // Given
        val expected = ListNode(
            `val` = 2,
            next = ListNode(
                `val` = 3,
            )
        )

        // When
        val actual = deleteDuplicates2(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 1,
                    next = ListNode(
                        `val` = 1,
                        next = ListNode(
                            `val` = 2,
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
            println("expected = ${expectedCurr.`val`}, actual = ${actualCurr.`val`}")
            assertEquals(expectedCurr.`val`, actualCurr.`val`)

            expectedCurr = expectedCurr.next
            actualCurr = actualCurr.next
        }
        println("expected = ${expectedCurr?.`val`}, actual = ${actualCurr?.`val`}")
        assertEquals(null, expectedCurr)
        assertEquals(null, actualCurr)
    }

}
