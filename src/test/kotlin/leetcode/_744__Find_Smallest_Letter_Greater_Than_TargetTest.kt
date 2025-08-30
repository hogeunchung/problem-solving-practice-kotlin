package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _744__Find_Smallest_Letter_Greater_Than_TargetTest {

    @Test
    fun test1() {
        // Given
        val expected = 'c'

        // When
        val actual = nextGreatestLetter(letters = charArrayOf('c', 'f', 'j'), target = 'a')

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 'f'

        // When
        val actual = nextGreatestLetter(letters = charArrayOf('c', 'f', 'j'), target = 'c')

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 'x'

        // When
        val actual = nextGreatestLetter(letters = charArrayOf('x', 'x', 'y', 'y'), target = 'z')

        // Then
        assertEquals(expected, actual)
    }
}
