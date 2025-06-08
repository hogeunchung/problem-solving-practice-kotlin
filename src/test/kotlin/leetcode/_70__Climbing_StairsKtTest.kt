package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _70__Climbing_StairsKtTest {
    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = climbStairs(2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = climbStairs(3)

        // Then
        assertEquals(expected, actual)
    }
}
