package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _55__Jump_GameTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = canJump(intArrayOf(2, 3, 1, 1, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = false

        // Act
        val actual = canJump(intArrayOf(3, 2, 1, 0, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = true

        // Act
        val actual = canJump(intArrayOf(2, 0))

        // Assert
        assertEquals(expected, actual)
    }
}
