package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _389__Find_the_DifferenceTest {

    @Test
    fun test1() {
        // Given
        val expected = 'e'

        // When
        val actual = findTheDifference(s = "abcd", t = "abcde")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 'y'

        // When
        val actual = findTheDifference(s = "", t = "y")

        // Then
        assertEquals(expected, actual)
    }
}
