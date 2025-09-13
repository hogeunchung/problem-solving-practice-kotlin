package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1961__Check_If_String_Is_a_Prefix_of_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isPrefixString(s = "iloveleetcode", words = arrayOf("i", "love", "leetcode", "apples"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = isPrefixString(s = "iloveleetcode", words = arrayOf("apples", "i", "love", "leetcode"))

        // Then
        assertEquals(expected, actual)
    }
}
