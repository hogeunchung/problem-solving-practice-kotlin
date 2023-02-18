package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _118__Pascal_s_TriangleKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1), listOf(1, 3, 3, 1), listOf(1, 4, 6, 4, 1))

        // Act
        val actual = generate(5)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = listOf(listOf(1))

        // Act
        val actual = generate(1)

        // Assert
        assertEquals(expected, actual)
    }
}
