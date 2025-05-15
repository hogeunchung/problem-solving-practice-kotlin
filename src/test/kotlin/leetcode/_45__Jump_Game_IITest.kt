package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _45__Jump_Game_IITest {

    @Test
    fun test1() {
        // Arrange
        val expected = 2

        // Act
        val actual = jump(intArrayOf(2, 3, 1, 1, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = jump(intArrayOf(2, 3, 0, 1, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 0

        // Act
        val actual = jump(intArrayOf(0))

        // Assert
        assertEquals(expected, actual)
    }
}
