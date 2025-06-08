package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _344__Reverse_StringKtTest {

    @Test
    fun test1() {
        // Given
        val expected = "olleh".toCharArray()

        // When
        val actual = "hello".toCharArray()
        reverseString(s = actual)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "hannaH".toCharArray()

        // When
        val actual = "Hannah".toCharArray()
        reverseString(s = actual)

        // Then
        assertArrayEquals(expected, actual)
    }
}
