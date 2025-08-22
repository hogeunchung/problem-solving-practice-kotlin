package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _557__Reverse_Words_in_a_String_IIITest {

    @Test
    fun test1() {
        // Given
        val expected = "s'teL ekat edoCteeL tsetnoc"

        // When
        val actual = reverseWords(s = "Let's take LeetCode contest")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "rM gniD"

        // When
        val actual = reverseWords(s = "Mr Ding")

        // Then
        assertEquals(expected, actual)
    }
}
