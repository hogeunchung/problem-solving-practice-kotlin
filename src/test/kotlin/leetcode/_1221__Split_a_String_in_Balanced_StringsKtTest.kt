package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _1221__Split_a_String_in_Balanced_StringsKtTest {
    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = balancedStringSplit(s = "RLRRLLRLRL")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = balancedStringSplit(s = "RLRRRLLRLL")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = balancedStringSplit(s = "LLLLRRRR")

        // Then
        assertEquals(expected, actual)
    }
}
