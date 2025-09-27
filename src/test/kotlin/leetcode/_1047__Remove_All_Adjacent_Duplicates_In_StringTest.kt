package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1047__Remove_All_Adjacent_Duplicates_In_StringTest {

    @Test
    fun test1() {
        // Given
        val expected = "ca"

        // When
        val actual = removeDuplicates(s = "abbaca")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "ay"

        // When
        val actual = removeDuplicates(s = "azxxzy")

        // Then
        assertEquals(expected, actual)
    }
}
