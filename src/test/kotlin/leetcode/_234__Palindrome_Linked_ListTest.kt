package leetcode

import leetcode.dataStructure.ListNode
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _234__Palindrome_Linked_ListTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isPalindrome(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 2,
                    next = ListNode(
                        `val` = 2,
                        next = ListNode(
                            `val` = 1,
                        )
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
        val expected = false

        // When
        val actual = isPalindrome(
            head = ListNode(
                `val` = 1,
                next = ListNode(
                    `val` = 2,
                )
            )
        )

        // Then
        assertEquals(expected, actual)
    }
}
