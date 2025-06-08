package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _1929__Concatenation_of_ArrayKtTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(1, 2, 1, 1, 2, 1)

        // When
        val actual = getConcatenation(nums = intArrayOf(1, 2, 1))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(1, 3, 2, 1, 1, 3, 2, 1)

        // When
        val actual = getConcatenation(nums = intArrayOf(1, 3, 2, 1))

        // Then
        assertArrayEquals(expected, actual)
    }
}
