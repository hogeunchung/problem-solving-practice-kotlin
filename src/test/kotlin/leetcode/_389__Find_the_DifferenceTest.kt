package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _389__Find_the_DifferenceTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 'e'

        // Act
        val actual = findTheDifference(s = "abcd", t = "abcde")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 'y'

        // Act
        val actual = findTheDifference(s = "", t = "y")

        // Assert
        assertEquals(expected, actual)
    }
}
