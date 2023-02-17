package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _70__Climbing_StairsKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = 2

        // Act
        val actual = climbStairs(2)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 3

        // Act
        val actual = climbStairs(3)

        // Assert
        assertEquals(expected, actual)
    }
}
