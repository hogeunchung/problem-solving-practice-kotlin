package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1309__Decrypt_String_from_Alphabet_to_Integer_MappingTest {

    @Test
    fun test1() {
        // Given
        val expected = "jkab"

        // When
        val actual = freqAlphabets(s = "10#11#12")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "acz"

        // When
        val actual = freqAlphabets(s = "1326#")

        // Then
        assertEquals(expected, actual)
    }
}
