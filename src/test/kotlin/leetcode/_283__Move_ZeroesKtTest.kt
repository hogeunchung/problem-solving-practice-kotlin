package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _283__Move_ZeroesKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = intArrayOf(1, 3, 12, 0, 0)

        // Act
        val actual = intArrayOf(0, 1, 0, 3, 12)
        moveZeroes(actual)

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = intArrayOf(0)

        // Act
        val actual = intArrayOf(0)
        moveZeroes(actual)

        // Assert
        assertArrayEquals(expected, actual)
    }
}
