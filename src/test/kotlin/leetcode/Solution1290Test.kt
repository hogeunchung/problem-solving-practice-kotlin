package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1290Test {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = Solution1290().getDecimalValue(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 0,
                    next = ListNode(
                        `val` = 1,
                    )
                )
            )
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution1290().getDecimalValue(
            head = ListNode(
                `val` = 0,
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
