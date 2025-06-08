package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _242__Valid_AnagramKtTest {
    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isAnagram(
            s = "anagram",
            t = "nagaram"
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = isAnagram(
            s = "rat",
            t = "car"
        )

        // Then
        assertEquals(expected, actual)
    }
}
